package com.springboot.students.University.Business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.springboot.students.University.DataAccess.IStudentDal;
import com.springboot.students.University.DataAccess.IUniversityDal;
import com.springboot.students.University.Entities.Student;
import com.springboot.students.University.Entities.University;
import com.springboot.students.University.Entities.UniversityModel;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentManager implements IStudentService {

	private IStudentDal studentDal;
	private IUniversityDal universityDal;
	@Autowired
	public StudentManager(IStudentDal studentDal,IUniversityDal universityDal) {
		
		this.studentDal = studentDal;
		this.universityDal=universityDal;
	}

	@Override
	@Transactional
	public List<Student> getAll() {
		
		return this.studentDal.getAll();
	}

	@Override
	@Transactional
	public void add(Student student) {
		//öğrenci ekleme isteği gelir.
		//gelen  university değeri sizin universities tablonuzdak api_id
		//kısmında kayıtlı değil ise
	//	o id json dosyada var mı diye bakılır
		//var ise oradan bilgileri alıp üniversiteyi oluşturulur.
		//yoksa üniversite bulunamadı hatası döndürülür.
		
		
		
		University university=universityDal.universitegetir(student.getUniversity_id());
		//veri tabanında yok ise
		if(university==null)
		{
			//
			
			
			 DefaultHttpClient httpClient = null;
		     try {
		         httpClient = new DefaultHttpClient();
		         HttpResponse response = getResponse("https://gitlab.com/kodiasoft/intern/2019/snippets/1859421/raw", httpClient);
		         String outPut = readData(response);
		        // System.out.println(outPut);
		         Gson gson = new Gson();
		         List<UniversityModel> fromJson = gson.fromJson(outPut, new TypeToken<List<UniversityModel>>(){}.getType());
		       
		         
		         for(UniversityModel universitymodel : fromJson){
		        	 //json dosyasında üniversite var ise 
		        	 //veri tabanına üniversiteyi ekle
		     		if(universitymodel.getId()==student.getUniversity_id()) 
		     		{
		     			
		     			
		     			  SimpleDateFormat tarihformat = new SimpleDateFormat("yyyy-MM-dd");
		     		    
		     			String tarih=universitymodel.getFounded_at()+"-01-01";
		     			Date kayittarih=tarihformat.parse(tarih);
		     			String ogrencitarih=student.getCreated_at()+"";
		     			 Date tarihler = new Date();
		     			student.setCreated_at(tarihler);
		     			student.setUpdated_at(tarihler);
		     			//student.setStarted_at(tarihler);
		     			
		     			
		     			
		     			 University newuni=new University(universitymodel.getId(),universitymodel.getName(),universitymodel.getCity(),universitymodel.getWeb_page(),universitymodel.getType(),kayittarih,kayittarih,kayittarih);
		     			
		     			universityDal.add(newuni);
		     			this.studentDal.add(student);
		     			break;
		     		}
		     		else {
		     			//üniverite bulunamadı döndürür.
		     		}
		     		
		     	}
		         
		         
		     } catch (Exception e) {
		         e.printStackTrace();
		     } finally {
		         httpClient.getConnectionManager().shutdown();
		     }
			
			
			
			
		}
		
		
		
		
		
		
	}

	

	@Override
	@Transactional
	public Student detay(int id) {
		
		return this.studentDal.detay(id);
	}
	
	
	 public static HttpResponse getResponse(String url, DefaultHttpClient httpClient) throws IOException {
         try {

             HttpGet httpGet = new HttpGet(url);
             httpGet.addHeader("accept", "application/json");
             HttpResponse response = httpClient.execute(httpGet);
             return response;
         } catch (IOException e) {
             throw e;
         }
     }

     public static String readData(HttpResponse response) throws Exception {
         BufferedReader reader = null;
         try {


             reader = new BufferedReader(new InputStreamReader(
                     response.getEntity().getContent()));
             StringBuffer data = new StringBuffer();
             char[] dataLength = new char[1024];
             int read;
             while (((read = reader.read(dataLength)) != -1)) {
                 data.append(dataLength, 0, read);
             }
             return data.toString();
         } finally {
             if (reader != null)
                 reader.close();
         }
     }
     
	
	
	
	
	

}

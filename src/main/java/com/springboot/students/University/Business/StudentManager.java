package com.springboot.students.University.Business;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.springboot.students.University.DataAccess.IStudentDal;
import com.springboot.students.University.Entities.Student;
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
	
	@Autowired
	public StudentManager(IStudentDal studentDal) {
		
		this.studentDal = studentDal;
	}

	@Override
	@Transactional
	public List<Student> getAll() {
		
		return this.studentDal.getAll();
	}

	@Override
	@Transactional
	public void add(Student student) {
		
		 DefaultHttpClient httpClient = null;
	     try {
	         httpClient = new DefaultHttpClient();
	         HttpResponse response = getResponse("https://gitlab.com/kodiasoft/intern/2019/snippets/1859421/raw", httpClient);
	         String outPut = readData(response);
	        // System.out.println(outPut);
	         Gson gson = new Gson();
	         List<UniversityModel> fromJson = gson.fromJson(outPut, new TypeToken<List<UniversityModel>>(){}.getType());
	        // System.out.println("DATA SIZE : "+fromJson.size());
	      //   System.out.println("GET FIRST DATA : "+fromJson.get(0));
	         
	         for(UniversityModel uniler : fromJson){
	     		System.out.println(uniler.getFounded_at());
	     		
	     	}
	         
	         
	     } catch (Exception e) {
	         e.printStackTrace();
	     } finally {
	         httpClient.getConnectionManager().shutdown();
	     }
		
		
		
		this.studentDal.add(student);
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

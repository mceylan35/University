package com.springboot.students.University.Schemas;

public class StudentFieldError {

	
		private String status;
	    private String message;


	    public StudentFieldError() {
	    }

	    public StudentFieldError(String status, String message) {
	        this.status = status;
	        this.message = message;
	    }

	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }
}

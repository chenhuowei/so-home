package com.socode.base;


public class ApiResponse {

	private int code;
	private boolean success;
	private String message;
	private Object data;
	
	
	private ApiResponse(int code, boolean success, String message, Object data) {
		super();
		this.code = code;
		this.success = success;
		this.message = message;
		this.data = data;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public static ApiResponse ofSuccess(Object data) {
		
		return new ApiResponse(Status.SUCCESS.getCode(), true,Status.SUCCESS.getStandardMessage() , data); 
	}
	public static ApiResponse ofSuccess() {
		
		return new ApiResponse(Status.SUCCESS.getCode(), true,Status.SUCCESS.getStandardMessage() , null); 
	}
	
	public static ApiResponse ofSuccess(int code,String message,boolean success) {
		
		return new ApiResponse(code,success,message , null); 
	}
	
	 public enum Status {
	        SUCCESS(200, "OK"),
	        BAD_REQUEST(400, "Bad Request"),
	        NOT_FOUND(404, "Not Found"),
	        INTERNAL_SERVER_ERROR(500, "Unknown Internal Error"),
	        NOT_VALID_PARAM(40005, "Not valid Params"),
	        NOT_SUPPORTED_OPERATION(40006, "Operation not supported"),
	        NOT_LOGIN(50000, "Not Login");

	        private int code;
	        private String standardMessage;

	        Status(int code, String standardMessage) {
	            this.code = code;
	            this.standardMessage = standardMessage;
	        }

	        public int getCode() {
	            return code;
	        }

	        public void setCode(int code) {
	            this.code = code;
	        }

	        public String getStandardMessage() {
	            return standardMessage;
	        }

	        public void setStandardMessage(String standardMessage) {
	            this.standardMessage = standardMessage;
	        }
	    }
	
	
	
}

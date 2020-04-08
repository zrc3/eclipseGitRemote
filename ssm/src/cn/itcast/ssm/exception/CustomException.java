package cn.itcast.ssm.exception;

//自定义异常类
public class CustomException extends Exception{

	public String message;
	
	public CustomException(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
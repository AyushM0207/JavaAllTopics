package akm.com.exception;

public class StudentNoTFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StudentNoTFoundException(String msg) {
		super(msg);
	}
}

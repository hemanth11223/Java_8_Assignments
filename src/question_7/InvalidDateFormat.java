package question_7;

public class InvalidDateFormat extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		return ("Date must be in DD/MM/YYYY format. (eg. 06/11/2017)");
	}


}

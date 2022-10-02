package question_3;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wordcount w = str->{
			return(str.split(" ").length);
		};
		System.out.println(w.count("Hemanth Kumar"));

	}

}

package question_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Guitar g; //instance variable for Guitar Interface
		Piano p; //instance variable for Piano Interface.
		g = new Instrument();
		p = new Instrument();
		System.out.print("Guitar");
		g.play();
		System.out.print("Piano");
		p.play();


	}

}

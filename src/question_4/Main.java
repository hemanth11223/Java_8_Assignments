package question_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Number of Employees");
		int n = sc.nextInt();
		Employee arr[] = new Employee[n];
		for(int i=0; i<n; i++) {
			arr[i] = new Employee();
			arr[i].getData();
		}
		for(int i=0; i<n; i++) {
			Collections.sort(arr)[i].displayData();
		}
		sc.close();
	}

}

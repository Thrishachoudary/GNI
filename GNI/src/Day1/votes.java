package Day1;
import java.util.Scanner;

public class votes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		age=sc.nextInt();
		if (age>18) {
		System.out.println("eligible for voting");
		}
		else {
			System.out.println("not eligible");
		}
		

	}

}

package Day1;
import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char vo;
		vo=sc.next().charAt(0);
		if (vo=='a'|| vo=='e'|| vo=='i'|| vo== 'o'|| vo=='u') {
			System.out.println("vowels");
		}
		else {
			System.out.println("consonants");
		}
			
		
		
		

	}

}

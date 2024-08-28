package Day1;
import java.util.Scanner;

public class marriage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int agemale ,agefemale;
		System.out.println("enter agemale");
		agemale=sc.nextInt();
		System.out.println("enter agefemale");
		agefemale=sc.nextInt();
		if (agemale>23 || agefemale > 21) {
			System.out.println("THEY are ELIGIBLE FOR MARRIAGE");
			
		}
		   else{
			System.out.println(" they are not ");
		}
		
		
		
		
		

	}

}

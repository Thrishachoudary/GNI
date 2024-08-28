package Day1;

import java.util.Scanner;

public class threepeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		System.out.println("enter value a");
		b=sc.nextInt();
		System.out.println("enter value b");
		c=sc.nextInt();
		System.out.println("enter value c");
		
		if (a>b && a>c) {
			System.out.println("a is older");
			
		}
		else if (b>a && b>c) {
			System.out.println("b is older");
			
		}
		else {
			System.out.println(" c is older");
		}

	}

}

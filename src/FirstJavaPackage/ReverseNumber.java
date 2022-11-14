package FirstJavaPackage;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		 
		int num=sc.nextInt();
		

		int rev=0;
		
		while(num!=0) {
			
			rev=rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("The reversed number is:" + rev);
		
		Scanner newsc=new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		
		int num1=newsc.nextInt();
		
		StringBuffer rev1;
		StringBuffer sb= new StringBuffer(String.valueOf(num1));
		rev1 = sb.reverse();
		
		System.out.println("The reversed number is:" + rev1);
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter another number");
		
		int num2 = sc1.nextInt();
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(num2);
		StringBuilder rev2 = sb1.reverse();
		
		
		System.out.println("The reversed number is:" + rev2);
		
		
	}

}

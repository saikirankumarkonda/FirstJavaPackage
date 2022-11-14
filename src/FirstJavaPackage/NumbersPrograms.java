package FirstJavaPackage;

public class NumbersPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Program to find number is positive or negative.
		int i=0;
		if(i<0) {
			System.out.println("Given number is a Negative Number");
		}
		else if(i>0) {
			System.out.println("Given number is a Positive Number");
		}
		else {
			System.out.println("Given number is Zero");
		
	}
	
		//Greatest of two numbers:
		
	int a=100;
	int b=100; 
	int c=27;
	
	if(a>b & a>c & a!=b & a!=c) {
		System.out.println("Greatest Number is A=" + a);
		
	}else if(b>a & b>c & b!=a & b!=c) {
		System.out.println("Greatest Number is B=" + b);
		
	}
	else if(c>a & c>b & c!=a & c!=b) 
		{
		System.out.println("Greatest Number is C=" + c);
		
	}
		else {
			System.out.println("Atleast two given numbers are equal");
		}
		
	
	
	
	
	//Display multiplication of Table 5.
	
	int k=5;
	for(int j=0;j<=10;j++) {
		
		System.out.println(k + " * " + j + " = " + j*k );
	}
	
	//Count Number of Digits of the given number.
	
	int d=652;
	int digits=0;
	do {
		d=d/10;
		digits++;
	}while(d!=0);
	System.out.println("The number of digits in given number are:" + digits);
	}}



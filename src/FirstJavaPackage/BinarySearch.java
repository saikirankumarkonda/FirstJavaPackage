package FirstJavaPackage;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		
		int a[]= {1,2,4,5,11,3,4,5,6,7,8,9,10};
		
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		//Arrays.sort(a);
		//int key=12;
		
		//for(int n:a) {
			//System.out.print(" " +n );
		//}
		int l=0;
		int h=a.length-1;
		boolean flag=false;
		
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(a[mid]==key) {
				System.out.println("Element found at:" + mid);
				flag=true;
				break;
			}
			if(a[mid]<key)
			{
				l=mid+1;
			}
			if(a[mid]>key) {
				h=mid-1;
			}
		}
		if(flag==false) {
			System.out.println("Element Not Found.");
		}

	}

}

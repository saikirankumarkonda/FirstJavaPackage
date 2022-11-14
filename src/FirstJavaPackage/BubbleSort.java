package FirstJavaPackage;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={3,5,4,9,8,7,5,4,3,2,1,0};
		
		System.out.println("Arrays before sorting:" + Arrays.toString(a));
		
		for(int i=0;i<=a.length-1;i++) {
			
			for(int j=i+1;j<=a.length-1;j++) {
				
				if(a[j]<a[i]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		System.out.println("Arrays After sorting:" + Arrays.toString(a));
		
	}

}

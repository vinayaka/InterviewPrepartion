package com.interview.exception;

public class PushZeroAtEnd {

	public static void main(String[] args) {
		int[] a= {0,98,22,33,44,0,55};
		
		int count=0;
		
		for(int  i = 0; i < a.length; i++) {
		//for(int i:a) {
			if(a[i]!=0) {
				a[count++]=a[i];
				
			}
		}
		//System.out.println(count);
		//int index=0;
			while(count<a.length) {
				a[count++]=0;
				//index++;
			}
		
for(int k=0;k<a.length;k++) {
	System.out.println(a[k]);
}
	}

}

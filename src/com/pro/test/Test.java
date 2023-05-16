package com.pro.test;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		int[] a = { 123, 231, 785, 469, 321, 964 };
int num =469;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
			}
		}

		a[a.length-1]=0;
		
		System.out.println(Arrays.toString(a));
	}
}

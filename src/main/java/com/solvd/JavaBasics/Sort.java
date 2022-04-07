package com.solvd.JavaBasics;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int num [] = {27, 8, 1, 23, 53}; 
		int aux=0; 
		
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
				aux = num[i];
				num[i] = num[j];
				num[j] = aux;
				                  }
											}		
									  }
		
		System.out.println(Arrays.toString(num));
		
	}

}

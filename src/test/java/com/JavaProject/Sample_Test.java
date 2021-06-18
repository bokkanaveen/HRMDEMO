package com.JavaProject;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Sample_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="naveen raju naveen pani raju nagu raju pani";
		String str[]=name.split(" ");
		System.out.println(str.length);
		for(int i=0;i<str.length-1;i++) {
					int count=1;
			for(int j=i+1;j<str.length-1;j++) {
				if(str[i].equalsIgnoreCase(str[j])) {
					count++;
				}
			}
			if(count>1) {
			System.out.println(str[i]+" "+count);}
		}
	}
}

package org.tnsif.capgemini.c2tc.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;

public class Lambdaexpressionsexample4 {

	public static void main(String[] args) {
		
		 List<String> list=new ArrayList<String>();  
	        list.add("Honey");  
	        list.add("Ammulu");  
	        list.add("Anusha");  
	        list.add("Jessy");  
	          
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  

	}

}

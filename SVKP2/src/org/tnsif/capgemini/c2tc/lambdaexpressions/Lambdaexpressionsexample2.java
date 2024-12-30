package org.tnsif.capgemini.c2tc.lambdaexpressions;

interface Kandavalli{  
    int add(int a,int b);  
}  

public class Lambdaexpressionsexample2 {

	public static void main(String[] args) {
		
		 // Multiple parameters in lambda expression  
       Kandavalli ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));     
       // Multiple parameters with data type in lambda expression  
       Kandavalli ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));  
		

	}

}

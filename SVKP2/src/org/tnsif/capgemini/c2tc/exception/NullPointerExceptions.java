package org.tnsif.capgemini.c2tc.exception;

public class NullPointerExceptions {

	public static void main(String[] args) {
    String str=null;
		
		try
		{
			System.out.println(str.length());
		}catch(NullPointerException e)
		{
		System.out.println(e);
		}
		System.out.println("welcome");
	}

}
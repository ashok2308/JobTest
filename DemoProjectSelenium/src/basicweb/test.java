package basicweb;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String str;
		 System.out.println("Enter a string value");
		 Scanner scn = new Scanner(System.in);
		  str = scn.nextLine();
		  
		  scn.close();
		 String reversed = reverseString(str);
		 System.out.println("String reverese : " + reversed);
	}
	public static String reverseString(String s) 

		 {
			 if(s.isEmpty())
				 return s;
			 return reverseString(s.substring(1)) + s.charAt(0);
			 
		 
	}

}

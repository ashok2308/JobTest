package basicweb;

import java.util.Date;
import java.util.Scanner;
import java.awt.*;

public class newClass {
	public static void main(String[] args)
	
	{
		//String mes ="world"+ "@@";
		//String str;  
		System.out.println("Enter a string: ");  
		Scanner scanner = new Scanner(System.in);  
		String str = scanner.nextLine();
		
		//System.out.println(mes);
		
		System.out.println(str.length());
		System.out.println(str.indexOf("H"));
		System.out.println(str.replace("H", "O"));
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
	}

}

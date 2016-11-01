/**
 *
 * Name: Dylan Fyvie
 * Teacher: Mr.Hardman
 * Assignment #3, Program #Java
 * Date Last Modified: 10/27/2016
 *
 */

import java.util.Scanner;

import javax.rmi.CORBA.Util;

public class Ed_Jovawovski{

	public static void main(String args[]){
		
		Scanner userInput = new Scanner(System.in);
		
		
	    
	   
		
		System.out.print("What Is Your First Grade: ");
		double Grade1=userInput.nextDouble();
		
		System.out.print("What Is Your Second Grade: ");
		double Grade2=userInput.nextDouble();
		
		System.out.print("What Is Your Third Grade: ");
		double Grade3=userInput.nextDouble();
		
		System.out.print("What Is Your Fourth Grade: ");
		double Grade4=userInput.nextDouble();
		
		System.out.print("What Is Your Fifth Grade: ");
		double Grade5=userInput.nextDouble();
		

	    double average = (Grade1 + Grade2 + Grade3 + Grade4 + Grade5 )/5;
	    System.out.println( String.format("Your Average is", average) );
	    
	    System.out.println(String.format("%10s %10.2f%%","Grade1:",Grade1));
		System.out.println(String.format("%10s %10.2f%%","Grade2:",Grade2));
		System.out.println(String.format("%10s %10.2f%%","Grade3:",Grade3));
		System.out.println(String.format("%10s %10.2f%%","Grade4:",Grade4));
		System.out.println(String.format("%10s %10.2f%%","Grade5:",Grade5));
		System.out.println(String.format("%10s %10.2f%%","Average:", average));


userInput.close();
	   
		
	    		
	}

}

package filesPackage;

import java.io.Console;

public class ConsoleExample {
//console is a class used to get the input from the console. it provides methods to read texts and passwords.
	public static void main(String[] args) {
		Console c=System.console();
		System.out.println("Select Transaction");
		String str=c.readLine();
		System.out.println(str);
		//for password
		/*
		 * Console c1=System.console(); System.out.println("Enter your Pin"); char[]
		 * ch=c1.readPassword(); String str1=ch.toString(); if(str1=="admin") {
		 * System.out.println("Please select amount"); } else {
		 * System.out.println("Entered Wrong Pin"); }
		 */
	}
}

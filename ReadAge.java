//Write a java program to enter the age and display it.

import java.util.Scanner;
class ReadAge {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age;
		age = sc.nextInt();
		System.out.println("Entered Age is "+age);
	}
}


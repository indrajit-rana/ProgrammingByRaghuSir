// write a java program to read your name and mobile number and display.

import java.util.Scanner;
class MyInformationDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		long mobNo;
		System.out.println("Enter Your Name :");
		name = sc.nextLine();
		System.out.println("Enter Your Mobile Number :");
		mobNo = sc.nextLong();
		
		System.out.println("My name is : " + name);
		System.out.println("My mobile number is : " + mobNo);
	}
}


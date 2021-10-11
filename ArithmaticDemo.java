// write a java program to read the two integer values from the user and perform all the arithmatic operations and print the results.

import java.util.Scanner;
class ArithmaticDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter a number :");
		num1 = sc.nextInt();
		System.out.println("Enter an other number :");
		num2 = sc.nextInt();
		System.out.println("The addition of two numbers is :" + (num1+num2));
		System.out.println("The substraction of two numbers is :" + (num1-num2));
		System.out.println("The multiplication of two numbers is :" + (num1*num2));
		System.out.println("The division of two numbers is :" + (num1/num2));
		System.out.println("The mode of two numbers is :" + (num1%num2));
	}
}
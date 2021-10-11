// write a java program to read the length and bredth of a rectangle and print the area and circumference.

import java.util.Scanner;
class RectangleDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double length;
		double breadth;
		System.out.println("Enter the length of a rectangle: ");
		length = sc.nextDouble();
		System.out.println("Enter the breadth of a rectangle: ");
		breadth = sc.nextDouble();
		System.out.println("The area of the reactangle is : " + (length*breadth));
	        System.out.println("The circumference of the rectangle is : " + (2*length*breadth));
	}
}
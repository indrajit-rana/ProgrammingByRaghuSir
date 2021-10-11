// write a java program to read the side of a square and print the area and perimeter.

import java.util.Scanner;
class SquareDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double side;
		System.out.println("Enter the side of a square: ");
		side= sc.nextDouble();
		System.out.println("The area of the square is : " + (side*side));
	        System.out.println("The circumference of the square is : " + (4*side));
	}
}
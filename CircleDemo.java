// write a java program to read the radius of a circle from the user and print area and circumference of the circle .

import java.util.Scanner;
class CircleDemo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		final double PIE = 3.142;
		double radius;
		System.out.println("Enter the radius of a circle : ");
		radius = sc.nextDouble();
		System.out.println("The area of the circle is : " + (PIE*radius*radius));
	        System.out.println("The circumference of the circle is : " + (2*PIE*radius));
	}
}


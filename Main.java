import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mob and name :");
		long mob = sc.nextLong();
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Name "+name);
		System.out.println("Mob " +mob);
	}
}
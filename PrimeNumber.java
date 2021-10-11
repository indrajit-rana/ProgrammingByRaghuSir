import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		PrimeNumber pm = new PrimeNumber();
		System.out.println("Enter a number to check prime number:");
		int num = sc.nextInt();
		boolean prime = pm.isPrime(num);
		System.out.println(num + " is prime ?"+prime);
	}
	boolean isPrime(int n){
		int count = 2;
		for(int i = 2; i<=n/2; i++){
			if(n%i == 0){
				count++;			
			}
		}
		if(count >2){
			return false;
		}
		else{
			return true;
		}
	}
		

}

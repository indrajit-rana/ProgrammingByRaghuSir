import java.util.Scanner;
class BiggestNumber 
{
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		BiggestNumber bn = new BiggestNumber();
		System.out.println("Enter three numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int big = bn.biggestNum(a,b,c);
		System.out.println("The biggest number among "+a+" "+b+" "+c+" is :"+big);
	}
	int biggestNum(int x, int y, int z){
		if(x>y && x>z)
			return x;
		else if(y>z)
			return y;
		else 
			return z;
	}
}

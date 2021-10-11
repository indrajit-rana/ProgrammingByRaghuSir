import java.util.Scanner;
class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse :");
		String str = sc.nextLine();
		System.out.println("Reverse of  " + str + " is :  "+reverseOfString(str));
	}
	public static String reverseOfString(String str){
		char[] ch = str.toCharArray();
		String rev = "";
		for(int i = ch.length-1; i>=0; i--){
			rev+=ch[i];
		}
		return rev;
	}
	
}

package numbers;

import java.util.Scanner;

public class ReverseOfNumber {

	public  static int reverse(int n) {
		int r=0,num=153,temp=num;	
		do {
				int digit=n%10;
				r=(r*10)+digit;
				n/=10;
			} while (n!=0);
		return r;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number to reverse");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Original number is:"+num);
		System.out.println("The reverse of the number is:"+reverse(num));

	}

}

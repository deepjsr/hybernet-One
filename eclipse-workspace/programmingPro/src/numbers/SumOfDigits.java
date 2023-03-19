package numbers;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number to check sum of digits");
		int num=sc.nextInt();
		int numcopy=num;
		int sum=0;
		do
		{
		int digit=num%10;
		sum+=digit;
		num=num/10;
		}
		while (num!=0);
		System.out.println("The sum of the digits present in "+numcopy+" is:"+sum);

	}

}

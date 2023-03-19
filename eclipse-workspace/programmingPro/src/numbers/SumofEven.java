package numbers;

import java.util.Scanner;

public class SumofEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to extract even digits");
		int num=sc.nextInt();
		int numcopy=num;
		int sum=0;
		do {
			int digit=num%10;
			if (digit%2==0) {
				sum+=digit;
				System.out.println("The sum of even digits present in "+numcopy+" is:"+sum);
			}
			else
			{
				System.out.println("There is no even digits are present in"+numcopy);
			}
			num/=10;
		} while (num!=0);
		
		
	}

}

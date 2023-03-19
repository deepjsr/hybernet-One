//WAP to enter a number and display the  of even digits available in the number
package numbers;

import java.util.Scanner;

public class EvenExtract {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to extract even digits");
		int num=sc.nextInt();
		int numcopy=num;
		System.out.println("The even digit/digits present in "+numcopy+" are:");
		do {
			int digit=num%10;
			if (digit%2==0) {
				
				System.out.print(digit+",");
				
			}
			else
			{
				System.out.println("There is no even digits are present in"+numcopy);
			}
			num/=10;
		} while (num!=0);
	}

}

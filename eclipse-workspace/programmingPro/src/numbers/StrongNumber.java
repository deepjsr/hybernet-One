package numbers;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	int sum=0,digit=0;
	System.out.println("Enter a number to check strong or not");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int numcopy=num;
	while (num!=0) {
		int fact=1;
		digit=num%10;
			for (int i=1; i<=digit; i++) {
				fact=fact*i;	
			}
			sum=sum+fact;	
			num=num/10;
  }
	if (numcopy==sum) {
		System.out.println(numcopy+" is a strong number");

	}
	else {
		System.out.println(numcopy+" is not a strong number");
	}
}
}

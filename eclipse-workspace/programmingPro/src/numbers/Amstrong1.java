package numbers;

import java.util.Scanner;

public class Amstrong1 {

	public static void main(String[] args) {
int sum=0,temp=0,num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente the number for checking amstrong");
		int n=sc.nextInt();
		temp=n;
		while(n!=0) {
			num=n%10;
			n=n/10;
			sum=sum+(num*num*num);
			
		}
		if(temp==sum) {
			System.out.println(sum+" is a Armstrong Number");
		}
		else {
			System.out.println("not a armstrong");
		}
	}

}

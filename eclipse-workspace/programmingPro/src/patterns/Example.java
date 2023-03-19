package patterns;

import java.util.Scanner;

class TestPattren{
	static void patterns() {
		
		for(int i=0;i<5;i++)
		{
			if (i%2==1) {
				for (int j = 0; j < 5; j++) 
				{
					System.out.print("*");					
				}
				System.out.println();
			}
			else {
				for (int j = 0; j < 5; j++) {
					System.out.print(1);
					
				}
				System.out.println();
			}
		}
	}
	static void patterns(int i) {
		if(i==1) {
		for (int row = 0;   row < 5;   row++) {
			for (int column = 0; column < row; column++) {
				
					System.out.print("a");
				
			}
			System.out.println();
		}

	 }
		else {
			System.out.println("Your input does not match any patterns");		}
	}
	static void patterns(char arg) {
		if (arg=='i') {
			for (int row = 0;   row < 5;   row++) {
				for (int column = 0; column < 5; column++) {
					if(row<column) {
						System.out.print("a");
					}
				}
				System.out.println();
			}
			
		}
		else {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if (i>j) {
						System.out.print('*');
//						System.out.println();
					} else {
						System.out.print('*');
					}
				}
				System.out.println();
				
			}			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your pattren namefrom the following \n*Alternet Star\n*Triangle\n*Inverted Triangle");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your input to print the pattrens");
//				int input=sc.nextInt();
				String input=sc.nextLine();
		switch (input) {
		case "Alternet Star":  patterns();
			
			break;
		case "Triangle":patterns(1);
			break;
		case "Inverted Triangle":patterns('j');
			break;

		default:System.out.println("Your input does not match any patterns");
			break;
		}
	}


}
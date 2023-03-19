package patterns;

public class Test_Purpose {

	public static void main(String[] args) {
		/* practice problem 1:To print below pattern
		 	****
		 	***
		 	**
		 	*
		*/
//		for (int i=1;i<=4; i++)
//		{
//			for (int j=i;j<=4 ;j++ )
//			{
//				System.out.print('*');
//			}
//			System.out.println();
//		}
//
		// practice problem 2: Sum of first 10 natural numbers
//		int n=1,sum=0;
//		do {
//			sum+=n;
//			n++;
//		}
//		while(n<=10);
//		System.out.println(sum);
		// practice problem 3: Multiplication table of 5
//		int n=5;
//		for (int i = 1; i <=10; i++) {
//			System.out.printf("%d X %d = %d\n", n,i,n*i);
//			
//		}
		// practice problem 3: Multiplication table of 10 in reverse order
//		int n=10;
//		for (int i = 10; i >=1; i--) {
//			System.out.printf("%d X %d = %d\n", n,i,n*i);
//			
//		}
		// practice problem 4: Factorial using do while loop
		int fact=1,n=5,i=1;
		do {
			fact*=i;
			n++;
		} while (i<=n);
		System.out.println("factrorial of"+fact);
		Object arr[]= {1,'o'};
		System.out.println(arr[0]);
	}

}

package patterns;


public class PatternStarRound {

	public static void main(String[] args) {

		int space=-1, star=3;
		for (int i = 1; i <=5; i++) {
			if (i<=3) {
				space+=2;
				star--;		
			}
			else {
				star++;
				space-=2;
			}
			for (int j = 0; j <=star; j++) {
				System.out.print("*");
			}			
			for (int j = 1; j <=space ; j++) {
				System.out.print(" ");				
			}
			System.out.println();
		}
	}

}

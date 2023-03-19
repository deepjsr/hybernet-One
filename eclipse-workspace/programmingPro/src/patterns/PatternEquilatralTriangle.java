package patterns;

public class PatternEquilatralTriangle {

	public static void main(String[] args) {
		int star=3,space=0;
		for (int i = 1; i <=3; i++) {
			space--;
			star++;
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}

/**WAP to draw following pattern
 *  
  **
 *  *  * 
*    *
*    *
 *  * 
  **  
 * 
 */
package patterns;


/**
 * @author DEEP J SARMA
 *
 */
public class PatternRound {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i <=6; i++) {
			for (int j = 1; j <=6; j++) {
				if (i+j==4||(i+j==10)||(i==1&&j==4)||(i==2&&j==5)||(i==3&&j==6)||(i==4&&j==1)||(i==5&&j==2)||(i==6 &&j==3)) {
					System.out.print("*");
				} else {
					System.out.print( " ");
				

				}
			}
			System.out.println();
			
		}
		
	}

}

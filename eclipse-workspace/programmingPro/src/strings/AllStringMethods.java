package strings;

public class AllStringMethods {

	public static void main(String[] args) {
		// Sample method to apply string 
		String strDemo=new String("Jgannath Sir is <3");
		//Length:to count the length of any string
		System.out.println("Length of th e samle string: "+strDemo.length());
		//charAt(index):Returns the char value at the specified index. 
		System.out.println("Char at 0 th index is:"+strDemo.charAt(0));
		/*euqals():Compares contents of this string to the specified string/object.
		 * returns true if both of the string has same content with similar case
		 */
			String str2="JagaNNath";
			System.out.println(strDemo+ "is equals to?\t"+ str2+ "\t"+ strDemo.equals(str2));
		/*equalsIgnoreCase():Compares contents of this string to the specified string/object.
		 * returns true if both of the string has same content ignoring the case
		 */
			System.out.println(strDemo+ "is equals to(ignoring the case)?\t"+ str2+ "\t"+ strDemo.equalsIgnoreCase(str2));
			/*indexOf():Returns the index within this string of the first occurrence of the specified character. 
			 * if no such character occurs in this string, then -1 is returned. 
			 */
		System.out.println("Index of 'a' in the sample string:\t"+strDemo.indexOf('k'));
		/*indexOf():The index of the last occurrence of the character in the character sequence. 
		 * if no such character occurs in this string, then -1 is returned. 
		 */
		System.out.println("Last index of 'a' in the sample string:\t"+strDemo.lastIndexOf('a'));
		/*substring():Returns a string that is a substring of this string.The substring begins with the character at the specified index to the end of this string. 
		 *IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object		
		 */		
		System.out.println("Substring of the sample string at index 3: "+strDemo.substring(3));
		/*substring():Returns a string that is a substring of this string.The substring begins with the character at the 1st specified index to the 2nd specified index of this string. 
		 *IndexOutOfBoundsException - if beginIndex is negative or larger than the length of this String object		
		 */		
		System.out.println("Substring of the sample string at index 3 ending st 9 is c: "+strDemo.substring(3,9));
		/*replace():Returns a string resulting from replacing all occurrences of oldChar in this string with newChar. 
		 *If the character oldChar does not occur in the character sequence represented by this String object,then a reference to this String object is returned
		 */				
		String rplc=strDemo.replace('n', '5');
		/*substring():Returns a string resulting from replacing all occurrences of oldChar in this string with newChar. 
		 *If the character oldChar does not occur in the character sequence represented by this String object,then a reference to this String object is returned
		 */				
		String str3=" hello ";
		String str4=" Everyone ";
		String str5=str3+str4;	
		String str6=null;
		
		System.out.println("After removing white space of both centences"+str5.trim());
		/*substring():Returns true if, and only if, length() is 0.
		 * 
		 */						
		System.out.println(str3.isEmpty());
		/*
		System.out.println(str6.isEmpty());//returns NullPointerException null is not directly assignable to a string
	    */
	
	}

}

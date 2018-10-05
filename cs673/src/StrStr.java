/**
 * 
 */
package src;

/**
 * To print needle element of haystack
 *
 */
public class StrStr {

	public int indexOf(String haystack, String needle) {
		if (needle == null || haystack == null ) {
			return 0;
		}
		for(int i=0; i<haystack.length(); i++){
			//				if(i + needle.length() > haystack.length())
			//					return -1;
			int m = i;
			for(int j=0; j<needle.length(); j++){
				if(needle.charAt(j)==haystack.charAt(m)){
					if(j==needle.length()-1)
						return i;
					m++;
				}else{
					break;
				}
			}    
		}   
		return -1;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Start");
			StrStr str = new StrStr();
			String haystack = "Hello";
			String needle = "ll";
			System.out.println(str.indexOf(haystack, needle));
			System.out.println(str.indexOf("Hello", "ll"));
			System.out.println(str.indexOf("HeLlo", "ll"));
			System.out.println(str.indexOf("HeLlo", "ggg"));
			System.out.println(str.indexOf("HeLlo", null));	
			System.out.println("End");
		} catch(Exception e) {
			System.err.println("Caught Exception: " + e.getMessage());
		}
	}
}


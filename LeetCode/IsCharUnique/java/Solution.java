import java.util.HashMap;

public class Solution {

	public static String testString1 = "acdsmxl";
	public static String testString2 = "";
	public static String testString3 = "ekwjgkjwegkjwelgkj";

	public static void main(String[] args) {
		System.out.println( isUnique(testString1) );
		System.out.println( isUnique(testString2) );
		System.out.println( isUnique(testString3) );

	}

	public static boolean isUnique(String inputString){
		HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
		for (int i =0; i < inputString.length() ; i++ ) {
			int c = inputString.charAt(i); // get UniCode 
			if (hashMap.containsKey(c)) {
				return false;
			}

			else {
				hashMap.put(c, true);
			}
		}
		return true;
	}

}
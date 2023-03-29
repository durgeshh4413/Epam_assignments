package HomeTask_Arrays_Strings;

public class CheckRotationString {
	public static void checkRotationString(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			
			rev+=str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev)) {
			System.out.println(str+ " is rotational string");
		}
		else {
			System.out.println(str+" is not a rotational string");
		}
		
		
	}
	public static void main(String[] args) {
		String str="ABA";
	
		String str1="ABC";
		CheckRotationString.checkRotationString(str);
		CheckRotationString.checkRotationString(str1);
	}
	

}

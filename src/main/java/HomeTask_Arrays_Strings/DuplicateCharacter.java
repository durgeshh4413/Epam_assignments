package HomeTask_Arrays_Strings;

public class DuplicateCharacter {
	
	public static void checkDuplicateCharacter(String str) {
		
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(i)+" is a duplicate character");
					count++;
					break;
				}
			}
			
			
		}
		System.out.println("Count of duplicate character is : "+count);
		
	}
	
	
public static void main(String [] args) {
String str="tastee";
DuplicateCharacter.checkDuplicateCharacter(str);

}
}

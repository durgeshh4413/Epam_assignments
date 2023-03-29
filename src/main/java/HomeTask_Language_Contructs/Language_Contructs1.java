package HomeTask_Language_Contructs;

public class Language_Contructs1 {

	public static boolean checkNumber(int a, int b) {
		 
		
		int sum = Math.abs(a+b);

		  int diff = Math.abs(a-b);
		if (a == 6 || b == 6 || sum== 6 || diff == 6)
		    return true;
		  else
		    return false;
		}

	
	public static void main(String[] args) {
		System.out.println(Language_Contructs1.checkNumber(5, 7));
		System.out.println(Language_Contructs1.checkNumber(6, 6));
		System.out.println(Language_Contructs1.checkNumber(6, 1));
		System.out.println(Language_Contructs1.checkNumber(3, 3));
	}
}
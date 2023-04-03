package pages;

public class Pages {

	HomeTaskRestFunctionalTest homeTaskRestFunctionalTest;
	
	
	
	
	
	public HomeTaskRestFunctionalTest homeTaskRestFunctionalTest() {
		if(homeTaskRestFunctionalTest == null) {
			homeTaskRestFunctionalTest= new HomeTaskRestFunctionalTest();
		}
		
		return homeTaskRestFunctionalTest;
	}
}

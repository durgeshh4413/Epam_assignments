package pages;

public class Pages {

	HomeTaskRestFunctionalTest homeTaskRestFunctionalTest;
	
	Calculator calculator;
	
	
	
	
	public HomeTaskRestFunctionalTest homeTaskRestFunctionalTest() {
		if(homeTaskRestFunctionalTest == null) {
			homeTaskRestFunctionalTest= new HomeTaskRestFunctionalTest();
		}
		
		return homeTaskRestFunctionalTest;
	}
	
	public Calculator calculator() {
		if(calculator == null) {
			calculator= new Calculator();
		}
		
		return calculator;
	}

}

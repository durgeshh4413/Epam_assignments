package OOPSProgram;

import java.util.Scanner;

public class Pizza {

	
	
	public static void main(String []args) {
		System.out.println("Welcome to Pizza shop");
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose type of base which would you like to have 1.Standard 2.Soft");
		String baseOfPizza=sc.nextLine();
		PizzaBase pizza=new PizzaBase();
		pizza.setBase(baseOfPizza);
		System.out.println("Choose type of topping which would you like to have 1.Tomato 2.Corn 3.Mashrooms");
		String toppingOfPizza=sc.nextLine();
		pizza.setTopping(toppingOfPizza);
		pizza.getFinalPrice();
		System.out.println("Final price of Pizza is : "+pizza.getFinalPrice());
		
		
		
	}
}

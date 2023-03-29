package OOPSProgram;

public class PizzaBase {
  
	private String base;
	private String topping;
	int baseValue;
	int toppingValue;
	
	public void setBase(String base) {
		this.base=base;
		setBaseValue();
	}
	
	public String getbase() {
		return this.base;
	}
	
	public void setTopping(String topping) {
		this.topping=topping;
		setToppingValue();
	}
	 
	public String getTopping() {
		return this.topping;
	}
	
	public int getBaseValue() {
		return baseValue;
	}
	public void setBaseValue() {
		if(getbase().equals("Standard")) {
			baseValue=20;
		}
		else if(getbase().equals("Soft")){
			baseValue = 30;
		}
	}
	
	public int getToppingValue() {
		return toppingValue;
	}
	public void setToppingValue() {
		if(getTopping().equals("Tomato")) {
			toppingValue=50;
		}
		else if(getTopping().equals("Corn")) {
			toppingValue=70;
		}
		else if(getTopping().equals("mushrooms")) {
			toppingValue=100;
		}
	}
	
	
	public int getFinalPrice() {
		return getBaseValue()+getToppingValue();
	}
}

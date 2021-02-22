package datatypesinjava;

import org.openqa.selenium.WebElement;

public class ParametersJ {
	
	

	public static void main(String[] args) {

		ParametersJ p = new ParametersJ();

		p.addition(5,7);
		p.addition(51,73);
		p.addition(52,37);
		p.addition(75,17);
		p.addition(2,73);
		p.addition(45,7);
		p.addition(123456,75454);

	}

	public static void addition(int n1,int n2) {

		int result = n1 + n2;

		System.out.println(result);
	}
	
	
	public static void demo(double d) {
		
		System.out.println(d*567);
	}
	
	
	public static void show(String s) {
		
		System.out.println("Welcome to "+ s);
	}
	
	
	public void ele(WebElement ele) {
	
		ele.sendKeys("");
		ele.click();
		
	}

}

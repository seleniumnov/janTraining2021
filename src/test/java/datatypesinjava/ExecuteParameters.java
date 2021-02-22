package datatypesinjava;

import org.openqa.selenium.WebDriver;

public class ExecuteParameters {

	static WebDriver driver;

	// static block
	
	static {
		
		int n = 9+8;
		
		System.out.println(n);
		
		System.out.println("Hello Static Block");
		
		
		boolean value = true;
		
		System.out.println(value);
		
	}

	public static void main(String[] args) {

		ParametersJ.addition(4, 6);

		ParametersJ.demo(98.7);

		ParametersJ.show("Static Keyword");

	}

}

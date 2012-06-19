package javaProj;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NGTestParam {
	
	@DataProvider(name ="colors")
	public Object[][] colorList() {
		return new Object[][] {
				{1, "Red"},
				{2, "Purple"},
				{3, "Green"}
		};
	}
	
	@Test(dataProvider = "colors")
	public void getColors(int i, String color) {
		System.out.println("#" + i + ": " + color);
	}

}

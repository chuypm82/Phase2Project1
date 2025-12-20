package Hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class testHooks {
	
	@BeforeAll
	public static void setup() {		
		System.out.println("Setup");	
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("TearDown");
	}
}

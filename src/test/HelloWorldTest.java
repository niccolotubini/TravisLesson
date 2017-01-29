package test;

import org.junit.Test;

import helloWorldWithTest.HelloWorldWithTest;

public class HelloWorldTest {
	
	@Test
	public void test() {
	
	String message= "Hello World, I am Marialaura!";
	
	HelloWorldWithTest test =new HelloWorldWithTest();
	
	test.message=message;
	
	test.process();
	
	}
	
	

}

package com.git.demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		System.out.println("Data "+data);
		if(data.equalsIgnoreCase(Constant.DATA)) {
			System.out.println("Welcome");
		}
	}

	public void addMethod(){
		System.out.println("New Comment");
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

import java.io.*;
 class Demo{
	static int a=10;
	static void display() {
		System.out.println("static method");
	}
	static {
		System.out.println("static block");
	}
}
public class StaticDemo {
	public static void main(String[]args)
	{
		System.out.println(Demo.a);
		Demo.display();
	}

	}

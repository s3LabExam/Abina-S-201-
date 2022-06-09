package co4java;
import co4java.operations.*;
import java.util.*;
public class ques2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first NUmber");
		int a = sc.nextInt();
		System.out.println("Enter the second NUmber");
		int b = sc.nextInt();
		add obj1 = new add();
		obj1.calc(a,b);
		sub obj2 = new sub();
		obj2.calc(a,b);
		mul obj3 = new mul();
		obj3.calc(a,b);
		div obj4 = new div();
		obj4.calc(a,b);
		
	}
}




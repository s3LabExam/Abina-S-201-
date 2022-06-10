package co4;

public class mul extends Thread {
public void run(){
	System.out.println("Multiplication table of 5::");
	System.out.println("\n");
	for(int i=0;i<11;i++) {
		System.out.println("5*" + i +" =" +5*i);
	}
}
}

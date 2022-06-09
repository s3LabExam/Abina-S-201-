package co4java.operations;

public class add implements cal{

	@Override
	public void calc(int x, int y) {
		int sum=x+y;
		System.out.println("Sum:" +sum);
		
	}

}

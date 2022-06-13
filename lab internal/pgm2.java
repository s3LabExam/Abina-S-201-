package lab;
import java.util.Scanner;
public class pgm2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("***marks of students:***");
    System.out.println("Enter the marks of subject1:");
	int m1=sc.nextInt();
	System.out.println("Enter the marks of subject2:");
	int m2=sc.nextInt();
	System.out.println("Enter the marks of subject3:");
	int m3=sc.nextInt();
	
float percentage= (m1+m2+m3/100);
	System.out.println("The percentage of marks:"+percentage);
	try {
		if(percentage > 40) {
			System.out.println("passed");
		}}
	catch(Exception e) {
	if (percentage < 40) {
   System.out.println(" failed" +e);
	}}
}}
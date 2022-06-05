package co4;

	import co4.graphics.circle;
	import co4.graphics.rect;
	import co4.graphics.squ;
	import co4.graphics.tri;
	import java.util.Scanner;

	public class Ques1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        circle obj1 = new circle();
	        rect obj2 = new rect();
	        squ obj3 = new squ();
	        tri obj4 = new tri();
	                System.out.println("Choose any shapes :");
	                System.out.println("1)Circle \n" + "2)Rectangle\n" +  "3)Square\n" + "4)Triangle ");
	                choice = sc.nextInt();
	                switch (choice) {
	                    case 1:
	                        obj1.area();
	                        break;
	                    case 2:
	                        obj2.area();
	                        break;
	                    case 3:
	                        obj3.area();
	                        break;
	                    case 4:
	                        obj4.area();
	                    default:
	                        break;
	                }

	        }
	    }



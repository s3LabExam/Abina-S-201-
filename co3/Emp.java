package co3;
import java.util.Scanner;
public class Emp {

	
		int Empid;
		String Name;
		double Salary;
		String Address;
	public Emp(int no,String na,double sal,String add)	{
		this.Empid=no;
		this.Name=na;
		this.Salary=sal;
		this.Address=add;
	}
	}
	 class Teacher extends Emp{
		String dept;
		String Subject;
		Teacher(int no,String na,double sal,String add,String dep,String sub){
			super(no,na,sal,add);
			this.dept=dep;
			this.Subject=sub;
		}
			void display(){
				System.out.println("Employee Id:"+Empid);
				System.out.println("Name:"+Name);
				System.out.println("Salary:"+Salary);
				System.out.println("Address:"+Address);
				System.out.println("Department:"+dept);
				System.out.println("Subject:"+Subject);
				
			}
			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter the no:of records to be stored:");
				int count =sc.nextInt();
				Teacher v[]=new Teacher[count];
				int i;
				for(i=0;i<count;i++)
				{
				System.out.println("Enter the Employee Id:");
				int p=sc.nextInt();
				System.out.println("Enter the Name:");
				String q=sc.next();
				System.out.println("Enter the Salary:");
				double r=sc.nextDouble();
				System.out.println("Enter the Address:");
				String s=sc.next();
				System.out.println("Enter the Department:");
				String t=sc.next();
				System.out.println("Enter the Subject:");
				String u=sc.next();
				v[i]=new Teacher(p,q,r,s,t,u);
				}
				
				for(i=0;i<count;i++){
				v[i].display();
				}
			}
	 }




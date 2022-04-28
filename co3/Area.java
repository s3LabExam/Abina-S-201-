package co3;

public class Area {
	
void calculatesqu(int a){
	int squ=a*a;
	System.out.println("Area of Square is:"+squ+"sq units");
}
void calculaterec(int x,int y){
	int rec=x*y;
	System.out.println("Area of Rectangle is:"+rec+"sq units");
}
void calculatecir(double r){
	double area=3.14*r*r;
	System.out.println("Area of circle is:"+area+"sq units");

}
void calculatecub(int l,int b,int h){
	int cub=l*b*h;
	System.out.println("Area of cuboid is:"+cub+"sq units");
}
void calculatetri(double b1,double h1){
	double tri=0.5*b1*h1;
	System.out.println("Area of Triangle is:"+tri+"sq units");
}
public static void main(String args[]){
	Area obj=new Area();
	obj.calculatesqu(5);
	obj.calculaterec(5,4);
	obj.calculatecir(5);
	obj.calculatecub(1,2,3);
	obj.calculatetri(5,6);
}
}
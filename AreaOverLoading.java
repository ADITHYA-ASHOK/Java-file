package lab2;

import java.util.Scanner;

class AreaOverLoading {
	void CalculateArea(int length,int width) {
		int area=length*width;
		System.out.println("Area of rectangle with length="+length+"and breadth="+width+"is " +area);
	}
	void CalculateArea(float radius) {
		float area=3.14f*radius*radius;
		System.out.println("Area of circlewith radius "+" "+radius+" is "+area);
	}
	void CalculateArea(float base,float  height) {
		float area=0.5f*base*height;
		System.out.println("Area of triangle with base =" +base +"and height="+height +" is "+area);
	}

	
	
	public static void main(String[] args) {
		AreaOverLoading area=new AreaOverLoading();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value of length of rectangle:");
	  int l=sc.nextInt();
	  System.out.println("Enter the value of breadth of rectangle:");
	  int w=sc.nextInt();
	  System.out.println("Enter the value of radius of circle:");
	  float r=sc.nextFloat();
	  System.out.println("Enter the value of base of triangle:");
	  int b=sc.nextInt();
	  System.out.println("Enter the value of height of triangle :");
	  int h=sc.nextInt();
	  
	  area.CalculateArea(l,w);
	  area.CalculateArea(r);
	  area.CalculateArea(b,h);
	  
        sc.close();

	  
	  
	  

	

	}
}
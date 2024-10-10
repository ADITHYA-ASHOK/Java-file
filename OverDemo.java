package lab2;
import java.util.Scanner;

public class OverDemo {

    void area(float base, float height) {
        float area = 0.5f * base * height;
        System.out.println("Area of Triangle is: " + area);
    }

    void area(int width, int height) {
        int area = width * height;
        System.out.println("Area of Rectangle is: " + area);
    }

    void area(int radius) {
        double area = 3.14* radius * radius;
        System.out.println("Area of Circle is: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OverDemo ob = new OverDemo();

        
        System.out.println("Enter the base of the triangle:");
        float b = sc.nextFloat();
        System.out.println("Enter the height of the triangle:");
        float h = sc.nextFloat();
        ob.area(b, h);

        
        System.out.println("Enter the width of the rectangle:");
        int w = sc.nextInt();
        System.out.println("Enter the height of the rectangle:");
        int ht = sc.nextInt();
        ob.area(w, ht);

        
        System.out.println("Enter the radius of the circle:");
        int r = sc.nextInt();
        ob.area(r);

       sc.close(); 
    }
}

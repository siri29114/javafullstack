import java.util.Scanner;

public class TriangleCalc
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

     
        double perimeter = a + b + c;

        
        double s = perimeter / 2;  
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    
        System.out.println("Perimeter of triangle: " + perimeter);
        System.out.println("Area of triangle: " + area);
    }
}

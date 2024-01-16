import java.util.Scanner;



public class circle {
    public static void main(String[] args) {
        System.out.println("Enter the radius :");
Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        areaofcircle(radius);
        circumferenceOfCircle(radius);


    }
    public static void areaofcircle(int radius){
        double val = 3.14 * radius *radius;
        System.out.println("Area of cirlce :"+val);
    }
    public static void circumferenceOfCircle(int radius){
        double val = 2 * 3.14 * radius;
        System.out.println("circumference of The circle is : "+val);
    }
}

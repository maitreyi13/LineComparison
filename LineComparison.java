import java.util.*;
import java.lang.*;

public class LineComparison {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);
        System.out.println("****** UC3:Comparison of two lines ******");
        System.out.println("The equation of a line is ax+by=c");
        System.out.println("Enter x1,y1,x2,y2 of line 1:");
        int x1 = pt.nextInt();
        int y1 = pt.nextInt();
        int x2 = pt.nextInt();
        int y2 = pt.nextInt();
        int b1 = x2 - x1;
        int a1 = y2 - y1;
        int c1 = a1 * x1 + b1 * y1;
        System.out.println("Equation of line 1 is:" + a1 + "x+" + b1 + "y=" + c1);
        double lengthofLineOne = Math.sqrt(Math.pow(b1, 2) + Math.pow(a1, 2));

        System.out.println("Enter x1,y1,x2,y2 of line 2:");
        int x12 = pt.nextInt();
        int y12 = pt.nextInt();
        int x22 = pt.nextInt();
        int y22 = pt.nextInt();
        int b12 = x22 - x12;
        int a12 = y22 - y12;
        int c12 = a12 * x12 + b12 * y12;
        System.out.println("Equation of line 2 is:" + a12 + "x+" + b12 + "y=" + c12);
        double lengthofLineTwo = Math.sqrt(Math.pow(b12, 2) + Math.pow(a12, 2));

        Integer obj1 = (int) lengthofLineOne;
        Integer obj2 = (int) lengthofLineTwo;

        if (obj1.equals(obj2)){
            System.out.println("Length of both lines is equal");
        } else
            System.out.println("Lines are not equal");
    }
}
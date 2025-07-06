package A1_Basics;

import java.util.Scanner;

public class A7_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the radius os circle :");
        double r = sc.nextDouble();
        double A = 3.14 * r *r ;
        System.out.println("Area of circle is:" +A);



    }
}

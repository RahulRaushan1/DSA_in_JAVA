package A1_Basics;

import java.util.Scanner;

public class A7_3HalfOfnumber {
    public static void main(String[] args) {
        System.out.println("Entre a number :");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double y = (double)x;
        System.out.println("Half of number is :" +y/2);
    }
}

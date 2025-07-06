package A1_Basics;

import java.util.Scanner;

public class A7_5AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre a char :");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        System.out.println((int) ch);

    }
}

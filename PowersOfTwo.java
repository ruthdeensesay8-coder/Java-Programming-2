package Caselooping;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        int power = 1;

        for (int i = 0; i <= n; i++) {
            System.out.print(power + " ");
            power = power * 2;
        }
    }
}

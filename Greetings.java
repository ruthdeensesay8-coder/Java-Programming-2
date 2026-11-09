package CaseBranching;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hour (0-23): ");
        int hour = input.nextInt();

        if (hour < 0 || hour > 23) {
            System.out.println("Invalid Hour");
        } else if (hour >= 5 && hour <= 11) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Good Afternoon");
        } else if (hour >= 18 && hour <= 21) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
    
}

package CaseBranching;

import java.util.Scanner;

public class ExamResult {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = input.nextInt();

        if (score >= 70) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
}

  }  
 

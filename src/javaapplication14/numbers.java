/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication14;

import java.util.Scanner;

/**
 *
 * @author Nameless
 */
import java.util.Scanner;

public class numbers {

    private static final int MAX_SIZE = 100;
    private static int[] Nums = new int[MAX_SIZE];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\n===================Menu=======================");
            System.out.println("Option:");
            System.out.println("1. Input Int Numbers");
            System.out.println("2. View Input Numbers");
            System.out.println("3. Exit");
            System.out.print("Input choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputNums(scanner);
                    break;
                case 2:
                    viewNumbers();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void inputNums(Scanner scanner) {
        int num;
        while (true) {
            System.out.println("========================Menu Input==============================");
            System.out.println("Input numbers or Input a negative number to stop inputting:");num = scanner.nextInt();
            if (num < 0) {
                System.out.println("Input complete.");
                break;
            }
            Nums[count] = num;
            count++;
        }
    }

    private static void viewNumbers() {
        System.out.println("========================Menu View==============================");
        System.out.print("Input Numbers: [");
        for (int i = 0; i < count; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(Nums[i]);
        }
        System.out.println("]");
    }
}
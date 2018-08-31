package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int arr[][];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter row number: ");
        int rows = input.nextInt();
        System.out.println("Enter column number: ");
        int columns = input.nextInt();

        arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("arr[" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("Ma tran: ");
        for (int i = 0; i < rows; i++) {
            System.out.print("\n");
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j]);
            }
        }


        int total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    total += arr[i][j];
                }
            }
        }

        System.out.println("\nTong duong cheo chinh: " + total);

    }
}

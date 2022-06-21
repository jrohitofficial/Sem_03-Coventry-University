package programmingForDevelopers.aday1;

import java.util.Scanner;

public class Day1ArrayInput {

    public int findMissing() {
        int inputNumber;


        Scanner sc = new Scanner(System.in);

        System.out.println("\nNote: There should be at least 3 missing numbers.");
        System.out.print("\nLength of array: ");
        inputNumber = sc.nextInt();
        System.out.println(" ");


        int[] arr = new int[inputNumber];
        int[] breakArr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] == j) {
                    breakArr[j] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (breakArr[i] == 0) {
                count++;
                if (count == 3) {
                    return i;
                }
            } else if (breakArr[i] == 1) {
                count = 0;
            }

        }

        return 0;
    }


    public static void main(String[] args) {
        Day1ArrayInput obj = new Day1ArrayInput();
        System.out.println("Missing number: " + obj.findMissing());
    }
}

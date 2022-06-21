package programmingForDevelopers.aday1;

import java.util.Scanner;

public class Day1RealSolution {

    public int findMissing() {
        Scanner sc = new Scanner(System.in);

        int inputNumber;
        int inputNumberCopy;
        int[] arrayNumbers = new int[10];

        System.out.print("\nEnter number: ");
        inputNumber = sc.nextInt();

        inputNumberCopy = inputNumber;
        int remainder;

        while (inputNumberCopy != 0) {
            remainder = inputNumberCopy % 10;
            arrayNumbers[remainder] = 1;
            inputNumberCopy = inputNumberCopy / 10;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (arrayNumbers[i] == 0) {
                count++;
                if (count == 3) {
                    return i;
                }
            } else if (arrayNumbers[i] == 1) {
                count = 0;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Day1RealSolution obj = new Day1RealSolution();
        System.out.println("Missing Number: " + obj.findMissing());
    }


}

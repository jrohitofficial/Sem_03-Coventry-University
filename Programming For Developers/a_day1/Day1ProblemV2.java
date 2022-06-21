package programmingForDevelopers.aday1;


/*

Question:
	int a = 123910 (One hundred Twenty Three Thousand Nine Hundred Ten)



Find missing third-smallest number


First-smallest missing number :   4
Second-smallest missing number :  5
Third-smallest missing number :   6
Fourth-smallest missing number :  7
Fifth-smallest missing number :   8

Answer must be 6.

Solution:

Step 1 :  Take the integer.
Step 2 :  Count the number of digits in the integer.
Step 3 :  Separate individual digits and store them in an array.
Step 4 :  Sort the array in ascending order.
Step 5 :  Remove duplicated digits.
Step 6 :  Find the break in which the difference is more than commonDifference(i.e. 1).
Step 7 :  Add common difference from the first part till it reaches the second part & Place the values in an array.
Step 8 :  Display the third value.

*/


import java.util.Scanner;

public class Day1ProblemV2 {


    public int[] bubbleSort(int[] arr, int size) {
        int index;

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    index = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = index;
                }
            }
        }

        return arr;
    }


    public int[] removeElement(int[] arr, int index) {

        int[] newArr = new int[arr.length - 1];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[count] = arr[i];
                count++;
            }
        }

        return newArr;
    }


    public int[] removeDuplicate(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    arr = removeElement(arr, i);
                }
            }
        }
        return arr;

    }


    public int returnThird() {
        int result;
        int inputNumber;
        int commonDifference = 1;
        int beginMissing = 0;
        int endMissing = 0;
        int numberMissing;
        int tempValue;


        Scanner sc = new Scanner(System.in);

        System.out.println("\n" + "\u001B[33m" + "Step 1 :  Take the integer." + "\u001B[0m");

        System.out.println("\n  Note: There should be at least 3 missing numbers & common difference will be 1.");
        System.out.print("\n" + "\u001B[32m" + "   Enter an integer: " + "\u001B[0m");
        inputNumber = sc.nextInt();
        System.out.println(" ");


        int k = 0;
        int inputNumber1 = inputNumber;
        int numberDigit = 0;

        System.out.println("\n" + "\u001B[33m" + "Step 2 :  Count the number of digits in the integer." + "\u001B[0m");
        while (inputNumber1 > 0) {
            inputNumber1 = inputNumber1 / 10;
            numberDigit++;
        }


        System.out.println("\n" + "\u001B[33m" + "Step 3 :  Separate individual digits and store them in an array." + "\u001B[0m");
        int[] arr = new int[numberDigit];

        while (inputNumber > 0) {
            arr[k] = inputNumber % 10;
            inputNumber = inputNumber / 10;
            k++;
        }

        System.out.println("\n" + "\u001B[33m" + "Step 4 :  Sort the array in ascending order." + "\u001B[0m");
        arr = bubbleSort(arr, numberDigit);

        System.out.println("\n" + "\u001B[33m" + "Step 5 :  Remove duplicated digits." + "\u001B[0m");
        arr = removeDuplicate(arr);

        System.out.println("\n" + "\u001B[33m" + "Step 6 :  Find the break in which the difference is more than commonDifference (i.e. 1)." + "\u001B[0m");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != commonDifference) {
                beginMissing = arr[i];
                endMissing = arr[i + 1];
            }
        }

        System.out.println("\n" + "\u001B[32m" + "  The missing part is between " + beginMissing + " and " + endMissing);

        System.out.println("\n" + "\u001B[33m" + "Step 7 :  Add common difference from the first part till it reaches the second part & Place the values in an array." + "\u001B[0m");
        numberMissing = endMissing - beginMissing - 1;
        int[] arrMissing = new int[numberMissing];

        tempValue = beginMissing;
        for (int i = 0; i <= numberMissing - 1; i++) {
            tempValue += 1;
            arrMissing[i] = tempValue;
        }

        System.out.println("\n" + "\u001B[33m" + "Step 8 :  Display the third value." + "\u001B[0m");
        result = arrMissing[2];

        return result;
    }

}


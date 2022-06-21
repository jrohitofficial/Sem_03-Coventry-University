package programmingForDevelopers.aday1;


/*

Question:
	int a = 1 2 3 (missing numbers) 9 10


Find missing third-smallest number


First     smallest missing number :  4
Second-smallest missing number :  5
Third-smallest missing number :  6
Fourth-smallest missing number :  7
Fifth-smallest missing number :  8

Answer must be 6.

Solution:

Step 1 :  Take the values from the same integer into an array. Result : arr1 = [1, 2, 3, 9, 10].
Step 2 :  Sorting them in ascending order. Result : arr1 = [1, 2, 3, 9, 10].
Step 3 :  Find the difference(commonDifference) between two consecutive numbers/values  (2-1 = 1).
Step 4 :  Find the break in which the difference is more than commonDifference.  That is the missing part .
			  [ 1 2 3 9 10] :  The missing part is between 3 and 9.
Step 5a: Add common difference from the first part (i.e. 3) till it reaches the second part(i.e. 9) :  Result: 4,5,6,7,8
     5b: Place the values in an array. Result:  arr = [4,5,6,7,8]
Step 6:   Display the third value. Result :  print(arr[2])

*/


import java.util.Scanner;

public class Day1Problem {


    public int returnThird() {
        int result;
        int inputNumber;
        int commonDifference = 1;
        int beginMissing = 0;
        int endMissing = 0;
        int numberMissing;
        int tempValue;


        Scanner sc = new Scanner(System.in);

        System.out.println("\nNote: There should be at least 3 missing numbers.");
        System.out.print("\nHow many integers will you enter? Ans: ");
        inputNumber = sc.nextInt();
        System.out.println(" ");


        int[] arr = new int[inputNumber];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != commonDifference) {
                beginMissing = arr[i];
                endMissing = arr[i + 1];
            }
        }

        System.out.println("\nThe missing part is between " + beginMissing + " and " + endMissing);
        numberMissing = endMissing - beginMissing - 1;

        int[] arrMissing = new int[numberMissing];

        tempValue = beginMissing;
        for (int i = 0; i <= numberMissing - 1; i++) {
            tempValue += 1;
            arrMissing[i] = tempValue;
        }

        result = arrMissing[2];

        return result;
    }

}


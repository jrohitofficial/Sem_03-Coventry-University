package programmingForDevelopers.oday20Graph.basic;

import java.util.Scanner;

public class TwoDimensionalArray {

    int[][] twoDArray;

    public void makeArray(int row, int column) {

        int[][] twoDArray = new int[row][column];

        System.out.println("Array created. \n");
        int value = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter data in array[" + i + "][" + j + "] : ");
                value = sc.nextInt();
                twoDArray[i][j] = value;
            }
        }

        this.twoDArray = twoDArray;

    }

    public void printArray() {

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length; j++) {
                System.out.println("Data in array[" + i + "][" + j + "] : " + twoDArray[i][j]);
            }
        }
    }

    public boolean searchValue(int search){
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[0].length; j++) {
                if(twoDArray[i][j] == search){
                    return  true;
                }
            }
        }

        return false;

    }


    public static void main(String[] args) {
        TwoDimensionalArray obj = new TwoDimensionalArray();
        obj.makeArray(4, 4);

        System.out.println("\n");

        obj.printArray();

    }

}

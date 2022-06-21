package programmingForDevelopers.nday19subArray;

public class SubArrayBruteForce {


    public int returnMax(int a[]) {
        int max = -99999999;

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum = sum + a[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        SubArrayBruteForce obj = new SubArrayBruteForce();

        int[] arr = {1, -6, 7, 4, -9};
        int maxSum = obj.returnMax(arr);
        System.out.println(maxSum);
    }


}

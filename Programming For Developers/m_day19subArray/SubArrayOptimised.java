package programmingForDevelopers.nday19subArray;

public class SubArrayOptimised {

    public int returnMax(int[] a, int start, int end) {

        if (start == end) {
            return a[start];
        }
        int leftMax = 0;
        int rightMax = 0;

        int mid = (start + end) / 2;

        leftMax = returnMax(a, start, mid);
        rightMax = returnMax(a, mid + 1, end);


        int sum = 0;
        int lMax = Integer.MIN_VALUE;
        for (int i = mid; i >= 0; i--) {
            sum = sum + a[i];
            if (sum > lMax) {
                lMax = sum;
            }
        }

        int sum1 = 0;
        int rMax = Integer.MIN_VALUE;
        for (int i = mid + 1; i < a.length; i++) {
            sum1 = sum1 + a[i];
            if (sum1 > rMax) {
                rMax = sum1;
            }
        }

        int crossMax = lMax + rMax;

        if (lMax > rMax && lMax > crossMax) {
            return lMax;
        } else if (rMax > lMax && rMax > crossMax) {
            return rMax;
        } else {
            return crossMax;
        }
    }


    public static void main(String[] args) {
        SubArrayOptimised obj = new SubArrayOptimised();
        int[] arr = {1, -6, 7, 4, -9};

        int maxSum = obj.returnMax(arr, 0, arr.length -1 );
        System.out.println(maxSum);
    }

}

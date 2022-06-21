package programmingForDevelopers.fday10RainwaterProblem;


// Brute force method. Rainwater Solution.


public class BruteForceSolution {

    public static int fun121(int[] a) {
        int water = 0;

        for (int i = 0; i < a.length; i++) {

            int leftMax = a[i];
            for (int j = 0; j < i; j++) {
                if (leftMax < a[j]) {
                    leftMax = a[j];
                }
            }

            int rightMax = a[i];
            for (int k = 0; k < a.length; k++) {
                if (rightMax < a[k]) {
                    rightMax = a[k];
                }
            }

            water = water + Math.min(leftMax, rightMax) - a[i];
        }

        return water;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 0, 2, 4};


        int result = fun121(a);
        System.out.println(result);

    }

}

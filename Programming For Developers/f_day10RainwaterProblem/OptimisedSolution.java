package programmingForDevelopers.fday10RainwaterProblem;

public class OptimisedSolution {

    public int trapRainWater(int height[]) {
        int water = 0;
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int j = height.length - 2; j >= 0; j--) {
            rightmax[j] = Math.max(height[j], rightmax[j + 1]);
        }

        for (int k = 0; k < height.length; k++) {
            water = water + (Math.min(leftmax[k], rightmax[k]) - height[k]);
        }
        return water;

    }

    public static void main(String[] args) {
        OptimisedSolution obj = new OptimisedSolution();
        int height[] = {3, 2, 0, 2, 4};
        int trappedwater = obj.trapRainWater(height);
        System.out.println(trappedwater);
    }


}

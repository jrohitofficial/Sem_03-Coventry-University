package programmingForDevelopers.oday20Graph.greedyApproach;

public class ActivitySelection {


    public void activitySelection(int[] start, int[] end) {
        System.out.println(" Activity " + 0);

        int k = 0;
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= end[k]) {
                k = i;
                System.out.println(" Activity " + i);
            }
        }
    }


    public static void main(String[] args) {
        ActivitySelection obj = new ActivitySelection();

        int[] start = {1, 2, 4, 5, 8, 9,   11, 13};
        int[] end =   {3, 5, 7, 9, 10, 11, 14, 16};

        obj.activitySelection(start,end);

    }

}

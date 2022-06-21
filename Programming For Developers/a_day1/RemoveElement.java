package programmingForDevelopers.aday1;

public class RemoveElement {

    public static int[] removeElement(int[] arr, int index) {

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


    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7};

        int[] arr1;
        arr1 = removeElement(arr, 2);

        for (int i : arr1) {
            System.out.println(i);
        }
    }
}


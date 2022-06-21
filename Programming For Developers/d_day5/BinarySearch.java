package programmingForDevelopers.dday5;

public class BinarySearch {

    public void binarySearchFun(int[] a, int searchValue, int start, int end) {
        int mid = (start + end) / 2;
        while (start <= end) {
            if (a[mid] < searchValue) {
                start = mid + 1;
            } else if (a[mid] == searchValue) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        if (start > end) {
            System.out.println("Element is not found!");
        }
    }

    public int binarySearchRecursive(int[] a, int searchValue, int start, int end) {

        int mid = (start + end) / 2;

        if (a[mid] == searchValue) {
            return mid;
        } else if (searchValue > a[mid]) {
            return binarySearchRecursive(a, searchValue, mid + 1, end);
        } else if (searchValue < a[mid]) {
            return binarySearchRecursive(a, searchValue, start, mid - 1);
        } else {
            return -999;
        }
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int searchValue = 10;

        ob.binarySearchFun(arr, searchValue, 0, n - 1);

        int result = ob.binarySearchRecursive(arr, searchValue, 0, n - 1);
        if (result == -999)
            System.out.println("Element not present");
        else
            System.out.println("Element is found at index: " + result);
    }

}

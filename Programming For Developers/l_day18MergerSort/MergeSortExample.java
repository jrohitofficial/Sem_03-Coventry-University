package programmingForDevelopers.mday18MergerSort;

public class MergeSortExample {

    int[] re;

    public int[] mergesort(int r[], int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(r, start, mid);
            mergesort(r, mid + 1, end);
            re = merge(r, start, mid, end);
        }
        return re;
    }

    public int[] merge(int r[], int start, int mid, int end) {
        int a[] = new int[mid - start + 1];
        int b[] = new int[end - mid];
        for (int indx = 0; indx < a.length; indx++) {
            a[indx] = r[start + indx];
        }
        for (int indx = 0; indx < b.length; indx++) {
            b[indx] = r[mid + 1 + indx];
        }
        int i = 0;
        int j = 0;
        int k = start;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                r[k] = a[i];
                i++;

            } else {
                r[k] = b[j];

                j++;
            }
            k++;
        }
        while (i < a.length) {
            r[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            r[k] = b[j];
            j++;
            k++;
        }
        return r;
    }


    public static void main(String[] args) {
        int[] r = {5, 4, 3, 2, 1, 43, 46, 23};

        MergeSortExample obj = new MergeSortExample();
        int[] arrr = obj.mergesort(r, 0, r.length - 1);


        int len = arrr.length;
        int i = 0;
        while (i < len) {
            System.out.print(arrr[i] + " ");
            i++;
        }
    }


}

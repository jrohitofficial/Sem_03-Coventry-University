package programmingForDevelopers.eday9Array;

public class ArrayExample {
    int a[];
    int length = 0;

    ArrayExample(int size) {
        a = new int[size];
        //inserting data ranges from 100 to n
        for (int i = 0; i < 4; i++) {
            a[i] = 100 + i;
            length++;
        }
    }

    public void printArray() {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public boolean insAtAnyPos(int data, int pos) {
        //data =30
        //pos=2   indxpos=pos-1=1
        if (pos > a.length || pos < 0) {
            return false;
        }
        for (int i = length; i > pos - 1; i--) {
            a[i] = a[i - 1];
        }
        a[pos - 1] = data;
        return true;


    }

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample(5);
        System.out.println("printing before inserting data");
        obj.printArray();
        obj.insAtAnyPos(30, 2);
        System.out.println("printing after inserting data");
        obj.printArray();
    }

}

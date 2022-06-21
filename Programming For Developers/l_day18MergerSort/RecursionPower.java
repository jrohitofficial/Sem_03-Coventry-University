package programmingForDevelopers.mday18MergerSort;

public class RecursionPower {

    int data;

    RecursionPower(int data) {
        this.data = data;
    }

    int value = 1;

    public int recPower(int power) {
        if (power == 0) {
            return value;
        } else {
            value = value * data;
            return recPower(power - 1);
        }
    }


    public static void main(String[] args) {
        RecursionPower obj = new RecursionPower(2);
        System.out.println(obj.recPower(7));
    }
}



package lessonSupplier_third;

import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,-1,9,10};
        IntSupplier intSupplier = new IntSuppTest(arr);
        int integer;
        for (; (integer = intSupplier.getAsInt()) != Integer.MIN_VALUE; ) {
            System.out.println(integer);
        }
    }
}

class IntSuppTest implements IntSupplier {
    private int[] arr;
    private int count = 0;

    public IntSuppTest(int[] array) {
        this.arr = array;
    }

    @Override
    public int getAsInt() {
        return count < arr.length ? arr[count++] : Integer.MIN_VALUE;
    }
}

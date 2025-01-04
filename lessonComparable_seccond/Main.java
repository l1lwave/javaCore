package lessonComparable_seccond;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 5, 4, 5};
        String[] stringArray = {"allow", "Allow", "Java"};
        Double[] doubleArray = {1.1, 2.2, 7.3, 4.4, 5.5};

        System.out.println(max(intArray));
        System.out.println(max(stringArray));
        System.out.println(max(doubleArray));
    }

    public static <T extends Comparable<T>> T max(T[] array) {
        T max = array[0];
        for (T t : array) {
            if (t.compareTo(max) > 0 && t.compareTo(max) != 0) max = t;
        }
        return max;
    }
}

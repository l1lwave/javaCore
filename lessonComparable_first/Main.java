package lessonComparable_first;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(5, 3);
        Rectangle rec2 = new Rectangle(1, 3);
        Rectangle rec3 = new Rectangle(4, 7);
        Rectangle rec4 = new Rectangle(6, 2);
        Rectangle[] rectangles = {rec1, rec2, rec3, rec4};
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }


        Arrays.sort(rectangles);
        System.out.println();

        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}

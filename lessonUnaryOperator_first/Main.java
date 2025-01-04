package lessonUnaryOperator_first;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 4, 1, 7, 5, 9, 80, 34));
        UnaryOperator<Integer> unOp = x ->{
            if(x % 2 != 0){
                return 0;
            }
            return x;
        };

        list.replaceAll(unOp);
        System.out.println(list);
    }
}

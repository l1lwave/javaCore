package lessonFunction_fifth;

import java.util.Calendar;
import java.util.function.ToIntFunction;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        ToIntFunction<Calendar> func = (Calendar c) -> c.get(Calendar.YEAR);

        System.out.println(func.applyAsInt(calendar));
    }
}

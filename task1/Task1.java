package src.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1. Написать метод markLength4, принимающий в качестве
 * параметра список (List) строк и размещающий строку "****";
 * перед каждым четырёхсимвольным элементом.
 * Оригинальные элементы должны остаться на месте.
 * Например:
 * {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
 * ->;
 * {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****",
 * "Java", "programmer"}
 */
public class Task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        List<String> result = refresh(list);
        System.out.println(result);
    }

    private static List<String> refresh(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.toCharArray().length == 4) {
                result.add("****");
            }
            result.add(s);
        }
        return result;
    }
}

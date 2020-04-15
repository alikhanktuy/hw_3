import java.util.*;

public class SortList {

    /*Написать программу, получающую из командной строки несколько чисел (число не ограничено, т.е. от одного и до того предела,
     который позволяет командная строка), а затем: выводящую полученные параметры в отсортированном в следующем порядке от 1 до 100
     по возростанию от 100 и далее в обратном порядке число 4 всегда должно быть первым
     в отсортированном списке после вывести в консоль количесвто уникальных чисел пример
     чисел [10, 20, 500, 1, 220, 3, 4, 80, 90, 110, 100] как должно быть отсортировано
     [4, 1, 3, 10, 20, 80, 90, 500, 220, 110, 100]*/
    public static void main(String[] args) {
      ArrayList<Integer> inputs = new ArrayList<Integer>();
      Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа для заполнения списка, чтобы выйти из цикла напишите done");
      while (scanner.hasNextInt())
      {
          inputs.add(scanner.nextInt());
      }
        System.out.println(inputs);
      Collections.sort(inputs, new CustomComparator());
      Set<Integer> set = new LinkedHashSet<>(inputs);
        System.out.println(set);
    }

}

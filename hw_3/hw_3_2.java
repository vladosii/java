// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;

public class hw_3_2 {
    public static void main(String[] args){
        Integer[] array = new Integer[]{1, 2, 5, 8, 3, 22};
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            list1.add(array[i]);
        }
        System.out.println();

        List<Integer> newList1 = removeNumbers(list1);
        System.out.println(newList1);
    }

    public static List<Integer> removeNumbers(List<Integer> list1){
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)%2 != 1){
                // System.out.print(list1.get(i)+" ");
                list1.remove(i);
            }
        }
        return list1;
    }
}

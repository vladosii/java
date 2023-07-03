
// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;

public class hw_3_3 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(8);
        numbers.add(2);
        numbers.sort(null);
        int count = numbers.size()-1;
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        int avg = sum / count;
        System.out.println("Max = "+numbers.get(count));
        System.out.println("Min = "+numbers.get(0));
        System.out.println("Avg = "+avg);
    }
}
package HW3;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static java.lang.String.format;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = fillArray();
        dataProcessing(arrayList);
    }

    public static ArrayList<Integer> fillArray() {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 10));
        }
        System.out.println(myList);
        return myList;
    }

    public static void dataProcessing(ArrayList<Integer> list) {
        int avr = 0;
        for (int i = 0; i < list.size(); i++) {
            avr += list.get(i);
        }
        System.out.println(String.format("\nМинимальное: %d\nМаксимальное: %d\nСреднее: %.1f\n", Collections.min(list),
                Collections.max(list), (double)avr/ list.size()));
    }
}

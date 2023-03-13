package HW3;
//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = fillArray();
        System.out.println(arrayList);
        System.out.println(withoutEven(arrayList));

    }

    public static ArrayList<Integer> fillArray() {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 10));
        }
        return myList;
    }

    public static ArrayList<Integer> withoutEven(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i--;
            }
        }
        return list;
    }
}

package array;

import java.util.Random;

//TODO: 01.02.23
//    Объявить массив пустой длинной 22
//    Заполнить его рандомом, диапозон до 100
//    Вывести на экран каждый элемент массива циклом foreach

public class Test4 {
    //объявляем пустой массив длинной 22
    static int[] array = new int[22];

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            //заполняем массив рандомом:
            array[i] = random.nextInt(100);// диапозон до 100
        }
        //Вывести на экран каждый элемент массива циклом foreach:
        for (int j:array) { //для нашего массива array,
                            // каждый элемент передаём в переменную j
            System.out.println(j);
        }
    }
}
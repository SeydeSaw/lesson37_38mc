package test;
/*
Обявить 2 массива интовых:
    1 массив Пустой длинной 22
    2 массив Заполненный длинной 8
В методе main пройтись по большому массиву и
записать туда значения из второго массива
пока не закончится первый массив.
 */

import java.util.Arrays;

public class Test3 {
    //создаем пустой массив:
    static int[] array1 = new int[22];
    //создаем Заполненный массив:
    static int[] array2 = {2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        //обращаемся ко второму массиву:
        for (int i = 0; i < array2.length; i++) {
            //обращаемся к Индексу массива и присваиваем его значения в первый массив:
            array1[i] = array2[i];
        }
        System.out.println(Arrays.toString(array1));
    }
}

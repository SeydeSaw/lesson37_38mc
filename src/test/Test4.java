package test;

import java.util.Random;

/*
на уровне класса объявить массив длинной 11
заполнить массив рандомом диапазон до 22
при помощи цикла while выводить на экран элемент массива * 10
 */
public class Test4 {
    //объявляем Пустой масив:
    static int[] array = new int[11];

    public static void main(String[] args) {
        Random random = new Random();
        //заполняем массив рандомными числами:
        for (int i = 0; i < array.length; i++) {
//обращаемся к массиву и индексу и присваиваем рандомное значение
            array[i] = random.nextInt(23);//диапазоном до 22
        }

        //объявляем дополнительну переменную:
        int j = 0;
        //заполняем массив через цикл while:
        while(j < array.length){
            System.out.println(array[j] * 10);
            //увеличиваем j на 1 :
            j++;//чтобы цикл не был бесконечным и j не начинался всегда с нуля
        }
    }

}

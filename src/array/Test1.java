package array;

import java.util.Arrays;
import java.util.Random;

//TODO: 01.02.23
//  создать массив интов пустой размером 22
//  заполнить массив рандомными значениями
//  если рандомное значение чётное, то прибавить 1 и записать в массив
//  если рандоиное значение нечётное, то просто записать в массив
public class Test1 {
    public static void main(String[] args) {
        //создаём Random:
        Random random = new Random();
        //создать пустой массив длинной 22:
        int[] array = new int[22];
        //заполняем массив рандомными числами:
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);//диапозаном до 50
            //Проверяем чётное или нет и записываем в массив:
            if (array[i] % 2 == 0){
                array[i] += 1;
            }
        }
        //Вывести массив на экран:
        System.out.println(Arrays.toString(array));
    }
}
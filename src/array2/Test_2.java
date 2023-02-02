package array2;

import java.util.Arrays;
import java.util.Random;

// TODO: 02.02.23
//  создать метод, который ничего не возвращает
//  Заполнить массив с конца, вывести на экран
//  Затем перевернуть этот массив и вывести на экран
//  МОЙ ВАРИАНТ РЕШЕНИЯ
public class Test_2 {
    //объявляем метод:
    public static void getArray(int[] array){
        //объявляем 2 массива:
        int[] order = new int[array.length];
        int[] reverse = new int[array.length];
        //заполняем массив циклом с конца:
        for (int i = array.length -1;i > -1 ; i--) {//i=0, написать не можем и поэтому пришем i больше -1,т.е. 0
            //присваиваем элементу массива рандомное число:
            order[i] = new Random().nextInt(50);//диапазон до 50
        }
        //выводим на экран:
        System.out.println(Arrays.toString(order));
        //заполняем массив reverse:
        for (int i = 0; i < order.length; i++) {
            reverse[i] = order[order.length - (i+1)];
        }
        System.out.println(Arrays.toString(reverse));
    }
    //чтобы вывести метод на экран создаём метод main%
    public static void main(String[] args) {
        //объявляем массив и передаём метод:
        int[]array = new int[10];//длина массива
        getArray(array);
    }
}
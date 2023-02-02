package array2;

import java.util.Arrays;
import java.util.Random;

// TODO: 02.02.23
//  Заполнить массив задом наперёд
public class Test1 {
    //создаём метод, который принимает массив, но не возвращает(void):
    public static void arrayExample (int[] array) {
        //заполняем массив :
        int[] array1 = new int[array.length];
        //проходим циклом задом наперёд:
        for (int i = array.length -1; i > -1; i--) {//i=0, написать не можем и поэтому пришем i больше -1,т.е. 0
            //присваиваем элементу массива рандомное число:
            array1[i] = new Random().nextInt(100);//диапазон 100
        }
        //выводим на экран массив:
        System.out.println(Arrays.toString(array1));
    }

    //чтобы вывести метод на экран создаём метод main%
    public static void main(String[] args) {
        //объявляем массив и передаём метод:
       //int[] array1 = new int[10];//определенаая длина
        int[] array1 = new int[new Random().nextInt(100)];//рандомная длина
        //обращаемся к методу и вызываем массив:
        arrayExample(array1);
    }
}
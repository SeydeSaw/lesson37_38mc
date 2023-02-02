package array;

import java.util.Arrays;
import java.util.Random;

// TODO: 02.02.23
//  создать метод, который принимает массив и возвращает
//  заполнить массив рандомом длинной до 55
//  проверить на чётность, если чётное, то сделать нечётным,
//  если нечётное , то сделать чётным
//  в методе main создаём экзэмпляр класса и вызываем
public class Test5 {
    //создаём метод , который принимает и возвращает массив:
    public int[] getArray (int[] array) {
        //создаём массив интов, в который будут элементы сохраняться:
        int[] array2 = new int[array.length];
        Random random = new Random();
        //заполняем массив рандомно:
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(55);//диапозон до 55
        }
        //проверяем элементы массива на чётность:
        for (int i = 0; i < array2.length; i++) {
            if(array2[i] % 2 == 0) {//если элемент i массива ,остаток от деления по 2 равен нулю, то чётное
                //делаем нечётным:
                array2[i] += 1;//array2[i] = array2[i] + 1;
            }
            else {
                //делаем чётным:
                array2[i] += 1;
            }
        }
    //возвращаем заполненный массив array2:
    return array2;
    }
    //создаём метом main:
    public static void main(String[] args) {
        //создать массив, в который будем передавать созданный ранее метод:
        int[]array3 = new int[10];//в [] вводим длину массива, какую хотим

        //создать экзэмпляр класса(объект):
        Test5 test6 = new Test5();
        //обращаемся к классу и вызваем созданный ранее метод, передаём созданный массив и выводим на экран:
        //test6.getArray(array3);
        System.out.println(Arrays.toString(test6.getArray(array3)));
    }
}
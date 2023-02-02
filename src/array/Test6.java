package array;

import java.util.Arrays;
import java.util.Random;

// TODO: 02.02.23
//  Создать приватный метод, который принимает и возвращает массив
//  в которой передаём массив
//  заполнить рандомом первые 3 элемента массива
//  остальные элементы массива заполнить через цикл while
//  суммой трёх предыдущих элементов
//  например: 4 элемент[3] принимает сумму = первого элемента[0]+ второго элемента[1]+ тртьего элемента[2]
//  в методе main создаём экзэмпляр класса и вызываем
public class Test6 {
    //Создать приватный метод, который принимает и возвращает массив
    private int[] getArray(int[] array) {
        //вызываем рандом:
        Random random = new Random();
        //создаём переменную, стартовую позицию для цикла while:
        int startPosition = 3;//так как нам надо начинать с 3тьей позиции в массиве[3]
        //создаём массив, в котором будем записывать элементы:
        int[] array1 = new int[array.length];
        //заполняем массив:
        for (int i = 0; i < array.length; i++) {
            array1[i] = random.nextInt(33);//диапазоном до 33
        }
        //заполнить далее массив через цикл while:
        while (startPosition < array.length){
            //array1[3]= array1[0] + array1[1] + array1[2];//чтобы не прописывать постоянно,
                                                // обращаемся к созданной переменной startPosition
            array1[startPosition] = array1[startPosition - 3] + array1[startPosition - 2] + array1[startPosition - 1];
            startPosition++;//стартавая позиция увеличивается на 1
        }
        //возвращаем заполненный массив:
        return array1;
    }
    //  в методе main создаём экзэмпляр класса и вызываем:
    public static void main(String[] args) {
        //создать массив, в который будем передавать созданный ранее метод:
        int[]array2 = new int[10];//в [] вводим длину массива, какую хотим

        //создать экзэмпляр класса(объект):
        Test6 test6 = new Test6();
        //обращаемся к классу и вызваем созданный ранее метод, передаём созданный массив и выводим на экран:
        //test7.getArray(array2);
        System.out.println(Arrays.toString(test6.getArray(array2)));
    }
}
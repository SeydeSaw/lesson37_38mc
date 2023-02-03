package stringArray;

import java.util.Arrays;

/*
todo
    Переменная lang может принимать 2 значения ru и en
    Если она имеет значение ru , то в переменную arr
    запишем массив дней недели на русском
    Если имеет значение en , то на английском
    Решить задачу через через switch-case
 */
public class ArrString {
    //создаём метод, который принимает параметр- переменную lang:
    public void getResult(String lang) {
        //объявляем 2 массива и инициализируем(заполняем) его:
        String[] weekDayRu = {"пн", "вт", "ср", "чт", "пт", "сб", "вс"};
        String[] weekDayEn = {"mn", "ts", "wd", "th", "fr", "st", "sn"};
        //
        switch (lang) {

            case "ru" -> System.out.println(Arrays.toString(weekDayRu));
            // второй вариант прописи кода:
            // case "ru":
            // System.out.println(Arrays.toString(weekDayRu));
            // break;

            case "en" -> System.out.println(Arrays.toString(weekDayEn));
            // второй вариант прописи кода:
            // case "en":
            // System.out.println(Arrays.toString(weekDayEn));
            // break;

            default -> throw new IllegalStateException("Unexpected value: " + lang);
            // второй вариант прописи кода:
            // default:
            // throw new IllegalStateException("Unexpected value: " + lang);
        }
    }
    //выводим на консоль метод getResult(т.к.он не статический, обращаемся к объекту):
    public static void main(String[] args) {
        //Создаём объект класса:
        ArrString arrString = new ArrString();
        //Вызываем метод:
        arrString.getResult("ru");
        arrString.getResult("en");
    }
}
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Задача 1
Объявите переменные типа int, byte, short, long, float, double.
Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
Выведите в консоль значение каждой переменной в формате «Значение переменной ... с типом ... равно ...». */

        int numberInt = 120;
        byte smallNumber = 105;
        short shortValue = -1378;
        long longValue = 1434567L;
        float floatValue = 143.48f;
        double doubleValue = -2.3243;
        System.out.println("Значение переменной numberInt с типом int равно " + numberInt );
        System.out.println("Значение переменной smallNumber с типом byte равно " + smallNumber);
        System.out.println("Значение переменной shortValue с типом short равно " + shortValue);
        System.out.println("Значение переменной longValue с типом long равно " + longValue);
        System.out.println("Значение переменной floatValue с типом float равно " + floatValue);
        System.out.println("Значение переменной doubleValue с типом double равно " + doubleValue);

        /* Задача 2
Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
Значения:
• 27.12
• 987 678 965 549
• 2,786
• 569
• -159
• 27897
• 67 */

        doubleValue = 27.12;
        longValue = 987678965549L;
        floatValue = 2.786F;
        numberInt = 569;
        shortValue = -159;
        numberInt = 27897;
        shortValue = 67;

        System.out.println(doubleValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(numberInt);
        System.out.println(shortValue);

        System.out.println(numberInt);
        System.out.println(shortValue);

        /*Задача 3
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
• за 20 минут,
• в сутки,
• за 3 дня,
• за 1 месяц?*/

        int bottlesInTwoMinutes = 16;
        int bottlesInOneMinutes = bottlesInTwoMinutes / 2;

        System.out.println("за 20 минут: " + bottlesInOneMinutes * 8 + " бутылок");
        System.out.println("в сутки: " + bottlesInOneMinutes * 60 * 24 + " бутылок");
        System.out.println("за 3 дня: " + bottlesInOneMinutes * 60 * 24 * 3 + " бутылок");
        System.out.println("за 1 месяц: " +bottlesInOneMinutes * 60 * 24 * 30 +" бутылок");

        /*Задача 4: Перевод минут в часы
        Описание:
        Напишите программу, которая преобразует количество минут в часы и минуты.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количсество минут: ");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int minute = minutes % 60;

        System.out.println(hours + " часа и " + minute + " минут" );
        scanner.close();

       /* Задача 5: Определение возраста
        Описание: Напишите программу, которая проверяет возраст, заданный в переменной, и выводит соответствующее сообщение:
• Если возраст меньше 18, выводится "Вы еще молоды".
• Если возраст от 18 до 60, выводится "Вы в самом расцвете сил".
• Если возраст больше 60, выводится "Вы в зрелом возрасте"*/

        Scanner scannerAge = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = scannerAge.nextInt();

        if (age < 18) {
            System.out.println("Вы еще молоды");
        }
        else if (age >= 18 && age <= 60) {
            System.out.println("Вы в самом расцвете сил");
        }
        else {
            System.out.println("Вы в зрелом возрасте");
        }
    }
}
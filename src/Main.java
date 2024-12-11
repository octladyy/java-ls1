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
        System.out.println("Значение переменной numberInt с типом int равно " + numberInt);
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

        double doubleSecondValue = 27.12;
        long longSecondValue = 987678965549L;
        float floatSecondValue = 2.786F;
        int numberSecondInt = 569;
        short shortSecondValue = -159;
        int numberThirdInt = 27897;
        short shortThirdValue = 67;

        System.out.println(doubleSecondValue);
        System.out.println(longSecondValue);
        System.out.println(floatSecondValue);
        System.out.println(numberSecondInt);
        System.out.println(shortSecondValue);
        System.out.println(numberThirdInt);
        System.out.println(shortThirdValue);

        /*Задача 3
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
• за 20 минут,
• в сутки,
• за 3 дня,
• за 1 месяц?*/

        int bottlesInTwoMinutes = 16;
        int bottlesMinutes = bottlesInTwoMinutes / 2;
        int bottlesInTwentyMinute = bottlesMinutes * 8;
        int bottlesOneDay = bottlesMinutes * 60 * 24;
        int bottlesThreeDays = bottlesMinutes * 60 * 24 * 3;
        int bottlesOneMonth = bottlesMinutes * 60 * 24 * 30;

        System.out.println("за 20 минут: " + bottlesInTwentyMinute * 8 + " бутылок");
        System.out.println("в сутки: " + bottlesOneDay * 60 * 24 + " бутылок");
        System.out.println("за 3 дня: " + bottlesThreeDays * 60 * 24 * 3 + " бутылок");
        System.out.println("за 1 месяц: " + bottlesOneMonth * 60 * 24 * 30 + " бутылок");

        /*Задача 4: Перевод минут в часы
        Описание:
        Напишите программу, которая преобразует количество минут в часы и минуты.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество минут: ");
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        int minute = minutes % 60;

        System.out.println(hours + " часа и " + minute + " минут");


       /* Задача 5: Определение возраста
        Описание: Напишите программу, которая проверяет возраст, заданный в переменной, и выводит соответствующее сообщение:
• Если возраст меньше 18, выводится "Вы еще молоды".
• Если возраст от 18 до 60, выводится "Вы в самом расцвете сил".
• Если возраст больше 60, выводится "Вы в зрелом возрасте"*/

        Scanner scannerAge = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scannerAge.nextInt();

        if (age < 18) {
            System.out.println("Вы еще молоды");
        } else if (age >= 18 && age <= 60) {
            System.out.println("Вы в самом расцвете сил");
        } else {
            System.out.println("Вы в зрелом возрасте");
        }

        /*Задача 6:*Оценка по баллам
        Описание: Напишите программу, которая присваивает оценку на основе баллов, заданных в переменной:
• 90 и выше — "Отлично".
• От 70 до 89 — "Хорошо".
• От 50 до 69 — "Удовлетворительно".
• Менее 50 — "Неудовлетворительно"*/

        System.out.print("Введите вашу оценку: ");
        int grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("Отлично");
        } else if (grade >= 70) {
            System.out.println("Хорошо");
        } else if (grade >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }

       /* Задача 7: Определение наибольшего числа
        Описание: Напишите программу, которая находит большее из двух чисел, заданных в переменных.*/

        System.out.print("Введите первое число: ");
        int numberOne = scanner.nextInt();

        System.out.print("Введите второе число:");
        int numberTwo = scanner.nextInt();

        if (numberOne > numberTwo) {
            System.out.print("Большее число: " + numberOne);
        }
        else if (numberTwo > numberOne) {
            System.out.print("Большее число: " + numberTwo);
        }
        else {
            System.out.print("Оба числа равны: " + numberOne + "=" + numberTwo);
        }
    }
}


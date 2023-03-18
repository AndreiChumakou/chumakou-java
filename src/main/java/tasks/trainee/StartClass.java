package tasks.trainee;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StartClass {

    public static boolean finishApplication;
    public static final Scanner in = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        while (!finishApplication) {
            System.out.println("\nДанная программа демонстрирует решение задач тестового задания.");

            System.out.println("\nВыберите номер задания (от 1 до 4): \n" +
                    "1. Составить алгоритм: если введенное число больше 7, то вывести \"Привет\". \n" +
                    "2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести" +
                    " \"Привет, Вячеслав\",если нет, то вывести \"Нет такого имени\".\n" +
                    "3. Составить алгоритм: на входе есть числовой массив, необходимо вывести " +
                    "элементы массива кратные 3.\n" +
                    "4. Определить, является ли представленная скобочная последовательно правильной.\n");
            int numberTask = new VerificationData().verifyNumberTask();
            switch (numberTask) {
                case 1: {
                    new TaskOne().displayGreeting();
                    break;
                }
                case 2: {
                    new TaskTwo().displayGreetingWithName();
                    break;
                }
                case 3: {
                    new TaskThree().outputValuesFromArray();
                    break;
                }
                case 4: {
                    new TaskFour().ouputTaskFour();
                    break;
                }
            }
            System.out.println("\nДля выхода из программы введите Q и нажмите ENTER.\n" +
                    "Для продолжение работы введите любую другую кнопку и нажмите ENTER.");
            String currentInput = in.next();
            in.nextLine();
            if (currentInput.equalsIgnoreCase("Q")) {
                finishApplication = true;
            }
        }
        in.close();
    }
}

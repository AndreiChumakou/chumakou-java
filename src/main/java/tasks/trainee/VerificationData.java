package tasks.trainee;

import java.util.ArrayList;
import static tasks.trainee.StartClass.in;

public class VerificationData {

    public int verifyNumberTask() {
        int numberTask = 0;
        while (in.hasNext()) {
            if (in.hasNextInt()) {
                numberTask = in.nextInt();
                if (numberTask >= 1 && numberTask <= 4)
                    break;
            }
            System.out.print("Введено некорректное значение." +
                    " \nВведите, пожалуйста, номер задания от 1 до 4: ");
            in.nextLine();
        }
        return numberTask;
    }

    public double verifyInputNumber() {
        double number = 0;
        while (in.hasNext()) {
            if (in.hasNextDouble()) {
                number = in.nextDouble();
                break;
            }
            System.out.print("Введено некорректное значение." +
                    " \nВведите, пожалуйста, число: ");
            in.nextLine();
        }
        return number;
    }

    public double[] verifyInputArray() {
        ArrayList<Double> listNumbers = new ArrayList<>();
        String currentInput;
        while (in.hasNext()) {
            currentInput = in.next();
            if (!currentInput.equalsIgnoreCase("Q")) {
                try {
                    listNumbers.add(Double.parseDouble(currentInput));
                } catch (NumberFormatException e) {
                    System.out.println("Введено некорректное значение. Разрешен ввод только чисел.\n" +
                            "Введите, пожалуйста, любое число: ");
                }
            } else break;
        }

        // According to the terms of the task: the input is a numeric array

        double[] arrayNumbers = new double[listNumbers.size()];
        for (int i = 0; i < listNumbers.size(); i++) {
            arrayNumbers[i] = listNumbers.get(i);
        }
        return arrayNumbers;
    }
}

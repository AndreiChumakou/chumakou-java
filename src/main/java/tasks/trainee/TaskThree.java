package tasks.trainee;

public class TaskThree {

    public void outputValuesFromArray() {
        System.out.println("Введите значения элементов числового массива." +
                " (Ввод значений осуществляется через ENTER. Для выхода введите Q): ");
        double[] arrayNumbers = new VerificationData().verifyInputArray();
        System.out.println("Элементы массива, кратные 3:");
        for (double number : arrayNumbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}

package tasks.trainee;

public class TaskOne {

    public void displayGreeting() {
        System.out.print("\nВведите любое число: ");
        double inputNumber = new VerificationData().verifyInputNumber();
        System.out.println(inputNumber > 7 ? "Привет" : "При таком значении числа вывод не определен.");
    }
}

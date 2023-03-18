package tasks.trainee;

import static tasks.trainee.StartClass.in;

public class TaskTwo {

    public void displayGreetingWithName() {
        System.out.println("\nВведите любое имя:");
        String name = in.next();
        System.out.println(name.equalsIgnoreCase("Вячеслав")
                ? "Привет, Вячеслав"
                : "Нет такого имени");
    }
}

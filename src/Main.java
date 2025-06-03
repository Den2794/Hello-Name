import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static String name = "";
    private static int age;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите ваш возраст.");
        setAge(checkingTheNumber());
        System.out.println("Ваш возвраст " + getAge() + " лет? Круто!");
        System.out.println("Введите ваше имя.");

        setName(scanner.nextLine());
        System.out.println("Hello, " + getName() + "!");

    }

    public static int checkingTheNumber(){

        int userInput = 0;
        boolean isCorrectInput = false;
        while (!isCorrectInput) {
            try {
                userInput = scanner.nextInt();
                isCorrectInput = true;
                } catch (InputMismatchException e) {
                System.out.println("Введите число!");
            }   finally {
                scanner.nextLine();
            }
        }

        return userInput;
    }
    public static String getName() {
        return name;
    }

    public static void setName(String userInput) {
        name = userInput;
    }

    public static void setAge(int age) {
        Main.age = age;
    }

    public static int getAge() {
        return age;
    }
}
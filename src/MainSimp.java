import java.util.ArrayList;
import java.util.Scanner;

// Является ли число простым

public class MainSimp {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isSimpl = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isSimpl = false;
                break;
            }
        }

        System.out.println(isSimpl ? "Простое" : "Не простое");
    }
}
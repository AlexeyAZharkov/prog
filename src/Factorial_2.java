import java.util.Scanner;

// 2 Рекурсивное вычисление факториала

public class Factorial_2 {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(factor(number));
    }

    private static int factor(int num) {
        int result;
        if (num == 0) {
            result = 1;
        }
        else {
            result =  num * factor(num - 1);
        }
        return result;
    }
}
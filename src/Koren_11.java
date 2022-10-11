import java.util.Random;
import java.util.Scanner;

//Вычислить квадратный корень числа, возвращая только целую часть корня.

public class Koren_11 {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int res = 1;

        while (res * res <= number) {
            res++;
        }
        System.out.println(Math.sqrt(number));
        System.out.println((int) Math.sqrt(number));
        System.out.println(res-1);
    }
}
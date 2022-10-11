import java.util.Scanner;

//Последовательность Фибоначчи

public class Fibonach12 {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int f1 = 0, f2 = 1, res = 1;

        while (res <= number) {
            res = f1 + f2;
            f1 = f2; f2 = res;
            System.out.print(res + " ");
        }
//        System.out.println(Math.sqrt(number));
//        System.out.println((int) Math.sqrt(number));
//        System.out.println(res-1);
    }
}
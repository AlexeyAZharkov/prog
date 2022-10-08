import java.util.Scanner;

//Реверс числа без использования строк

public class Revers {
    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int numberRev = 0;

        while (number > 9) {
            numberRev *= 10;
            numberRev += number % 10;
            number /= 10;
        }
        numberRev *= 10;
        numberRev += number;

        System.out.println(numberRev);
    }
}
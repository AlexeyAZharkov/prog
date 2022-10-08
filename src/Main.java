import java.util.ArrayList;
import java.util.Scanner;

//Реверс числа без использования строк

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        System.out.println("Введите число:");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberRev = 0;
        while (number > 9) {
            arr.add(number % 10);
            number /= 10;
        }
        arr.add(number);
        int arLen = arr.size();
        for (int a : arr) {
            arLen--;
            numberRev += a * Math.pow(10, arLen); ;
        }

        System.out.println(numberRev);
    }
}
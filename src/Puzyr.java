import java.util.Random;

//пузырьковая сортировка

public class Puzyr {
    public static void main(String[] args) {
        int y[] = {1, 2, 4, 6, 3, 4, 7, 5};
        Random random = new Random();

        int x[] = new int[10];
        for (int i = 0 ; i < 10; i++) {
            x[i] = random.nextInt(19);
            System.out.print(x[i] + " ");
        }
        for (int j = 9; j > 2; j--) {
            for (int i = 0; i < j; i++) {
                if (x[i] > x[i+1]) {
                    int t = x[i];
                    x[i] = x[i+1];
                    x[i+1] = t;
                }
            }
        }
        System.out.println();
        printArr(x);
    }

    public static void printArr(int x[]) {
        for (int i = 0 ; i < 10; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
import java.util.Random;

// 7 Дан массив с числами, одно число удалили и перемешали массив. Найти удаленное число.

public class ArrDel_7 {
    public static void main(String[] args) {
//        int y[] = {1, 2, 4, 6, 3, 4, 7, 5};
        Random random = new Random();
        int k;
        int res = 0;

        int x[] = new int[10];
        int z[] = new int[10];
        int y[] = new int[9];
        for (int i = 0 ; i < 10; i++) {
            x[i] = random.nextInt(29) + 1;
            z[i] = x[i];
            System.out.print(x[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < 9; i++) {
            do {
                k = (int) (Math.random() * 10);
            } while (x[k] == 0);
            y[i] = x[k];
            x[k] = 0;
            System.out.print(y[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 9; j++) {
                if (z[i] == y[j]) {
                    z[i] = 0;
                    y[j] = 0;
                }
            }
            if (z[i] != 0) {
                res = z[i];
                break;
            }
        }
        System.out.println(res);
    }
}
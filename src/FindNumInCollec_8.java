import java.util.Random;

// 8 Найти общее число в трёх коллекциях, не используя дополнительные структуры

public class FindNumInCollec_8 {
    public static void main(String[] args) {
        int x[] = {1, 2, 3, 4, 5};
        int y[] = {4, 6, 7, 8};
        int z[] = {9, 4, 13, 14, 16, 5};
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                for (int k = 0; k < z.length; k++) {
                    if (x[i] == y[j] && x[i] == z[k]) {
                        System.out.println(x[i]);
                        break;
                    }
                }
            }
        }
    }
}
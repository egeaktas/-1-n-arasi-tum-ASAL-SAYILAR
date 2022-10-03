// 1 ile n arasındaki asal sayıları basar.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1 ile n arasındaki asal sayıları görmek için n sayısını giriniz: ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (asalMi(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean asalMi(int num) {
        int x = num / 2;
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i <= x; i++) {
                if (num % 2 == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
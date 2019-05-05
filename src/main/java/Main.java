import javafx.scene.layout.Priority;

import java.util.AbstractMap;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("2 5 1 2 3 4 5");
        int n = scanner.nextInt(); //количество процессоров
        int m = scanner.nextInt(); //количество процессов
        long[][] a = new long[][][n][2];
        Comparator<long[]> c1 = (x, y) -> x[1] <= y[1] ? 1 : -1; //компаратор времени
        Comparator<long[]> c2 = (x, y) -> x[0] <= y[0] ? 1 : -1; //компаратор нумерации процессора
        Comparator<long[]> c3 = c1.thenComparing(c2); //финальный компаратор
        PriorityQueue<long[]> q = new PriorityQueue<>(c3);
        for (int i = 0; i < n; i++) {
            a[i][0] = i;
            q.add(a[i]);
            System.out.print(i + " 0\n");
        }
        for (int i = 0; i < m; i++) {

        }





    }
}

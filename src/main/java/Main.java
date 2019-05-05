import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //количество процессоров
        int m = scanner.nextInt(); //количество процессов
        long[][] a = new long[n][2];
        Comparator<long[]> c1 = (x, y) -> {
            if (x[1] > y[1]) return 1;
            if (x[1] < y[1]) return -1;
            return 0;
        };//компаратор времени
        Comparator<long[]> c2 = (x, y) -> {
            if (x[0] > y[0]) return 1;
            if (x[0] < y[0]) return -1;
            return 0;
        }; //компаратор нумерации процессора
        Comparator<long[]> c3 = c1.thenComparing(c2); //финальный компаратор
        PriorityQueue<long[]> q = new PriorityQueue<>(c3);
        for (int i = 0; i < n; i++) {
            a[i][0] = i;
            q.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            long[] j = q.poll();
            System.out.print(j[0] + " " + j[1] + "\n");
            j[1] += scanner.nextInt();
            q.add(j);
        }
    }
}

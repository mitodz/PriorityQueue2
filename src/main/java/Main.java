import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("2 5 1 2 3 4 5");
        int n = scanner.nextInt(); //количество процессоров
        int m = scanner.nextInt(); //количество процессов
        Comparator<int[]> c1 = (x, y) -> x[1] >= y[1] ? 1 : -1; //компаратор времени
        Comparator<int[]> c2 = (x, y) -> x[0] <= y[0] ? 1 : -1; //компаратор нумерации процессора
        Comparator<int[]> c3 = c1.thenComparing(c2); //финальный компаратор



    }
}

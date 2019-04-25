import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //количество процессоров
        HeapMin heapOfProcessors = new HeapMin();
        for (int i = 0; i < n; i++) {
            heapOfProcessors.insert(i);
        }
        int m = scanner.nextInt(); //количество процессов
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("5 5 4 3 2 1");
        int n = scanner.nextInt(); //количество процессоров
        HeapMin heapOfProcessors = new HeapMin();
        for (int i = 0; i < n; i++) {
            heapOfProcessors.insert(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.print(heapOfProcessors.extractMin() + " ");
        }
        //int m = scanner.nextInt(); //количество процессов
    }
}

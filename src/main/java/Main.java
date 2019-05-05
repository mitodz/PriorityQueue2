import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("2 5 1 2 3 4 5");
        int n = scanner.nextInt(); //количество процессоров
        int m = scanner.nextInt(); //количество процессов
        HeapMin heapOfProcessors = new HeapMin();
        for (int i = 0; i < n; i++) {
            heapOfProcessors.insert(scanner.nextInt());
        }
        //реализовать нумерацию процессоров
        for (int i = 0; i < n; i++) {
            int[] ints = heapOfProcessors.extractMin();
            System.out.print(ints[0] + " " + ints[1] + "\n");
        }
    }
}

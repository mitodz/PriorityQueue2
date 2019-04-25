import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //количество процессоров
        int m = scanner.nextInt(); //количество процессов
        Heap h = new Heap();
        for (int i = 0; i < n; i++) {
            h.insert(scanner.nextInt());
        }
    }
}

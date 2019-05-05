import java.util.Arrays;

public class HeapMin {
    private int maxSize = 20;
    private int[][] H = new int[maxSize][2];
    private int size = -1;

    public HeapMin(){};

    public HeapMin (int maxSize) {
        this.maxSize = maxSize;
    }

    private void siftUp(int i) {
        while (i > 0 && H[parent(i)][1] > H[i][1]) {
            if (parent(i)==parent(i-1) && H[i-1][1] < H[i][1]) return;
            swap(i, parent(i));
            i = parent(i);
        }
    }

    private void siftDown(int i) {
        int minIndex = i;
        int l = left(i);
        if (l <= size && H[l][1] < H[minIndex][1]) {
            minIndex = l;
        }
        int r = right(i);
        if (r <= size && H[r][1] < H[minIndex][1]) {
            minIndex = r;
        }
        if (i != minIndex) {
            swap(i, minIndex);
            siftDown(minIndex);
        }
    }

    public void insert(int p) {
        if (size == maxSize - 1) {
            H = Arrays.copyOf(H, maxSize * 3 / 2);
            maxSize = maxSize * 3 / 2;
        }
        size++;
        H[size][1] = p;
        H[size][0] = size;
        siftUp(size);
    }

    public int[] extractMin() {
        int[] result = H[0];
        H[0] = H[size];
        size--;
        siftDown(0);
        return result;
    }

    public void remove(int i) {
        H[i][1] = Integer.MIN_VALUE;
        siftUp(i);
        extractMin();
    }

    public void changePriority(int i, int p) {
        int oldP = H[i][1];
        H[i][1] = p;
        if (p < oldP) {
            siftUp(i);
        } else {
            siftDown(i);
        }
    }

    private void swap(int i, int j) {
        int[] t = H[i];
        H[i] = H[j];
        H[j] = t;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }
}
import java.util.*;

class Zerotoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int x : a)
            if (x != 0) a[k++] = x;

        while (k < n) a[k++] = 0;

        for (int x : a) System.out.print(x + " ");
    }
}
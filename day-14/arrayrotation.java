import java.util.*;

class Arrayrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int k = sc.nextInt();
        k %= n;

        for (int i = n-k; i < n; i++)
            System.out.print(a[i] + " ");

        for (int i = 0; i < n-k; i++)
            System.out.print(a[i] + " ");
    }
}
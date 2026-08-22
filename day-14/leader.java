import java.util.*;

class Learder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {
            if (a[i] >= max) {
                ans.add(a[i]);
                max = a[i];
            }
        }

        Collections.reverse(ans);
        for (int x : ans) System.out.print(x + " ");
    }
}
import java.util.*;

class Twosun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int target = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();

        for (int x : a) {
            if (set.contains(target - x)) {
                System.out.println((target - x) + " " + x);
                return;
            }
            set.add(x);
        }
        System.out.println("No Pair");
    }
}
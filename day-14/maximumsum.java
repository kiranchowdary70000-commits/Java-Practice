import java.util.*;

class Maximumsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            sum = Math.max(x, sum + x);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
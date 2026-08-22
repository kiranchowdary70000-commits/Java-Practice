import java.util.*;

class Missing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;

        for (int i = 0; i < n - 1; i++)
            sum += sc.nextInt();

        int total = n * (n + 1) / 2;
        System.out.println(total - sum);
    }
}
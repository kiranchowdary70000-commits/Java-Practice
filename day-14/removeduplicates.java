import java.util.*;

class Removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++)
            set.add(sc.nextInt());

        for (int x : set)
            System.out.print(x + " ");
    }
}
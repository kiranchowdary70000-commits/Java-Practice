import java.util.Scanner;
public class secondlargestelement {
    public static void main(String[] args){
        Scanner gs = new Scanner(System.in);
        int n = gs.nextInt();
        int[] arr= new int[n];
        for(int i = 1; i < n; i++){
            arr[i] = gs.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > largest){
                second = largest;
                largest = num;
            }
            else if(num > second && num != largest){
                second = num;
            }
            if(second == Integer.MIN_VALUE){
                System.out.println(-1);
            }
            else{
                System.out.println(second);
            }
        }
    }
}
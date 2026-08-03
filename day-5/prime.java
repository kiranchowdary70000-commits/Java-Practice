import java.util.Scanner;
public class prime{
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // int count = 0;
        // int num = 0;
        // while(count < 100){
            if(isPrime(n)){
            System.out.println("prime numbers ");
        //     count++;
        // }
        // num++;
        }
        else{
            System.out.println("Not prime");
        }
    }
}

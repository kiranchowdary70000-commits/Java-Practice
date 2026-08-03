import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(n > 0){
            int digit = n % 10;
            count += digit  * digit * digit;
            n = n / 10;
        }
        if(temp == count){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        

    }
}
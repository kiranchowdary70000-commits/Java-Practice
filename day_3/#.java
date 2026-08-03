import java.util.Scanner;
public class Di{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if((n % 5 != 0) && (n % 7 == 0)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

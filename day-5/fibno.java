import java.util.Scanner;
public class fibno{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int max = sc.nextInt();
        
        int First = 0;
        int Second = 1;
        
        for(int i = 1; i <= max; i++){
            int newfibnonaccinumber = First + Second;
            System.out.println(i + "Fibnonacii number is: " + newfibnonaccinumber);
            First = Second;
            Second = newfibnonaccinumber;
        }
    }
}
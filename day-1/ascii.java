import java.util.Scanner;
public class AscII{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a charcter: ");
        char ch = sc.next().charAt(0);
        int a = ch;
        System.out.println(ch + " ascii values is " + a);

    }
}
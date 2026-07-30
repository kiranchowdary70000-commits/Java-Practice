import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number:");
        int no = sc.nextInt();
        if(no >= 0 && no < 10){
            System.out.print("single digit");
        }
        else if (no >= 10 && no < 100){
            System.out.print("double digit");
        }
        else if ( no >= 100 && no < 1000){
            System.out.print("triple digit");
        }
        else{
            System.out.print("out of range");
        }
    }
}
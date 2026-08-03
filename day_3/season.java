import java.util.Scanner;

class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        switch (month) {
            case 2, 3, 4:
                System.out.println("Summer");
                break;

            case 5, 6, 7:
                System.out.println("Rainy");
                break;

            case 8, 9, 10:
                System.out.println("Spring");
                break;

            case 11, 12, 1:
                System.out.println("Winter");
                break;

            default:
                System.out.println("Invalid month");
        }

    }
}
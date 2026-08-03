
// public class swap {
//     public static void main(String[] args){
//         int a  = 10;
//         int b = 5;
//         a = a + b;
//         b = a - b;
//         a = a - b;
//         System.out.println(a);
//         System.out.println(b);

//     }
// }
// create a three variable swap condition

public class swap {
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        int c = 15;
        a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
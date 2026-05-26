/*
Nhập:
Dòng 1 là 1 số nguyên X
Dòng 2 là 1 số nguyên Y
Dòng 3 là kí tự C
Dòng 4 là số thực float F
Dòng 5 là số thực Double
In ra: 5 dòng. Dòng 1 X, Dòng 2 Y, Dòng 3 C, Dòng 4 F với 2 số đằng sau dấu phẩy, Dòng 5 D với 9 số đằng sau dấu phẩy
*/
import java.util.Scanner;

public class print_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        char C = sc.next().charAt(0);
        float F = sc.nextFloat();
        double D = sc.nextDouble();

        System.out.println(X);
        System.out.println(Y);  
        System.out.println(C);
        System.out.printf("%.2f\n", F);
        System.out.printf("%.9f\n", D);

        sc.close();
        
    }
}

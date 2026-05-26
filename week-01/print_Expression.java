/*
Cho 4 số X, Y, Z, T là số nguyên được nhập từ bàn phím, giới hạn các ố nguyên này là 1 <= X,Y,Z,T <= 10^9
Hãy in ra 3 dòng
Dòng 1 lần lượt là 4 số Y,Z,X,T mỗi số cách nhau 1 dấu phẩy
Dòng 2 in ra tổng 4 số
Dòng 3 in ra giá trị biểu thức X - Y + Z * T
*/


import java.util.Scanner;

public class print_Expression {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt(), T = sc.nextInt();
        System.out.println(Y + "," + Z + "," + X + "," + T);
        System.out.println((long)X + Y + Z + T);
        System.out.println(X - Y + 1L*Z * T);

        sc.close();
    }
}

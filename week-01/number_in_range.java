/*
Cho 2 số a và b, in ra số lượng số nguyên tính từ a đến b
Đầu vào
2 số nguyên dương a, b (1<=a,b<=10^12, b>a)
Đầu ra
Số lượng số nguyên tình từ a đến b
*/

import java.util.Scanner;

public class number_in_range {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Long a = sc.nextLong(), b = sc.nextLong();
        System.out.println(b - a + 1);

        sc.close();
    }
}
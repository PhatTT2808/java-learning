/*
Cho 4 số nguyên x,y,z,t
Đầu vào
4 số nguyên dương x,y,z,t (1<=x,y,z,t<=10^6)
Đầu ra
Dòng 1 in ra số lớn hơn trong 2 số x,y
Dòng 2 in ra số nhỏ hơn trong 2 số z,t
Dòng 3 in ra số lớn nhất trong 3 số x,y,z
Dòng 4 in ra số nhỏ nhất trong 4 số x,y,z,t
*/

import java.util.Scanner;

public class max_min {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), t = sc.nextInt();

        // Dòng 1 in ra số lớn hơn trong 2 số x,y
        System.out.println(Math.max(x, y));
        // Dòng 2 in ra số nhỏ hơn trong 2 số z,t
        System.out.println(Math.min(z, t));
        // Dòng 3 in ra số lớn nhất trong 3 số x,y,z
        System.out.println(Math.max(Math.max(x, y), z));
        // Dòng 4 in ra số nhỏ nhất trong 4 số x,y,z,t
        System.out.println(Math.min(Math.min(x, y), Math.min(z, t)));

        sc.close();
    }
}

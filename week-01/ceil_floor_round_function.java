/*
Cho số thực X(1<=X<=10^6), sử dụng ceil, floor, round để tìm số nguyên nhỏ hơn gần X nhất, số nguyên lớn hơn gần X nhất và số nguyên gần X nhất
Đầu vào:
1 dòng chứa 1 số thực X
Đầu ra:
In ra 3 số trên 3 dòng
*/

import java.util.Scanner;

public class ceil_floor_round_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble();
        // số nguyên nhỏ hơn gần X nhất
        System.out.println((int)Math.floor(X));
        // số nguyên lớn hơn gần X nhất
        System.out.println((int)Math.ceil(X));
        // số nguyên gần X nhất
        System.out.println(Math.round(X));

        sc.close();
    }
    
}

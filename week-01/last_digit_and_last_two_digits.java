/*
Cho nguyên dương N, sử dụng phép chia lấy dư để tìm chữ số cuối cùng và 2 chữ số cuối cùng của N(100<=N<=10^16)
Đầu vào:
1 dòng chứa 1 số nguyên dương N
Đầu ra:
Dòng 1 chứa chữ số cuối cùng của N
Dòng 2 in ra 2 chữ số cuối cùng nếu 2 chữ số cuối cùng của N có số 0 ở đầu thì bỏ số 0 đó đi và chọn số cuối cùng
*/

import java.util.Scanner;

public class last_digit_and_last_two_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        // chữ số cuối cùng của N
        System.out.println(N%10);
        // 2 chữ số cuối cùng của N
        System.out.println(N%100);

        sc.close();
    }
}    
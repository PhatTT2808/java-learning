/*
Cho số nguyên N in ra các kết quả sau
Đầu vào
1 số nguyên dương N (1<=N<=10^9)
Đầu ra
Dòng 1 2 lần N
Dòng 2 10 lần N
Dòng 3 phép chia nguyên N với 2
Dòng 4 phép chia lấy phàn thập phân N với 2, 3 chữ số sau dấu phẩy
*/

import java.util.Scanner;

public class multiply_and_divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(2*N);
        System.out.println((long)10*N);
        System.out.println(N/2);
        System.out.printf("%.3f", (double)N/2);


        sc.close();
    }
}

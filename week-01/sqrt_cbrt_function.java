/*
Cho số nguyên dương N, tính căn bậc 2 và căn bậc 3 của N(1 <= N <= 10^9)
Đầu vào:
1 dòng chứa 1 số nguyên dương N
Đầu ra:
Dòng 1 in ra căn bậc 2 của N với 2 số sau dấu phẩy
Dòng 2 in ra căn bậc 3 của N với 3 số sau dấu phẩy
*/

import java.util.Scanner;

public class sqrt_cbrt_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double sqrtResult = Math.sqrt(N);
        double cbrtResult = Math.cbrt(N);

        System.out.printf("%.2f\n", sqrtResult);
        System.out.printf("%.3f\n", cbrtResult);
        
        sc.close();
    }
    
}

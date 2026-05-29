/*
Khi chi dư 1 số cho số nguyên N thì số dư của phép chia đó sẽ là các số từ 0 đến N-1
Đầu vào
2 số nguyên A và B (1<=A,B<=10^6)
Đầu ra
In ra số dư khi chia A cho B
*/

import java.util.Scanner;

public class division_with_remainde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A%B);

        sc.close();
    }
}

/*
1 người đi mua vở có N đồng, mỗi quyển vở x đồng, anh ta mua được tối đa bao nhiêu quyển vở?
Đầu vào
2 số nguyên dương N, x (1<=N<=10^12,1<=x<=1000)
Đầu ra
in ra số lượng sách mua được kèm theo lời dẫn và dấu chấm than.
*/

import java.util.Scanner;

public class buy_notebooks {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong(), x = sc.nextLong();
        System.out.println("Số quyển vở tối đa mua được là " + N/x + "!");

        sc.close();
    }
}

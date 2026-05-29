/*
Trong java phép chia 2 số nguyên sẽ cho ra 1 số nguyên ví dụ 10 chia 3 sẽ ra 3 thay vì 3.33333 vì vậy để lấy được phần thập phân cần phải ép kiểu về số thực ví dụ (double/float)
cho 2 số nguyên trước  nếu muốn kết quả là số thực
Đầu vào
2 số nguyên dương A và B 1<=A,B<=1000
Đầu ra
Dòng 1 in ra thương của A và B sử dụng phép chia nguyên 
Dòng 2 in ra thương của A và B sử dụng phép chia thực lấy phần thập phân 2 số sau dấu phẩy
*/

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int A = sc.nextInt();
            int B = sc.nextInt();

            //phép chia nguyên
            int value_1 = A/B;
            //phép chia thực
            double value_2 = (double)A/B;

            System.out.println(value_1);
            System.out.printf("%.2f", value_2);

        sc.close();
    }
    
}

/*
Cho 2 số x, y. tính x^y(1 <= x ,y <= 12)
ép giá trị của hàm pow sang kiểu long, không in trực tiếp pow(x,y) nó sẽ hiện ra số thực
ví dụ: nhập 11 8 sẽ in ra 214358881 hay nó sẽ in ra 2.14358881E8, nếu in trực tiếp pow(11,8) mà không ép kiểu sang long
Đầu vào:
1 dòng chưa 2 số nguyên x, y cách nhau 1 dấu cách
Đầu ra:
In ra x^y
*/

import java.util.Scanner;

public class Pow_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        long result = (long)Math.pow(x,y);

        System.out.println(result);
        System.out.println(Math.pow(x,y));

        sc.close();
    }
}

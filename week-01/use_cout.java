/*
Đầu vào
nhập vào x,y,z,t (1<=x,y,z,t<=10^9)
Đầu ra
Dòng 1: in ra x,y,z,t cách nhau 2 khoảng trắng
Dòng 2: in ra x+y+z+t cách nhau 2 dấu gạch giữa
Dòng 3: in ra 2*x, 3*y, 4*z, 5*t cách nhau 1 dấu phẩy
Dòng 4 in ra "KẾT THÚC !!"

*/

import java.util.Scanner;

public class use_cout {
        public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt(), t = sc.nextInt();
        System.out.println(x + " " + y + " " + z + " " + t);
        System.out.println(x + "--" + y + "--" + z + "--" + t);
        System.out.println(1L*2*x + "," + 1L*3*y + "," + 1L*4*z + "," + 1L*5*t);
        System.out.println("KẾT THÚC !!");

        sc.close();
    }
}

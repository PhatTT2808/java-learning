/*
Cho hàm F(x,y) = 5*x+2*y+x*y
Đầu vào
2 số nguyên dương x, y (1<=x,y<=10^6)
Đầu ra
Giá trị của F(x,y) với x, y đã cho
*/

import java.util.Scanner ;

public class function {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println(5L*x + 2L*y + 1L*x*y); 

        sc.close();
    }
    
}

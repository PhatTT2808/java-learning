/*
Cho 1 số nguyên dương N có ít nhất 5 chữ số,xóa đi 3 chữ số cuối cùng của N và in ra những số còn lại
Đầu vào
1 số nguyên dương N có ít nhất 5 chữ số 10000<=N<=10^8
Đầu ra 
in ra N sau khi xóa
*/   

import java.util.Scanner;

public class clear_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int N = sc.nextInt();

            int value = N/1000;

            System.out.println(value);


    }
}

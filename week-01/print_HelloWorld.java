// Nhập vào 1 số nguyên x(1 <= 10^9) và in ra 3 dòng:
/*
Dòng 1 là số x vừa nhập từ bàn phím
Dòng 2 in ra dòng chữ "Hello World !"
Dòng 3 in ra "Java programming !"
*/
import java.util.Scanner;

public class print_HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        
        System.out.println(x);
        System.out.print("Hello World !\n");
        System.out.println("Java programming !");

        sc.close();
    }
}
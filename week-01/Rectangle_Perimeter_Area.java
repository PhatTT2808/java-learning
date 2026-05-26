/*
Nhập vào chiều dài và chiều rộng của HCN, hãy in ra chu vi và diện tích của HCN đó:
Đầu vào 1 dòng duy nhất gồm chiều dài và chiều rộng(Chièu dài, rộng là số nguyên dương không quá 10^6)
Đầu ra 1 dòng duy nhất gồm chu vi và diện tích của HCN đó, cách nhau 1 dấu cách
*/

import java.util.Scanner;

public class Rectangle_Perimeter_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lenght = sc.nextInt();
        int width = sc.nextInt();

        long perimeter = 2L * (lenght + width);
        long area = 1L * lenght * width;

        System.out.println(perimeter + " " + area);

        sc.close();
    }
}
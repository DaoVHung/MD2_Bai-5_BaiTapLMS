package BaiTap.LMS;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập vào bán kính hình tròn : ");
        double radius = Double.parseDouble(sc.nextLine());
        Circle CR= new Circle(radius);
        System.out.printf("Diện tích hình tròn là %f\n", CR.getArea());
    }
}

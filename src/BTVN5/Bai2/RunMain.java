package BTVN5.Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap phan thuc: ");
        a = sc.nextDouble();

        System.out.println("Nhap phan ao: ");
        b = sc.nextDouble();

        SoPhuc p1 = new SoPhuc(a, b); // z = 3 + 2i



        SoPhuc p2 = new SoPhuc(1, 1); // z = 1 + 1i => 4 + 3i  => 2 + 1i

        SoPhuc tong = p1.cong(p2);
        SoPhuc hieu = p1.tru(p2);

        System.out.println("Tổng: ");
        tong.xuat();

        System.out.println("Hiệu: ");
        hieu.xuat();

    }
}

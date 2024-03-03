package BTVN5.Bai3;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private long donGia;

    public void inputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sp: ");
        maSP = sc.nextLine();

        System.out.println("Nhap ten sp: ");
        tenSP = sc.nextLine();

        System.out.println("Nhap so luong: ");
        soLuong = sc.nextInt();

        System.out.println("Nhap don gia: ");
        donGia = sc.nextLong();
    }


    public static void title(){
        String line = String.format("%-20s %-20s %-20s %-20s %-20s", "MA SP", "TEN SP", "SO LUONG", "DON GIA", "THANH TIEN");
        System.out.println(line);
    }
    public void outputSP(){
        String line = String.format("%-20s %-20s %-20s %-20s %-20s", maSP, tenSP, soLuong+"", donGia+"", soLuong*donGia+"");
        System.out.println(line);
    }
}

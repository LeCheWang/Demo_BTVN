package BTVN4.B3_3;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private long donGia;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextLong();
    }

    public String xuat(){
        String line = String.format("%-20s%-20s%-20s", maHang, tenHang, donGia + "");
        return line;
    }

    public static void tieuDe(){
        String line = String.format("%-20s%-20s%-20s", "Mã Hàng", "Tên Hàng", "Đơn Giá");
        System.out.println(line);
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }
}

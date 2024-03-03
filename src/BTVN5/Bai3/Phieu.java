package BTVN5.Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime a;
//    private SanPham []x;
    private List<SanPham> x = new ArrayList<>();

    private int n;

    public void inputPhieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        maPhieu = sc.nextLine();

        System.out.println("Nhap ten phieu: ");
        tenPhieu = sc.nextLine();

        System.out.println("Nhap thoi gian: ");
        a = new DateTime();
        a.inputDate();

        System.out.println("Nhap so luong san pham: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            SanPham sanPham = new SanPham();
            System.out.println("Nhap san pham thu " + (i + 1));
            sanPham.inputSP();
//            x[i] = sanPham;
            x.add(sanPham);
        }
    }

    public void outputPhieu(){
        String line = String.format("%-20s %-20s %-20s %-20s", "Mã Phiếu: ", maPhieu, "Tên Phiếu: ", tenPhieu);
        System.out.println(line);
        System.out.print("Thời gian: " );
        a.outputDate();

        SanPham.title();
        for (int i = 0; i < n; i++){
//            x[i].outputSP();
            x.get(i).outputSP();
        }
    }
}

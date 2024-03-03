package BTVN4.B3_3;

import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang []x;
    private int n;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.println("Nhap so luong hang: ");
        n = sc.nextInt();

        x = new Hang[n];
        for (int i = 0; i < n; i++){
            System.out.println("Nhap hang thu " + (i+1) + ": ");
            x[i] = new Hang();
            x[i].nhap();
        }
    }

    public void xuat(){
        System.out.println("Ma phieu: " + maPhieu);
        Hang.tieuDe();
        for (int i = 0; i < n; i++){
            if (x[i].getTenHang().contains("k")){
                System.out.println(x[i].xuat());
            }
        }
    }
}

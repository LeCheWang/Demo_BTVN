package BTVN5.Bai2;

import java.util.Scanner;

public class SoPhuc {
    private double thuc;
    private double ao;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan thuc: ");
        thuc = sc.nextDouble();

        System.out.println("Nhap phan ao: ");
        ao = sc.nextDouble();
    }

    public void xuat(){
        System.out.println("z = " + thuc + " + " + ao + "i"); // z  = thuc + aoi
    }

    public SoPhuc cong(SoPhuc soPhuc) {
        return new SoPhuc(this.thuc + soPhuc.getThuc(), this.ao + soPhuc.getAo());
    }

    public SoPhuc tru(SoPhuc soPhuc) {
        return new SoPhuc(this.thuc - soPhuc.getThuc(), this.ao - soPhuc.getAo());
    }

    public SoPhuc(double thuc, double ao) {
        this.thuc = thuc;
        this.ao = ao;
    }

    public SoPhuc() {
    }

    public double getThuc() {
        return thuc;
    }

    public void setThuc(double thuc) {
        this.thuc = thuc;
    }

    public double getAo() {
        return ao;
    }

    public void setAo(double ao) {
        this.ao = ao;
    }
}

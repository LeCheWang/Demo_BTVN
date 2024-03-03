package ChuaBaiTap;

import java.util.Arrays;
import java.util.Scanner;

public class Driver extends Employee{
    private Transport a[];
    private int n;

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of transport: ");
        n = sc.nextInt();
        a = new Transport[n];
        for (int i = 0; i < n; i++){
            a[i] = new Transport();
            a[i].input();
        }
    }

    public String output(){
        String pt = "";
        for (int i = 0; i < n; i++){
            pt += a[i].output() + "\t";
        }
        return super.output() + pt;
    }

    @Override
    public String toString() {
        return "Driver{" +
                ", n=" + n +
                ", eid='" + eid + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", salaryRate=" + salaryRate +
                "a=" + Arrays.toString(a) +
                '}';
    }

    public Driver(String eid, String name, String birthday, int salaryRate, Transport[] a, int n) {
        super(eid, name, birthday, salaryRate);
        this.a = a;
        this.n = n;
    }

    public Driver(Transport[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public Driver() {
    }

    public Transport[] getA() {
        return a;
    }

    public void setA(Transport[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    int tinhLuong() {
        return 900000 * salaryRate;
    }

    boolean isDrive(String vehicalName){
        for (int i = 0; i < n; i++){
            if (a[i].getVehicalName().equals(vehicalName)){
                return true;
            }
        }

        return false;
    }
}

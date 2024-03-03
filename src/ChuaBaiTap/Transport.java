package ChuaBaiTap;

import java.util.Scanner;

public class Transport {
    private String iid;
    private String vehicalName;
    private int year;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter iid: ");
        iid = sc.nextLine();
        System.out.println("Enter vehical name: ");
        vehicalName = sc.nextLine();
        System.out.println("Enter year: ");
        year = sc.nextInt();
    }

    public String output(){
        String line = String.format("%-20s %-20s %-20s", iid, vehicalName, year + "");
        return line;
    }

    public static String title(){
        String line = String.format("%-20s %-20s %-20s", "iid", "vehicalName", "year");
        return line;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "iid='" + iid + '\'' +
                ", vehicalName='" + vehicalName + '\'' +
                ", year=" + year +
                '}';
    }

    public Transport(String iid, String vehicalName, int year) {
        this.iid = iid;
        this.vehicalName = vehicalName;
        this.year = year;
    }

    public Transport() {
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getVehicalName() {
        return vehicalName;
    }

    public void setVehicalName(String vehicalName) {
        this.vehicalName = vehicalName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

package Demo;

import java.util.Scanner;

public class Address {
    private String xa;
    private String huyen;
    private String tinh;

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap xa: ");
        xa = scanner.nextLine();

        System.out.println("Nhap huyen: ");
        huyen = scanner.nextLine();

        System.out.println("Nhap tinh: ");
        tinh = scanner.nextLine();
    }

    public String output(){
        return xa + " - " + huyen + " - " + tinh;
    }
}

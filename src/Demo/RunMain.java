package Demo;

import java.util.*;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int chon;

        do {
            System.out.println("=== menu ===");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("0. exit");
            System.out.println("Nhap lua chon: ");
            chon = sc.nextInt();

        } while (chon != 0);

    }
}

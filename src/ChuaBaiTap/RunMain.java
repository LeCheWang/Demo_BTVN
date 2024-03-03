package ChuaBaiTap;

import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static Staft staft[] = new Staft[1000];
    public static int numberStaft = 0;

    public static Driver driver[] = new Driver[1000];
    public static int numberDriver = 0;

    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("=== MENU ===");
            System.out.println("1. Add staft");
            System.out.println("2. Add driver");
            System.out.println("3. List employee");
            System.out.println("4. List employee same drive");
            System.out.println("0. Exists");
            System.out.println("Your choose: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    Staft staft1 = new Staft();
                    staft1.input();
                    staft[numberStaft] = staft1;
                    numberStaft++;
                    break;
                case 2:
                    Driver driver1 = new Driver();
                    driver1.input();
                    driver[numberDriver] = driver1;
                    numberDriver++;
                    break;
                case 3:
                    System.out.println("List Start");
                    for (int i = 0; i < numberStaft; i++){
                        System.out.println(staft[i]);
                    }

                    System.out.println("List Driver");
                    for (int i = 0; i < numberDriver; i++){
                        System.out.println(driver[i]);
                    }
                    break;
            }
        } while(choice != 0);
    }
}

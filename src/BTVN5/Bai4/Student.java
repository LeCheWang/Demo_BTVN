package BTVN5.Bai4;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private float gpa;

    public void inputStudent () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();

        System.out.println("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter address: ");
        address = sc.nextLine();

        System.out.println("Enter gpa: ");
        gpa = sc.nextFloat();
    }

    public static void title(){
        String line = String.format("%-20s %-20s %-20s %-20s %-20s", "ID", "NAME", "AGE", "ADDRESS", "GPA");
        System.out.println(line);
    }

    public void outputStudent(){
        String line = String.format("%-20s %-20s %-20s %-20s %-20s", id+"", name, age+"", address, gpa +"");
        System.out.println(line);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

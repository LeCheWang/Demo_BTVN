package Demo;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private Address address; //Person kết tập class Address

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        name = scanner.nextLine();

        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();

        System.out.println("Nhap dia chi: ");
        address = new Address();
        address.input();
    }

    public void xuat(){
        System.out.println("Ho Ten: " + name);
        System.out.println("Tuoi: " + age);
//        System.out.println("Dia Chi: " + address.output());
    }
}

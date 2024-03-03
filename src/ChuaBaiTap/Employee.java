package ChuaBaiTap;

import java.util.Scanner;

public abstract class Employee {
    protected String eid;
    protected String name;
    protected String birthday;
    protected int salaryRate;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter eid: ");
        eid = sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter birthday: ");
        birthday = sc.nextLine();
        System.out.println("Enter salary rate: ");
        salaryRate = sc.nextInt();
    }

    public String title(){
        String line = String.format("%-20s %-20s %-20s %-20s", "eid", "name", "birthday", "salaryRate");
        return line;
    }

    public String output(){
        String line = String.format("%-20s %-20s %-20s %-20s", eid, name, birthday, salaryRate+"");
        return line;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid='" + eid + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", salaryRate=" + salaryRate +
                '}';
    }

    abstract int tinhLuong();

    public Employee(String eid, String name, String birthday, int salaryRate) {
        this.eid = eid;
        this.name = name;
        this.birthday = birthday;
        this.salaryRate = salaryRate;
    }

    public Employee() {
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(int salaryRate) {
        this.salaryRate = salaryRate;
    }
}

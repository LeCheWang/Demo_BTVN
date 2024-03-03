package ChuaBaiTap;

import java.util.Scanner;

public class Staft extends Employee{
    private String department;

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department: ");
        department = sc.nextLine();
    }

    public String title(){
        String line = String.format("%-20s", "department");

        return super.output() + line;
    }
    public String output(){
        String line = String.format("%-20s", department);

        return super.output() + line;
    }

    @Override
    public String toString() {
        return "Staft{" +
                "department='" + department + '\'' +
                ", eid='" + eid + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", salaryRate=" + salaryRate +
                '}';
    }

    public Staft(String eid, String name, String birthday, int salaryRate, String department) {
        super(eid, name, birthday, salaryRate);
        this.department = department;
    }

    public Staft(String department) {
        this.department = department;
    }

    public Staft() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    int tinhLuong() {
        return 1000000 * salaryRate;
    }
}

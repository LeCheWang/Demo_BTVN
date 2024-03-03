package BTVN5.Bai4;

import java.util.*;

public class RunMain {
    public static Scanner sc = new Scanner(System.in);
    public static List<Student> studentList = new ArrayList<>();
    public static void main(String[] args) {
        int choose;

        do{
            System.out.println("==== MENU =====");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort students by id");
            System.out.println("5. Sort students by name");
            System.out.println("6. Show students");
            System.out.println("0. Exit");
            System.out.println("Enter choose: ");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    //add student
                    Student student = new Student();
                    student.inputStudent();
                    studentList.add(student);
                    break;
                case 2:
                    //edit student by id
                    int idEdit;
                    boolean isFound = false;
                    System.out.println("Enter id to edit: ");
                    idEdit = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < studentList.size(); i++){
                        if (studentList.get(i).getId() == idEdit) {
                            System.out.println("Enter name: ");
                            studentList.get(i).setName(sc.nextLine());

                            System.out.println("Enter age: ");
                            studentList.get(i).setAge(sc.nextInt());
                            sc.nextLine();

                            System.out.println("Enter address: ");
                            studentList.get(i).setAddress(sc.nextLine());

                            System.out.println("Enter gpa: ");
                            studentList.get(i).setGpa(sc.nextFloat());
                            isFound = true;
                            break;
                        }
                    }

                    if (!isFound){
                        System.out.println("Not found student");
                    }

                    break;
                case 3:
                    int idDelete;
                    boolean isFoundToDelete = false;
                    System.out.println("Enter id student to delete: ");
                    idDelete = sc.nextInt();

                    for (int i = 0; i < studentList.size(); i++){
                        if (studentList.get(i).getId() == idDelete){
                            studentList.remove(i);
                            isFoundToDelete = true;
                            break;
                        }
                    }

                    if (!isFoundToDelete){
                        System.out.println("Not found student");
                    }

                    break;
                case 4:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            if (o1.getGpa() - o2.getGpa() > 0){
                                return 1;
                            }

                            if (o1.getGpa() - o2.getGpa() < 0){
                                return -1;
                            }

                            return 0;
                        }
                    });

                    System.out.println("Sorted");
                    break;

                case 5:
                    Collections.sort(studentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });

                    System.out.println("Sorted");
                    break;
                case 6:
                    Student.title();
                    for (int i = 0; i < studentList.size(); i++){
                        studentList.get(i).outputStudent();
                    }

                    break;
                case 0:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("invalid choose");
            }

        } while(choose != 0);
    }
}

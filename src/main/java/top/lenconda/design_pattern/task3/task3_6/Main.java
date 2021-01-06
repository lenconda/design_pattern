package top.lenconda.design_pattern.task3.task3_6;

public class Main {
    public static void main(String args[]) {
        Department department = new Department();
        Teacher teacher = new Teacher();
        Student student = new Student();

        department.addObserver(teacher);
        department.addObserver(student);

        department.changeDepartmentName("Computer Science");
    }
}

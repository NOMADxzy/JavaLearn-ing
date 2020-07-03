package practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    private String name;
    private String ID;
    private int grade;
    public Student(String name,String ID,int grade){
        this.name = name;
        this.ID = ID;
        this.grade = grade;
    }
    public static ArrayList<Student> sort_by_grade(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.grade-o1.grade;
            }
        });
        return students;
    }public static ArrayList<Student> sort_by_ID(ArrayList<Student> students){
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.parseInt(o1.ID)-Integer.parseInt(o2.ID);
            }
        });
        return students;
    }

    public static void main(String[] args) {
        Student tom = new Student("汤姆","41004",90);
        Student jack = new Student("杰克","41006",85);
        Student lucy = new Student("路西","41002",88);
        Student lily = new Student("丽丽","41005",95);
        ArrayList<Student> students = new ArrayList<>();
        students.add(tom);
        students.add(jack);
        students.add(lucy);
        students.add(lily);
        System.out.println("按成绩排名：");
        students = sort_by_grade(students);
        for(Student s:students){
            System.out.println(s.name+" "+s.ID+" "+s.grade);
        }
        students = sort_by_ID(students);
        System.out.println("按学号排名：");
        for(Student s:students){
            System.out.println(s.name+" "+s.ID+" "+s.grade);
        }
    }
}
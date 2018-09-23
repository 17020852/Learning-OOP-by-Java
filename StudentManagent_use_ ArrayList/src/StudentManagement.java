import java.util.ArrayList;
import studentmanager.Student;

public class StudentManagement {

    private ArrayList<Student> students = new ArrayList<>();
    public void addStudent(Student s) {
        if (students.size()<100)
        {
            students.add(s);
        }

    }
    public void studentsByGroup(){
        ArrayList<String> nameGroup = new ArrayList<>();
        for (Student i: students) {
            if (nameGroup.indexOf(i.getGroup()) == -1)
                nameGroup.add(i.getGroup());
        }
        for (String i: nameGroup) {
            System.out.println("Lop:" + i);
            for (Student j: students) {
                if (j.getGroup() == i)
                {
                    System.out.println(j.getInfo());
                }
            }
        }
    }

    public void removeStudent(String id) {
        for (Student i: students) {
            if ((i.getId()).equals(id)) {
                students.remove(i);
            }
        }
    }

    public boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setId("17020852");
        student.setName("Hoang Thi Linh");
        student.setEmail("hoanglinh831999@gmail.com");
        student.setGroup("K62CG");
        System.out.println(student.getName());
        System.out.println(student.getInfo());

        Student student1 = new Student("17020854", "Le Thi Thuy Linh","17020854@vnu.edu.vn");
        Student student2 = new Student (student);

        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());

        StudentManagement st = new StudentManagement();
        System.out.println(st.sameGroup(student, student1));

        st.addStudent(student);
        st.addStudent(student1);
        st.addStudent(student2);
        st.studentsByGroup();
        st.removeStudent("17020854");
        System.out.println("-------After Remove------");
        st.studentsByGroup();
    }

}

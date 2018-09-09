
package studentmanager;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class StudentManager {

    private final Student[] students;
    private final int countStudent;

    public StudentManager() {
        this.countStudent = 0;
        this.students = new Student[10];
    }
    public void studentsByGroup() {
        
    }
    
    public boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) return TRUE;
        else return FALSE;
    }
    
    public static void main(String[] args) {
        // Tao ra 1 doi tuong sinh vien
        Student student = new Student();
        
        // Thiet lap cac thong tin ve sinh vien
        student.setName("HoangThiLinh");
        student.setId("17020852");
        student.setGroup("K62CG");
        student.setEmail("17020852@vnu.edu.vn");
        
        // In ra man hinh ten sinh vienn
        System.out.println(student.getName());
        
        // In ra man hinh toan bo thong tin sinh vien
        System.out.println(student.getInfo());
        
        
        Student s1 = new Student();
        s1.setGroup("K60CA");
        
        Student s2 = new Student();
        s2.setGroup("K60CA");
        
        Student s3 = new Student();
        s3.setGroup("K60CB");
        
        StudentManager stdManager = new StudentManager();
        System.out.println(stdManager.sameGroup(s1,s2));
        
    }
    
}

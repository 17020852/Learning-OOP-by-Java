
package studentmanager;

public class StudentManager {

    private Student[] students;
    private int countStudent;
    private int countClass;
    private String[] className;
    

    public StudentManager() {
        this.countStudent = 0;
        this.countClass = 0;
        this.students = new Student[100];
        this.className = new String[100];
    }
    
    // Check two student are the same the group
    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }
    
    public void addStudent(Student s) {
        if(countStudent<100) {
            students[countStudent] = s;
            countStudent++;
        }
        else {
            System.out.println("Vuot qua so hoc sinh");
        }
    }
    
    //Show students by group
    public void studentsByGroup() {
       
        for (int index = 0; index < countStudent; index++) {
            boolean check = true;
            for (int i = 0; i <= countClass; i++) {
                if (students[index].getGroup().equals(className[i])) {
                    check = false;
                    break;
                }
            }
            if (check) {
                className[countClass] = students[index].getGroup();
                countClass++;
            }
        }
        for (int i = 0; i < countClass; i++) {
            System.out.print("--Lop " + className[i]);
            System.out.println(":");
            
            for (int j = 0; j < countStudent; j++) {
                if (students[j].getGroup().equals(className[i])) {
                    System.out.print("* ");
                    System.out.println(students[j].getInfo());
                    System.out.println("");
                }
            }
        }
    }

    //Remove a Student
    public void removeStudent(String id) {
        for (int i = 0; i < countStudent; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < countStudent; j++) {
                    students[j] = students[j + 1];
                }
                countStudent--;
                break;
            }
        }
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
        
        
        Student s1 = new Student("17020853", "Le Thi Thuy Linh", "17020853@vnu.edu.vn");
        s1.setGroup("K60CA");
        
        Student s2 = new Student("17020854", "Le Thi Thuy Linh", "17020854@vnu.edu.vn");
        s2.setGroup("K60CA");
        
        Student s3 = new Student("17020922", "Bui Thi Ngat", "17020922@vnu.edu.vn");
        s3.setGroup("K60CB");
        
        StudentManager stdManager = new StudentManager();
        System.out.println(stdManager.sameGroup(s1,s2));
        
        stdManager.addStudent(s1);
        stdManager.addStudent(s2);
        stdManager.addStudent(s3);
        
        stdManager.studentsByGroup();
        stdManager.removeStudent("17020853");
        System.out.println("-------After remove-------");
        stdManager.studentsByGroup();
        
    }
    
}

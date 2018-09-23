package studentmanager;
public class Student {
    private String id;
    private String name;
    private String group;
    private String email;

    public Student() {
        name = "Student";
        id = "000";
        group = "K60CC";
        email = "uet@vnu.edu.vn";
    }

    public Student(String nid, String n, String em) {
        this.id = nid;
        this.name = n;
        this.group = "K60CC";
        this.email = em;
    }

    public Student(Student s)
    {
        this.id = s.getId();
        this.name = s.getName();
        this.email = s.getEmail();
        this.group = s.getGroup();
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName() {
        return this.name;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getGroup() {
        return this.group;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public String getInfo() {
        return (this.getName() +" "+ this.getId() +" "+ this.getGroup() +" "+ this.getEmail());

    }
}

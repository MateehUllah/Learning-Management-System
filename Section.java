import java.io.Serializable;
import java.util.ArrayList;

public class Section implements Serializable {
    private String info;
    private Course course;
    private Teacher teacher;
    private ArrayList<Registration> reg_list= new ArrayList<>();
    public static int count = 0;

    public Section(String info, Course course) {
        this.info = info;
        this.course = course;
    }

    Section(){
        info = "";
        reg_list = new ArrayList<Registration>();
    }
    Section(Section s){
        info = s.info;
        course = new Course(s.course);
        teacher = new Teacher(s.teacher);
        reg_list = s.reg_list;
    }

    void set_info(String i){
        info = i;
    }
    void set_course(Course c){
        course = new Course(c);
    }
    void set_teacher(Teacher t){
        teacher = new Teacher(t);
    }
    void set_reg_list(ArrayList<Registration> r){
        reg_list = new ArrayList<Registration>(r);
    }

    String get_info(){
        return info;
    }
    Course get_course(){
        return course;
    }
    Teacher get_teacher(){
        return teacher;
    }
    ArrayList<Registration> get_reg_list(){
        return reg_list;
    }

    void addReg(Registration obj){
        reg_list.add(obj);
        count++;
    }
}

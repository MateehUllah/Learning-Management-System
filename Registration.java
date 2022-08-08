import java.io.Serializable;
import java.util.ArrayList;

public class Registration implements Serializable {
    public enum reg_status {active , inactive};

    private reg_status status;
    private Student student;
    private Section section = new Section();
    private ArrayList<Returnable> returnables;

    public Registration(Student student, Section section) {
        this.student = student;
        this.section = section;
    }

    Registration(){
        status = reg_status.inactive;
        returnables = new ArrayList<Returnable>();
    }
    Registration(Registration r){
        status = r.status;
        student = new Student(r.student);
        section = new Section(r.section);
        returnables = new ArrayList<Returnable>(r.returnables);
    }

    void set_reg_status(int i){
        if(i == 0)
            status = reg_status.inactive;
        else
            status = reg_status.active;
    }
    void set_student(Student s){
        student = s;
    }
    void set_section(Section s){
        section = s;
    }
    void set_returnables(ArrayList<Returnable> r){
        returnables = new ArrayList<Returnable>(r);
    }

    public reg_status getStatus() {
        return status;
    }
    public Student getStudent() {
        return student;
    }
    public Section getSection() {
        return section;
    }
    public ArrayList<Returnable> getReturnables() {
        return returnables;
    }
}

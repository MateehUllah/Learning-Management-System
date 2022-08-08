import java.io.Serializable;
import java.util.ArrayList;

public class Transcript implements Serializable {
    private Student student;
    private float cgpa;
    private ArrayList<Semester> sem_list = new ArrayList<>();

    Transcript(){
        cgpa = 0.0f;
        sem_list = new ArrayList<Semester>();
    }

    public Transcript(Student student, float cgpa) {
        this.student = student;
        this.cgpa = cgpa;
    }
    void createSemester(Semester s){
        sem_list.add(s);
    }

    Transcript(Transcript t){
        student = new Student(t.student);
        cgpa = t.cgpa;
        sem_list = new ArrayList<Semester>(t.sem_list);
    }

    void set_student(Student s){
        student = new Student(s);
    }
    void set_sem_list(ArrayList<Semester> s){
        sem_list = new ArrayList<Semester>(s);
    }

    Student get_student(){
        return student;
    }
    ArrayList<Semester> get_sem_list(){
        return sem_list;
    }

    float get_cgpa(){
        return cgpa;
    }


}

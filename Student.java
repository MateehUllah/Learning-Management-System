import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User implements Serializable {
    private ArrayList<Registration> reg_list;
    private Transcript trans = new Transcript();

    public Student(){
        super();
        reg_list = new ArrayList<Registration>();
    }

    public void createStudent(String u, String p) {
        username = u;
        password = p;
    }

    public Student(Student s){
        username = s.username;
        password = s.password;
        reg_list = new ArrayList<Registration>(s.reg_list);
        trans = new Transcript(s.trans);
    }
    //  setters
    void set_username(String u){
        username = u;
    }
    void set_password(String p){
        password = p;
    }
    void set_reg_list(ArrayList<Registration> r){
        reg_list = reg_list = new ArrayList<Registration>(r);
    }
    void set_transcript(Transcript t){
        trans = t;
    }
    //  getters
    String get_username(){
        return username;
    }
    String get_password(){
        return password;
    }
    ArrayList<Registration> get_reg_list(){
        return reg_list;
    }
    Transcript get_transcript(){
        return trans;
    }

    //  utility functions
    void register_course(){
        Scanner cin = new Scanner(System.in);
        String rex = new String();
        Registration obj = new Registration();
        Section s = new Section();
        Course c = new Course();
        boolean flag = true;

        System.out.println("[INFO]\t Register Course");
        while(flag){
            System.out.println("> Enter Course Code: ");
            rex = cin.nextLine();
            if(rex.equals("0")){
                Filing.view_all_courses();
            }
            else {
                for (int i = 0; i < Filing.courseArrayList.size(); i++) {
                    if (rex.equals(Filing.courseArrayList.get(i).get_code())) {
                        c = Filing.courseArrayList.get(i);
                        flag = false;
                    }
                    else {
                        System.out.println("[INFO]\t No such course exists");
                    }
                }
            }
        }
        flag = true;
        while(flag){
            System.out.println("> Enter Section Info: ");
            rex = cin.nextLine();
            if(rex.equals("0")){
                c.displaySections();
            }
            else {
                for (int i = 0; i < c.get_sec_list().size(); i++) {
                    if (rex.equals(c.get_sec_list().get(i).get_info()) && c.get_sec_list().get(i).count < 30) {
                        s = c.get_sec_list().get(i);
                        flag = false;
                    }
                    else {
                        System.out.println("[INFO]\t Could not register in this section");
                    }
                }
            }
        }

        obj.set_reg_status(1);
        obj.set_section(s);
        obj.set_student(this);
        s.addReg(obj);

        Filing.registrationArrayList.add(obj);
        System.out.println("[INFO]\t Course Registered");
    }
    void view_transcript(){
        System.out.println("[INFO]\t Transcript");
        System.out.println(">> CGPA: "+ trans.get_cgpa());
        for(int i=0; i<trans.get_sem_list().size(); i++)
            trans.get_sem_list().get(i).displayDetails();
    }
}

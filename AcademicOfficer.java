import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AcademicOfficer extends User implements Serializable {
    ArrayList<Course> courseList;
    ArrayList<Section> sectionList;
    ArrayList<Student> studentList;
    ArrayList<Teacher> teacherList;

    public void createAcademicOfficer(String u, String p) {
        username = u;
        password = p;
    }

    public AcademicOfficer(String u, String p, ArrayList<Course> courseList, ArrayList<Section> sectionList, ArrayList<Student> studentList, ArrayList<Teacher> teacherList) {
        this.username = u;
        this.password = p;
        this.courseList = courseList;
        this.sectionList = sectionList;
        this.studentList = studentList;
        this.teacherList = teacherList;
    }

    AcademicOfficer(){
        courseList = new ArrayList<Course>();
        sectionList = new ArrayList<Section>();
        studentList = new ArrayList<Student>();
        teacherList = new ArrayList<Teacher>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    public ArrayList<Section> getSectionList() {
        return sectionList;
    }
    public void setSectionList(ArrayList<Section> sectionList) {
        this.sectionList = sectionList;
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }
    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    void set_username(String u){
        username = u;
    }
    void set_password(String p){
        password = p;
    }
    String get_username(){
        return username;
    }
    String get_password(){
        return password;
    }

    void add_student(){
        Scanner cin = new Scanner(System.in);
        String rex, p;
        Student obj = new Student();
        boolean flag = true;

        System.out.println("[INFO]\t Create New Student");
        while(true){
            System.out.println("> Enter Username: ");
            rex = cin.nextLine();
            for(int i=0; i<Filing.studentArrayList.size() && Filing.studentArrayList.size() > 0; i++){
                if(rex.equals(Filing.studentArrayList.get(i).get_username()))
                    flag = false;
            }
            if(flag) {
                obj.set_username(rex);
                break;
            }
            else{
                System.out.println("[WARNING]\t Username already exists");
            }
        }
        while(true) {
            System.out.println("> Enter Password: ");
            rex = cin.nextLine();
            System.out.println("> Repeat Password: ");
            p = cin.nextLine();
            if (rex.equals(p)) {
                obj.set_password(rex);
                break;
            }
            else{
                System.out.println("[WARNING]\t Passwords don't match");
            }
        }
        Filing.studentArrayList.add(obj);
        System.out.println("[INFO]\t User Added");
        Main.adminMenu(this);
    }
    void remove_student(){
        Scanner cin = new Scanner(System.in);
        String rex, p;
        Student obj = new Student();
        boolean flag = false;

        System.out.println("[INFO]\t Remove Student");
        System.out.println("> Enter Username: ");
        rex = cin.nextLine();
        for(int i=0; i<Filing.studentArrayList.size(); i++){
            if(rex.equals(Filing.studentArrayList.get(i).get_username())) {
                Filing.studentArrayList.remove(i);
                System.out.println("[INFO]\t User removed");
            }
        }
        Main.adminMenu(this);
    }

    void add_teacher(){
        Scanner cin = new Scanner(System.in);
        String rex, p;
        Teacher obj = new Teacher();
        boolean flag = true;

        System.out.println("[INFO]\t Create New Teacher");
        while(true){
            System.out.println("> Enter Username: ");
            rex = cin.nextLine();
            for(int i=0; i<Filing.teacherArrayList.size(); i++){
                if(rex.equals(Filing.teacherArrayList.get(i).get_username()))
                    flag = false;
            }
            if(flag) {
                obj.set_username(rex);
                break;
            }
            else{
                System.out.println("[WARNING]\t Username already exists");
            }
        }
        while(true) {
            System.out.println("> Enter Password: ");
            rex = cin.nextLine();
            System.out.println("> Repeat Password: ");
            p = cin.nextLine();
            if (rex.equals(p)) {
                obj.set_password(rex);
                break;
            }
            else{
                System.out.println("[WARNING]\t Passwords don't match");
            }
        }
        Filing.teacherArrayList.add(obj);
        System.out.println("[INFO]\t User Added");
        Main.adminMenu(this);
    }
    void remove_teacher(){
        Scanner cin = new Scanner(System.in);
        String rex, p;
        Teacher obj = new Teacher();
        boolean flag = true;

        System.out.println("[INFO]\t Remove Teacher");
        System.out.println("> Enter Username: ");
        rex = cin.nextLine();
        for(int i=0; i<Filing.teacherArrayList.size(); i++){
            if(rex.equals(Filing.teacherArrayList.get(i).get_username())) {
                Filing.teacherArrayList.remove(i);
                System.out.println("[INFO]\t User removed");
            }
        }
        Main.adminMenu(this);
    }

    void add_course(){
        Scanner cin = new Scanner(System.in);
        String rex, p;
        Course obj = new Course();
        boolean flag = true;

        System.out.println("[INFO]\t Create New Course");
        while(true){
            System.out.println("> Enter Course Code: ");
            rex = cin.nextLine();
            for(int i=0; i<Filing.courseArrayList.size(); i++){
                if(rex.equals(Filing.courseArrayList.get(i).get_code()))
                    flag = false;
            }
            if(flag) {
                obj.set_code(rex);
                break;
            }
            else
                System.out.println("[WARNING]\t Code already exists");
        }
        System.out.println("> Enter Course Name: ");
        rex = cin.nextLine();
        obj.set_code(rex);

        Filing.courseArrayList.add(obj);
        System.out.println("[INFO]\t Course Added");
        Main.adminMenu(this);
    }
    void remove_course(){
        Scanner cin = new Scanner(System.in);
        String rex, p;
        Course obj = new Course();
        boolean flag = true;

        System.out.println("[INFO]\t Remove Course");
        System.out.println("> Enter Course Code: ");
        rex = cin.nextLine();
        for(int i=0; i<Filing.courseArrayList.size(); i++){
            if(rex.equals(Filing.courseArrayList.get(i).get_code())) {
                Filing.courseArrayList.remove(i);
                System.out.println("[INFO]\t Course removed");
            }
        }
        Main.adminMenu(this);
    }

    void add_section(){
        Scanner cin = new Scanner(System.in);
        String rex, p = new String();
        Section obj = new Section();
        Course c = new Course();
        boolean flag = true;

        System.out.println("[INFO]\t Create New Section");
        while(flag){
            System.out.println("> Enter Course Code: ");
            p = cin.nextLine();
            if(p.equals("0")){
                Filing.view_all_courses();
            }
            else {
                for (int i = 0; i < Filing.courseArrayList.size(); i++) {
                    if (p.equals(Filing.courseArrayList.get(i).get_code())) {
                        c = Filing.courseArrayList.get(i);
                        obj.set_course(c);
                        flag = false;
                    }
                    else {
                        System.out.println("[INFO]\t No such course exists");
                    }
                }
            }
        }
        System.out.println("> Enter Section Info: ");
        rex = cin.nextLine();
        obj.set_info(rex);

        c.addSection(obj);
        Filing.sectionArrayList.add(obj);
        System.out.println("[INFO]\t Section Added to Course: " + p);
        Main.adminMenu(this);
    }

    void assign_teacher(){
        Scanner cin = new Scanner(System.in);
        String rex, p;
        Course obj = new Course();
        Section s = new Section();
        Teacher t = new Teacher();
        boolean flag = true;

        System.out.println("[INFO]\t Assign Teacher");
        System.out.println("> Enter Course Code: ");
        rex = cin.nextLine();
        for(int i=0; i<Filing.courseArrayList.size(); i++){
            if(rex.equals(Filing.courseArrayList.get(i).get_code())) {
                obj = Filing.courseArrayList.get(i);
            }
        }
        System.out.println("> Enter Section Info: ");
        rex = cin.nextLine();
        for(int i=0; i<obj.get_sec_list().size(); i++){
            if(rex.equals(obj.get_sec_list().get(i).get_info())) {
                s = obj.get_sec_list().get(i);
            }
        }
        System.out.println("> Enter Teacher Username: ");
        rex = cin.nextLine();
        for(int i=0; i<Filing.teacherArrayList.size(); i++){
            if(rex.equals(Filing.teacherArrayList.get(i).get_username())) {
                t = Filing.teacherArrayList.get(i);
            }
        }
        s.set_teacher(t);
        t.get_sec_list().add(s);

        Main.adminMenu(this);
    }
}

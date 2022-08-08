import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Student s = new Student();
    public static AcademicOfficer a = new AcademicOfficer();
    public static Course course = new Course("SDA", "CS2019");
    public static Section sectionA = new Section("A", course);
    public static Semester sem = new Semester(1, 2.74f);
    public static Transcript trans = new Transcript(s, 2.74f);
    public static Registration r = new Registration(s, sectionA);
    public static Teacher t = new Teacher();

    public static void loginMenu() throws IOException {
        Scanner cin = new Scanner(System.in);

        System.out.println("[INFO]\t Login Menu");
        System.out.println("1). Academic Officer \n 2). Student \n  3). Teacher");
        int rex = cin.nextInt();

        switch(rex){
            case 1:
                adminLogin();
                break;
            case 2:
                studentLogin();
                break;
            case 3:
                teacherLogin();
                break;
            default:
                System.out.println("[ERROR]\t Invalid Input");
                break;
        }
    }

    public static void adminLogin(){
        AcademicOfficer admin = new AcademicOfficer();
        Scanner cin = new Scanner(System.in);
        String rex = new String();
        boolean flag = true, exit = true;

        System.out.println("[INFO]\t Academic Officer Login Form");
        while(flag){
            System.out.println("> Username: ");
            rex = cin.nextLine();
            if(rex.equals("admin")){
                System.out.println("> Password: ");
                rex = cin.nextLine();
                if(rex.equals("12345")){
                    admin.set_username("admin");
                    admin.set_password("12345");
                    adminMenu(admin);
                    exit = false;
                    break;
                }
            }
            else {
                for (int i = 0; i < Filing.academicOfficerArrayList.size(); i++) {
                    if (rex.equals(Filing.academicOfficerArrayList.get(i).get_username())) {
                        admin = Filing.academicOfficerArrayList.get(i);
                        flag = false;
                    } else
                        System.out.println("[WARNING]\t Incorrect Username");
                }
            }
        }
        while(true && exit){
            System.out.println("> Password: ");
            rex = cin.nextLine();
            if(rex.equals(admin.get_password())){
                adminMenu(admin);
                break;
            }
        }

    }
    public static void studentLogin(){
        Student admin = new Student();
        Scanner cin = new Scanner(System.in);
        String rex = new String();
        boolean flag = true, exit = true;

        System.out.println("[INFO]\t Student Login Form");
        while(flag){
            System.out.println("> Username: ");
            rex = cin.nextLine();
            if(rex.equals("Taha")){
                System.out.println("> Password: ");
                rex = cin.nextLine();
                if(rex.equals("12345")){
                    admin.set_username("admin");
                    admin.set_password("12345");
                    studentMenu(admin);
                    exit = false;
                    break;
                }
            }
            else {
                for (int i = 0; i < Filing.studentArrayList.size(); i++) {
                    if (rex.equals(Filing.studentArrayList.get(i).get_username())) {
                        admin = Filing.studentArrayList.get(i);
                        flag = false;
                    } else
                        System.out.println("[WARNING]\t Incorrect Username");
                }
            }
            while (true && exit) {
                System.out.println("> Password: ");
                rex = cin.nextLine();
                if (rex.equals(admin.get_password())) {
                    studentMenu(admin);
                    break;
                }
            }
        }
    }
    public static void teacherLogin() throws IOException {
        Teacher admin = new Teacher();
        Scanner cin = new Scanner(System.in);
        String rex = new String();
        boolean flag = true, exit = true;

        System.out.println("[INFO]\t Teacher Login Form");
        while(flag){
            System.out.println("> Username: ");
            rex = cin.nextLine();
            if(rex.equals("abc")){
                System.out.println("> Password: ");
                rex = cin.nextLine();
                if(rex.equals("12345")){
                    admin.set_username("admin");
                    admin.set_password("12345");
                    teacherMenu(admin);
                    exit = false;
                    break;
                }
            }
            for(int i=0; i<Filing.teacherArrayList.size(); i++){
                if(rex.equals(Filing.teacherArrayList.get(i).get_username())){
                    admin = Filing.teacherArrayList.get(i);
                    flag = false;
                }
                else {
                    System.out.println("[WARNING]\t Incorrect Username");
                    exit = false;
                    break;
                }
            }
        }
        while(true && exit){
            System.out.println("> Password: ");
            rex = cin.nextLine();
            if(rex.equals(admin.get_password())){
                teacherMenu(admin);
                break;
            }
        }
    }

    public static void adminMenu(AcademicOfficer obj){
        Scanner cin = new Scanner(System.in);

        System.out.println("[INFO]\t Academic Officer Login Menu");
        System.out.println("1). Add Student \n 2). Remove Student \n  3). Add Teacher \n 4). Remove Teacher \n 5). Add Course \n 6). Remove Course \n 7). Add Section \n 8). Assign Teacher to Section");
        int rex = cin.nextInt();

        switch(rex){
            case 1:
                obj.add_student();
                break;
            case 2:obj.remove_student();
                break;
            case 3:
                obj.add_teacher();
                break;
            case 4:
                obj.remove_teacher();
                break;
            case 5:
                obj.add_course();
                break;
            case 6:
                obj.remove_course();
                break;
            case 7:
                obj.add_section();
                break;
            case 8:
                obj.assign_teacher();
                break;
            default:
                System.out.println("[ERROR]\t Invalid Input");
                break;
        }
    }
    public static void studentMenu(Student obj){
        Scanner cin = new Scanner(System.in);

        System.out.println("[INFO]\t Academic Officer Login Menu");
        System.out.println("1). Register Course \n 2). View Transcript ");
        int rex = cin.nextInt();

        switch(rex){
            case 1:
                obj.register_course();
                break;
            case 2:obj.view_transcript();
                break;
            default:
                System.out.println("[ERROR]\t Invalid Input");
                break;
        }
    }
    public static void teacherMenu(Teacher obj) throws IOException {
        Scanner cin = new Scanner(System.in);

        System.out.println("[INFO]\t Teacher Login Menu");
        System.out.println("1). Add Marks \n 2). Add Attendance \n  3). Add Grade");
        int rex = cin.nextInt();

        switch(rex){
            case 1:
                obj.addMarks();
                break;
            case 2:obj.addAttendence();
                break;
            case 3:
                obj.addGrade();
                break;
            default:
                System.out.println("[ERROR]\t Invalid Input");
                break;
        }
    }

    private static void fileIn() throws IOException {
        Filing.read_academicOfficer();
        Filing.read_course();
        Filing.read_registeration();
        Filing.read_section();
        Filing.read_student();
        Filing.read_teacher();
        Filing.read_transcript();
    }

    private static void fileOut() throws IOException {
        Filing.write_academicOfficer();
        Filing.write_course();
        Filing.write_registeration();
        Filing.write_section();
        Filing.write_student();
        Filing.write_teacher();
        Filing.write_transcript();
    }
    static void temp() throws IOException {
        s.createStudent("mateeh", "123");
        Filing.studentArrayList.add(s);
        Filing.write_student();

        a.createAcademicOfficer("saifullah", "123");
        Filing.academicOfficerArrayList.add(a);
        Filing.write_academicOfficer();

        t.createTeacher("aamir", "123");
        Filing.teacherArrayList.add(t);
        Filing.write_teacher();

        sectionA.set_teacher(t);
        course.createSection(sectionA);
        Filing.courseArrayList.add(course);
        Filing.sectionArrayList.add(sectionA);
        Filing.write_course();
        Filing.write_section();

        Filing.registrationArrayList.add(r);
        Filing.write_registeration();

        sem.createSection(sectionA);
        trans.createSemester(sem);
        Filing.transcriptArrayList.add(trans);
        Filing.semesterArrayList.add(sem);
        Filing.write_semester();
        Filing.write_transcript();

        s.set_transcript(trans);
    }

    public static void main(String[] args) throws IOException {
        temp();
        //fileIn();
        System.out.println("[INFO]\t WELCOME TO LMS \n\n\n By Taha Sohail & Mateeh Ullah");

        loginMenu();

        fileOut();
    }
}

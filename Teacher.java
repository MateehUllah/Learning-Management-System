import java.io.IOException;
import java.io.Serializable;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends User implements Serializable {
    private ArrayList<Section> sec_list;
    private ArrayList<Registration> reg_list;
    private ArrayList<Returnable> ret_list;

    Teacher(){
        super();
        sec_list = new ArrayList<Section>();
        reg_list = new ArrayList<Registration>();
        ret_list = new ArrayList<Returnable>();
    }
    Teacher(Teacher t){
        username = t.username;
        password = t.password;
        sec_list = new ArrayList<Section>(t.sec_list);
        reg_list = new ArrayList<Registration>(t.reg_list);
        ret_list = new ArrayList<Returnable>(/* t.ret_list*/);
    }
    void createTeacher(String u, String p){
        username = u;
        password = p;
    }

    void set_username(String u){
        username = u;
    }
    void set_password(String p){
        password = p;
    }
    void set_sec_list(ArrayList<Section> s){
        sec_list = new ArrayList<Section>(s);
    }
    void set_reg_list(ArrayList<Registration> r){
        reg_list = new ArrayList<Registration>();
    }
    void set_ret_list(ArrayList<Returnable> r){
        ret_list = new ArrayList<Returnable>(/*r*/);
    }

    String get_username(){
        return username;
    }
    String get_password(){
        return password;
    }
    ArrayList<Section> get_sec_list(){
        return sec_list;
    }
    ArrayList<Registration> get_reg_list(){
        return reg_list;
    }
    ArrayList<Returnable> set_ret_list(){
        return ret_list;
    }
    public void addMarks() throws IOException {
        ArrayList<Marks> lst=new ArrayList<>();
        for(Registration reg:Filing.registrationArrayList)
        {
            System.out.println("Enter Marks for "+reg.getStudent().get_username());
            Scanner cin=new Scanner(System.in);
            System.out.print("Enter obtain Marks:");
            int obtainMarks= cin.nextInt();
            cin.nextLine();
            System.out.print("Enter Total Marks:");
            int TotalMarks=cin.nextInt();
            cin.nextLine();
            Marks obj=new Marks(reg,this,TotalMarks,obtainMarks);
            lst.add(obj);
        }
        Filing.marksArrayList=lst;
        Filing.write_Marks();
        System.out.println("Marks Added");
    }
    public void addAttendence() throws IOException {
        ArrayList<Attend> lst=new ArrayList<>();
        for(Registration reg: Filing.registrationArrayList)
        {
            System.out.println("Enter Attendence for "+reg.getStudent().get_username());
            Scanner cin=new Scanner(System.in);
            System.out.print("Enter A for Absent P for present:");
            String status= cin.nextLine();
            if(status.equals("P")) {
                Attend obj=new Attend(reg, this, Attend.STATUS.Present);
                lst.add(obj);
            }
            else{
                Attend obj=new Attend(reg,this,Attend.STATUS.Present);
                lst.add(obj);
            }
        }
        System.out.println("Attendence Added");
        Filing.attendArrayList=lst;
        Filing.write_Attend();
    }
    public void addGrade() throws IOException {
        ArrayList<Grade> gr=new ArrayList<>();
        for(Registration reg:Filing.registrationArrayList)
        {
            System.out.println("Enter Attendence for "+reg.getStudent().get_username());
            Scanner cin=new Scanner(System.in);
            System.out.print("Enter Grades {A,B,C,D,F}:");
            String status= cin.nextLine();
           Grade obj= new Grade(reg, this,status);
           gr.add(obj);
        }
        Filing.gradeArrayList=gr;
        Filing.write_Grade();
        System.out.println("Grade Added");
    }

}

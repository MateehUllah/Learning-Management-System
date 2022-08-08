import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable {
    public enum reg_status {active , inactive};

    private reg_status status;
    private String name, code;
    ArrayList<Section> sec_list = new ArrayList<>();

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }
    void createSection(Section s){
        sec_list.add(s);
    }

    Course(){
        status = reg_status.inactive;
        name = code = "";
        sec_list = new ArrayList<Section>();
    }
    Course(Course c){
        status = c.status;
        name = c.name;
        code = c.code;
        sec_list = new ArrayList<Section>(c.sec_list);
    }

    void set_reg_status(int i){
        if(i == 0)
            status = reg_status.inactive;
        else
            status = reg_status.active;
    }
    void set_name(String n){
        name = n;
    }
    void set_code(String c){
        code = c;
    }
    void set_sec_list(ArrayList<Section> s){
        sec_list = new ArrayList<Section>(s);
    }

    String get_name(){
        return name;
    }
    String get_code(){
        return code;
    }
    ArrayList<Section> get_sec_list(){
        return sec_list;
    }
    reg_status getStatus() {
        return status;
    }

    void displaySections(){
        for(int i=0; i<Filing.courseArrayList.size(); i++) {
            System.out.println(sec_list.get(i).get_info() + ", ");
            Filing.courseArrayList.get(i).displaySections();
        }
    }
    void addSection(Section s){
        sec_list.add(s);
    }
}

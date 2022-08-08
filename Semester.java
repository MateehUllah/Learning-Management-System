import java.io.Serializable;
import java.util.ArrayList;

public class Semester implements Serializable {
    private int num;
    private float sgpa;
    private ArrayList<Section> section_list = new ArrayList<>();

    Semester(){
        num = 0;
        sgpa = 0f;
        section_list = new ArrayList<Section>();
    }

    public Semester(int num, float sgpa) {
        this.num = num;
        this.sgpa = sgpa;
    }
    void createSection(Section s){
        section_list.add(s);
    }

    Semester(Semester s){
        num = s.num;
        sgpa = s.sgpa;
        section_list = new ArrayList<Section>(s.section_list);
    }

    void set_num(int n){
        num = n;
    }
    void set_sgpa(float s){
        sgpa = s;
    }
    void set_section_list(ArrayList<Section> c){
        section_list = new ArrayList<Section>(c);
    }

    int get_num(){
        return num;
    }
    float get_sgpa(){
        return sgpa;
    }
    ArrayList<Section> get_section_list(){
        return section_list;
    }

    void displayDetails(){
        System.out.println("Semester # "+ num);
        System.out.println("SGPA: "+ sgpa);
        for(int i=0; i<section_list.size(); i++){
            System.out.println("Section Code: "+ section_list.get(i).get_course().get_code() + " Section Name: "+ section_list.get(i).get_course().get_name());
        }
    }
}

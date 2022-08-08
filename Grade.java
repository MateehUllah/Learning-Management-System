import java.io.Serializable;
import java.util.ArrayList;
class Grade extends Returnable implements Serializable
{
    String grade;
    public static ArrayList<Grade> obj=new ArrayList<>();
    Grade()
    {
        super();
        grade="I";
    }

    ArrayList<Grade> returnGradeReturnable() {
        return obj;
    }

    Grade(Registration r,Teacher T,String grade)
    {
        super(r,T);
        this.grade=grade;
        obj.add(this);
    }
}

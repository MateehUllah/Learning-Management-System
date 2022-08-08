import java.io.Serializable;
import java.util.ArrayList;
class Marks extends Returnable implements Serializable
{
    int totalMarks;
    int obtainMarks;
    public static ArrayList<Marks> obj=new ArrayList<>();
    Marks()
    {
        super();
        totalMarks=0;
        obtainMarks=0;
    }

    Marks(Registration r,Teacher T,int totalMarks,int obtainMarks)
    {
        super(r,T);
        this.totalMarks=totalMarks;
        this.obtainMarks=obtainMarks;
        obj.add(this);

    }
    ArrayList<Marks> returnMarksReturnable()
    {
        return obj;
    }

}

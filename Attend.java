import java.io.Serializable;
import java.util.ArrayList;

class Attend extends Returnable implements Serializable {
    public enum STATUS{Present,Absent}
    public STATUS obj;
    public static ArrayList<Attend> Temp=new ArrayList<>();
    Attend()
    {
        super();
        obj=null;
    }

    Attend(Registration r,Teacher T,STATUS obj) {
        super(r, T);
        this.obj = obj;
        Temp.add(this);
    }
    ArrayList<Attend> returnAttendReturnable()
    {
        return Temp;
    }
}

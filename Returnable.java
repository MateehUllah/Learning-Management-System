import java.util.ArrayList;
public class Returnable {
    Registration reg;
    Teacher T;
    Returnable()
    {
        reg=null;
        T=null;
    }
    Returnable(Registration reg,Teacher T)
    {
        this.reg=reg;
        this.T=T;
    }
}

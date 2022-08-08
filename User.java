import java.io.Serializable;

public abstract class User{
    protected String username, password;

    public User(){
        username = password = "";
    }
    public User(String u, String p){
        username = u;
        password = p;
    }
}
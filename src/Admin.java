import java.io.*;

public class Admin implements Serializable {
    private static final long serialVersionUID= 5781297499449196009L;
    String Username;
    String Password;

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }
    public Admin getAdmin() throws IOException, ClassNotFoundException {
        FileInputStream f= new FileInputStream("data/credentials.dat");
        ObjectInputStream o=new ObjectInputStream(f);
        Admin k= (Admin) o.readObject();
        System.out.println(k.getUsername());
        System.out.println("called");
        return k;
    }

}

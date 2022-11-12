import java.io.*;
import java.util.ArrayList;

public class Pharmacy implements Serializable{
    String Drug_name;
    int Drug_Available;
    float Drug_price;
    String Drug_Expiry;
    private static final long serialVersionUID = -1251800471638761224L;
    Pharmacy()
    {

    }
    float findPrice(ArrayList<Integer> di,ArrayList<Integer> qty) throws IOException, ClassNotFoundException {
        Pharmacy p;
        float total_price=0;
        int i;
        for(i=0;i<di.size();i++)
        {
            FileInputStream f=new  FileInputStream ("data/Drug_details/"+di.get(i)+".dat");
            ObjectInputStream o=new ObjectInputStream(f);
            p=(Pharmacy) o.readObject();
            if(p.Drug_Available>=0)
                total_price+=qty.get(i)*p.Drug_price;

        }
        return total_price;
    }
}

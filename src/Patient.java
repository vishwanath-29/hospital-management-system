import java.io.*;

public class Patient  implements Serializable {
    private static final long serialVersionUID=7676464378708791100L;
    String FirstName;
    String LastName;
    int Age;
    String Gender;
    Long ContactNo;
    int Regno;
    Address a;
    Patient()
    {
        a=new Address();
    }

    public void addPatient(String FirstName,String LastName,String Gender,int Age,int Houseno,String Streetname,String District,String State,Long Contactno,int Pincode)
    {

        int number=0;
        try
        {
            FileInputStream f = new FileInputStream("data/number_of_patients.txt");
            number=f.read();
            FileOutputStream f1=new FileOutputStream("data/number_of_patients.txt");
            number+=1;
            f1.write(number);
            f.close();
            f1.close();
            System.out.println("NUMBER VALUE"+number);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Gender=Gender;
        this.Age=Age;
        this.a.Housemo=Houseno;
        this.a.Street=Streetname;
        this.a.District=District;
        this.a.State=State;
        this.a.Pincode=Pincode;
        this.ContactNo=Contactno;
        this.Regno=number;

        try
        {
            FileOutputStream file= new FileOutputStream("data/Patient_details/"+number+".dat");
            ObjectOutputStream write_object=new ObjectOutputStream(file);
            write_object.writeObject(this);
            write_object.flush();
            write_object.close();
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}


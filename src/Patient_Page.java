import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Patient_Page implements ActionListener
{

    boolean count=false;
    JFrame frame;
    JPanel panel;
    //PANELS
    JPanel Title_panel;
    JPanel FirstName_panel;
    JPanel LastName_panel;
    JPanel Age_panel;
    JPanel Gender_panel;
    JPanel Houseno_panel;
    JPanel StreetName_panel;
    JPanel District_panel;
    JPanel State_panel;
    JPanel Pincode_panel;
    JPanel Contactno_panel;
    JPanel AddPatient_panel;

    //TEXT FIELD
    JTextField FirstName_value;
    JTextField LastName_value;
    JTextField Age_value;
    JTextField Houseno_value;
    JTextField StreetName_value;
    JTextField District_value;
    JTextField State_value;
    JTextField Contactno_value;
    JTextField Pincode_value;

    //LABELS
    JLabel Title;
    JLabel FirstName;
    JLabel LastName;
    JLabel Age;
    JLabel Gender;
    JLabel Houseno;
    JLabel StreetName;
    JLabel District;
    JLabel State;
    JLabel Pincode;
    JLabel Contactno;

    //Button
    JButton AddPatient;

    //Radio Button
    ButtonGroup gender_values;
    JRadioButton gender_male;
    JRadioButton gender_female;
    JRadioButton gender_others;


    Patient_Page()
    {
        frame= new JFrame("HOSPITAL MANAGEMENT");
        panel=new JPanel();
        gender_values=new ButtonGroup();
        panel.setSize(1000,1000);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.setOpaque(true);

        Title_panel=new JPanel();
        FirstName_panel=new JPanel();
        LastName_panel=new JPanel();
        Age_panel=new JPanel();
        Houseno_panel=new JPanel();
        StreetName_panel=new JPanel();
        District_panel=new JPanel();
        State_panel=new JPanel();
        Pincode_panel=new JPanel();
        Gender_panel=new JPanel();
        AddPatient_panel=new JPanel();
        Contactno_panel=new JPanel();
        AddPatient=new JButton();

        //TTILE
        Title=new JLabel("PATIENT ADDITION");
        Title.setFont(new Font("Arial Black", Font.BOLD, 27));
        Title_panel.add(Title);
        Border Title_border = Title_panel.getBorder();
        Border Title_margin = new EmptyBorder(0,50,30,0); 
        Title_panel.setBorder(new CompoundBorder(Title_border, Title_margin));
        panel.add(Title_panel);

        //FirstName
        FirstName=new JLabel("FIRST NAME");
        FirstName_value=new JTextField(25);
        FirstName.setFont(new Font("Arial Black", Font.BOLD, 15));
        FirstName_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        FirstName_value.setPreferredSize(new Dimension(70,30));
        FirstName_panel.add(FirstName);
        FirstName_panel.add(FirstName_value);
        Border FirstName_border = FirstName_panel.getBorder();
        Border FirstName_margin = new EmptyBorder(0,10,20,0); 
        FirstName_panel.setBorder(new CompoundBorder(FirstName_border, FirstName_margin));
        panel.add(FirstName_panel);

        //LastName
        LastName=new JLabel("LAST NAME");
        LastName_value=new JTextField(25);
        LastName_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        LastName.setFont(new Font("Arial Black", Font.BOLD, 15));
        LastName_value.setPreferredSize(new Dimension(70,30));
        LastName_panel.add(LastName);
        LastName_panel.add(LastName_value);
        Border LastName_border = LastName_panel.getBorder();
        Border LastName_margin = new EmptyBorder(0,10,20,0); 
        LastName_panel.setBorder(new CompoundBorder(LastName_border, LastName_margin));
        panel.add(LastName_panel);

        //Age
        Age=new JLabel("AGE");
        Age_value=new JTextField(25);
        Age.setFont(new Font("Arial Black", Font.BOLD, 15));
        Age_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        Age_value.setPreferredSize(new Dimension(70,30));
        Border Age_label_border= Age.getBorder();
        Border Age_label_margin=new EmptyBorder(0,60,0,0);
        Age_panel.setBorder(new CompoundBorder(Age_label_border, Age_label_margin));
        Age_panel.add(Age);
        Age_panel.add(Age_value);
        Border Age_border = Age_panel.getBorder();
        Border Age_margin = new EmptyBorder(0,10,20,0); 
        Age_panel.setBorder(new CompoundBorder(Age_border, Age_margin));
        panel.add(Age_panel);

        //Contact No
        Contactno=new JLabel("CONTACT NO");
        Contactno_value=new JTextField(25);
        Contactno.setFont(new Font("Arial Black", Font.BOLD, 15));
        Contactno_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        Contactno_value.setPreferredSize(new Dimension(70,30));
        Border contactno_label_border= District_panel.getBorder();
        Border contactno_label_margin=new EmptyBorder(0,-8,0,0);
        Contactno_panel.setBorder(new CompoundBorder(contactno_label_border, contactno_label_margin));
        Contactno_panel.add(Contactno);
        Contactno_panel.add(Contactno_value);
        Border contact_border = Contactno_panel.getBorder();
        Border contact_margin = new EmptyBorder(0,10,20,0); 
        Contactno_panel.setBorder(new CompoundBorder(contact_border, contact_margin));
        panel.add(Contactno_panel);

        //Gender
        Gender=new JLabel("GENDER");
        gender_male=new JRadioButton();
        gender_male.setText("MALE");
        gender_male.setFont(new Font("Arial Black", Font.BOLD, 15));
        gender_male.setSelected(false);
        gender_female=new JRadioButton();
        gender_female.setText("FEMALE");
        gender_female.setSelected(false);
        gender_female.setFont(new Font("Arial Black", Font.BOLD, 15));;
        gender_others=new JRadioButton();
        gender_others.setText("OTHERS");
        gender_others.setSelected(false);
        gender_others.setFont(new Font("Arial Black", Font.BOLD, 15));
        Gender.setFont(new Font("Arial Black", Font.BOLD, 15));
        Border gender_label_border= new EmptyBorder(0,10,0,0);
        Border gender_label_margin=new EmptyBorder(0,-100,0,7);
        Gender_panel.setBorder(new CompoundBorder(gender_label_border, gender_label_margin));
        Gender_panel.setPreferredSize(new Dimension(200,40));
        gender_values.add(gender_male);
        gender_values.add(gender_female);
        gender_values.add(gender_others);
        Gender_panel.add(Gender);
        Gender_panel.add(gender_male);
        Gender_panel.add(gender_female);
        Gender_panel.add(gender_others);
        panel.add(Gender_panel);


        //Houseno
        Houseno=new JLabel("HOUSE NO");
        Houseno_value=new JTextField(25);
        Houseno.setFont(new Font("Arial Black", Font.BOLD, 15));
        Houseno_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        Houseno_value.setPreferredSize(new Dimension(70,30));
        Border Houseno_label_border= new EmptyBorder(0,5,0,0);
        Border Houseno_label_margin=new EmptyBorder(0,-3,0,0);
        Houseno.setBorder(new CompoundBorder(Houseno_label_border, Houseno_label_margin));
        Houseno_panel.add(Houseno);
        Houseno_panel.add(Houseno_value);
        Border Houseno_border = Houseno_panel.getBorder();
        Border Houseno_margin = new EmptyBorder(0,10,20,0); 
        Houseno_panel.setBorder(new CompoundBorder(Houseno_border, Houseno_margin));
        panel.add(Houseno_panel);

        //Streetname
        StreetName=new JLabel("STREET NAME");
        StreetName_value=new JTextField(25);
        StreetName.setFont(new Font("Arial Black", Font.BOLD, 15));
        StreetName_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        StreetName_value.setPreferredSize(new Dimension(70,30));
        Border Streetname_label_border= StreetName_panel.getBorder();
        Border Streetname_label_margin=new EmptyBorder(0,-20,0,0);
        StreetName_panel.setBorder(new CompoundBorder(Streetname_label_border, Streetname_label_margin));
        StreetName_panel.add(StreetName);
        StreetName_panel.add(StreetName_value);
        Border StreetName_border = StreetName_panel.getBorder();
        Border StreetName_margin = new EmptyBorder(0,11,20,0); 
        StreetName_panel.setBorder(new CompoundBorder(StreetName_border, StreetName_margin));
        panel.add(StreetName_panel);

        //District
        District=new JLabel("DISTRICT");
        District_value=new JTextField(25);
        District.setFont(new Font("Arial Black", Font.BOLD, 15));
        District_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        District_value.setPreferredSize(new Dimension(70,30));
        Border District_label_border= District_panel.getBorder();
        Border District_label_margin=new EmptyBorder(0,10,0,0);
        District_panel.setBorder(new CompoundBorder(District_label_border, District_label_margin));
        District_panel.add(District);
        District_panel.add(District_value);
        Border District_border = District_panel.getBorder();
        Border District_margin = new EmptyBorder(0,10,20,0); 
        District_panel.setBorder(new CompoundBorder(District_border, District_margin));
        panel.add(District_panel);

        //State
        State=new JLabel("STATE");
        State_value=new JTextField(25);
        State.setFont(new Font("Arial Black", Font.BOLD, 15));
        State_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        State_value.setPreferredSize(new Dimension(70,30));
        Border State_label_border= District_panel.getBorder();
        Border State_label_margin=new EmptyBorder(0,10,0,0);
        State_panel.setBorder(new CompoundBorder(State_label_border, State_label_margin));
        State_panel.add(State);
        State_panel.add(State_value);
        Border State_border = State_panel.getBorder();
        Border State_margin = new EmptyBorder(0,10,0,0); 
        State_panel.setBorder(new CompoundBorder(State_border, State_margin));
        panel.add(State_panel);

        //Pincode
        Pincode=new JLabel("PINCODE");
        Pincode_value=new JTextField(25);
        Pincode.setFont(new Font("Arial Black", Font.BOLD, 15));
        Pincode_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        Pincode_value.setPreferredSize(new Dimension(70,30));
        Border pincode_label_border= District_panel.getBorder();
        Border pincode_label_margin=new EmptyBorder(0,-5,0,0);
        Pincode_panel.setBorder(new CompoundBorder(pincode_label_border, pincode_label_margin));
        Pincode_panel.add(Pincode);
        Pincode_panel.add(Pincode_value);
        Border Pincode_border = Pincode_panel.getBorder();
        Border Pincode_margin = new EmptyBorder(0,10,20,0); 
        Pincode_panel.setBorder(new CompoundBorder(Pincode_border, Pincode_margin));
        panel.add(Pincode_panel);


        // BUTTON
        AddPatient.setText("ADD PATIENT");
        AddPatient.setFont(new Font("Arial Black", Font.BOLD, 15));
        AddPatient_panel.add(AddPatient);
        panel.add(AddPatient_panel);
        AddPatient.addActionListener(this);


        frame.add(panel,BorderLayout.CENTER);
        frame.setLayout(new GridBagLayout());
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
      int[] i =validate();
      if( warning(i)==1)
      check();
      if(count)
        {
            new Patient_Page();
        }
    }
    public int[] validate()
    {
        int[] k =new int[10];

        if(FirstName_value.getText().length()==0)
            k[0]=1;
        if(LastName_value.getText().length()==0)
            k[1]=1;
        if(Age_value.getText().length()==0)
            k[2]=1;
        if(gender_values.getSelection()==null)
            k[3]=1;
        if(Houseno_value.getText().length()==0)
            k[4]=1;
        if(StreetName_value.getText().length()==0)
            k[5]=1;
        if(District_value.getText().length()==0)
            k[6]=1;
        if(State_value.getText().length()==0)
            k[7]=1;
        if(Pincode_value.getText().length()==0)
            k[8]=1;
        if(Contactno_value.getText().length()==0)
            k[9]=1;
        return k;


    }

    public int warning(int k[])
    {
        String msg="ENTER ";
        int j=0;
        if(k[0]==1)
            msg+="FIRST NAME";
        if(k[1]==1)
            if(!msg.equals("ENTER "))
            msg+=", LAST NAME";
            else
            msg+="LAST NAME";
        if(k[2]==1)
        if(!msg.equals("ENTER "))
            msg+=", AGE";
        else
            msg+="AGE" ;
        if(k[9]==1)
            if(!msg.equals("ENTER "))
                msg+=", CONTACT NO";
            else
                msg+="CONTACT NO" ;
        if(k[3]==1)
            if(!msg.equals("ENTER "))
                msg+=", GENDER";
            else
                msg+="GENDER" ;
        if(k[4]==1)
            if(!msg.equals("ENTER "))
                msg+=", HOUSE NO";
            else
                msg+="HOUSE NO" ;
        if(k[5]==1)
            if(!msg.equals("ENTER "))
                msg+=", STREET NAME";
            else
                msg+="STREET NAME" ;
        if(k[6]==1)
            if(!msg.equals("ENTER "))
                msg+=", DISTRICT";
            else
                msg+="DISTRICT" ;
        if(k[7]==1)
            if(!msg.equals("ENTER "))
                msg+=", STATE";
            else
                msg+="STATE" ;
        if(k[8]==1)
            if(!msg.equals("ENTER "))
                msg+=", PINCODE";
            else
                msg+="PINCODE" ;
        System.out.println(msg);
        if(! msg.equals("ENTER ")) {
            JOptionPane.showMessageDialog(null, msg);
        }
        if(msg.equals("ENTER "))
            j++;

        return j;
    }
    public void check()

    {
        int j=0;
       String msg="ENTER VALID\n";

        try
        {

            Integer.parseInt(Age_value.getText());
            j++;
            Integer.parseInt(Pincode_value.getText());
            j++;
            Integer.parseInt(Houseno_value.getText());
            j++;
            Long.parseLong(Contactno_value.getText());
            j++;

        }
        catch (Exception e)
        {
           switch (j)
            {
                case 0:
                    msg="ENTER VALID AGE \n* MUST BE A NUMBER";
                    break;
                case 1:
                    msg="ENTER VALID PINCODE \n* MUST BE A NUMBER";
                    break;
                case 2:
                    msg="ENTER VALID HOUSE NO \n* MUST BE A NUMBER";
                    break;
                case 3:
                    msg="ENTER VALID CONTACT NO \n* MUST BE A NUMBER";
                    break;

            }

        }
        if(j==4)
        {
            try {
                if (Integer.parseInt(Age_value.getText())<=4)
                    throw new Hospital_Exception(1);
            } catch (Hospital_Exception e) {
                msg += e.Message;
                msg+="\n* MUST BE GREATER THAN 4\n ";

            }
            try {
                if (Contactno_value.getText().length() != 10)
                    throw new Hospital_Exception(2);
            } catch (Hospital_Exception e) {
                msg += e.Message;
                msg+="\n* MUST BE 10 NUMBERS\n";

            }
            try {
                if (Pincode_value.getText().length() != 6)
                    throw new Hospital_Exception(3);
            } catch (Hospital_Exception e) {
                msg += e.Message;
                msg+="\n* MUST BE 6 NUMBERS\n";

            }

        }
        if(!msg.equals("ENTER VALID\n"))
            JOptionPane.showMessageDialog(null,msg,"ERROR",JOptionPane.ERROR_MESSAGE);
        else
        {
            Patient p=new Patient();
            String g;

            if(gender_male.isSelected())
                g="Male";
            else if(gender_female.isSelected())
                g="Female";
            else
                g="Others";

            p.addPatient(FirstName_value.getText().toUpperCase(),LastName_value.getText().toUpperCase().toUpperCase(),g,Integer.parseInt(Age_value.getText()),Integer.parseInt(Houseno_value.getText()),StreetName_value.getText().toUpperCase(),District_value.getText().toUpperCase(),State_value.getText().toUpperCase(),Long.parseLong(Contactno_value.getText()),Integer.parseInt(Pincode_value.getText()));
            JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED PATIENT");
            count=true;
        }
    }
}

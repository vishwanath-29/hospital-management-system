import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Objects;

public class Pharmacy_Page implements ActionListener {

    JFrame frame;
    JPanel panel_left;
    JPanel panel_middle;
    JPanel panel_right;

    //PANELS
    JPanel Title_panel;
    JPanel Search_panel;
    JPanel FirstName_panel;
    JPanel LastName_panel;
    JPanel Age_panel;
    JPanel Gender_panel;
    JPanel Address_panel;
    JPanel Contactno_panel;
    JPanel Instructions_panel;
    JPanel Drug_panel;
    JPanel Drug_qty_panel;
    JPanel Bill_panel;
    JPanel Getdetails_panel;
    JPanel Confirmation_panel;

    //Text Fields
    JTextArea FirstName_value;
    JTextArea Search_value;
    JTextArea LastName_value;
    JTextArea Gender_value;
    JTextArea Age_value;
    JTextArea Contactno_value;
    JTextArea Bill_value;
    JTextArea Address_value;
    JTextArea Instructions_value;
    JTextArea Drug_qty_value;

    JComboBox<String> Drug_value;

    //Labels;
    JLabel Title;
    JLabel Search;
    JLabel FirstName;
    JLabel LastName;
    JLabel Gender;
    JLabel Age;
    JLabel Address;
    JLabel Contact;
    JLabel Drug;
    JLabel Bill;
    JLabel Instructions;
    JLabel Drug_qty;

    //Buttons
    JButton Getdetails;
    JButton Submit;
    JButton Addmore;
    String[] drug_name={"","Aspirin", "Dolo 650","Calpol" ,"Metacin" ,"Paracetamol" ,"Alegra" ,"Coldact" ,"Gentamicin" ,"Pencillinpendcs" ,"Bendryll 100ml" ,"Ascoril ","Insulin" ,"Omeberazole" ,"Citricn" ,"Gemer" ,"Gelusil" ,"Calamine" ,"lotion ","Terbinofine" ,"Dettol","Savalon"};

    ArrayList<Integer> drug_index=new ArrayList<>();
    ArrayList<Integer> drug_qty_req=new ArrayList<>();
    public Pharmacy_Page()
    {
        Title_panel=new JPanel();
        Search_panel=new JPanel();
        FirstName_panel=new JPanel();
        LastName_panel=new JPanel();
        Age_panel=new JPanel();
        Gender_panel=new JPanel();
        Address_panel=new JPanel();
        Contactno_panel=new JPanel();
        Instructions_panel=new JPanel();
        Drug_panel=new JPanel();
        Drug_qty_panel=new JPanel();
        Bill_panel=new JPanel();
        Confirmation_panel=new JPanel();
        Confirmation_panel.setLayout(new FlowLayout());
        frame=new JFrame();
        panel_left=new JPanel();
        panel_middle=new JPanel();
        panel_right=new JPanel();
        panel_left.setLayout(new GridLayout(8,1));
        panel_middle.setLayout(new GridLayout(7,1));
        panel_right.setLayout(new GridLayout(6,0));

        //LEFT SIDE OF THE UI
        //EMPTY SPACING FOR LEFT
        panel_left.add(new JPanel());
        panel_left.add(new JPanel());
        //SEARCH PANEL
        Search=new JLabel("ENTER THE REGISTER NUMBER ");
        Search.setFont(new Font("Arial Black", Font.BOLD, 17));
        Search_value=new JTextArea();
        Search_value.setFont(new Font("Arial Black", Font.BOLD, 18));
        Search_value.setPreferredSize(new Dimension(200,28));
        Search_panel.add(Search);
        Search_panel.add(Search_value);
        panel_left.add(Search_panel);

        //ADD MORE
        Addmore=new JButton("ADD MORE");
        Addmore.setPreferredSize(new Dimension(180,60));
        Confirmation_panel.add(Addmore);
        Addmore.addActionListener(this);

        //EMPTY SPACE FOR BETWEEN BUTTON
        Confirmation_panel.add(new JPanel());
        Confirmation_panel.add(new JPanel());

        //Submit
        Submit=new JButton("SUBMIT");
        Submit.setPreferredSize(new Dimension(180,60));
        Confirmation_panel.add(Submit);
        Submit.addActionListener(this);

        //Get Details
        Getdetails=new JButton("GET DETAILS");
        Getdetails.setPreferredSize(new Dimension(180,60));
        Getdetails_panel=new JPanel();
        Getdetails_panel.setLayout(new FlowLayout());
        Getdetails_panel.add(Getdetails);
        Getdetails.addActionListener(this);

        //Adding to top
        panel_left.add(Getdetails_panel);
        panel_left.add(Confirmation_panel);

        //MIDDLE PART OF THE UI
        //TITLE
        Title=new JLabel("PHARMACY");
        Title.setFont(new Font("Arial Black", Font.BOLD, 20));
        Title_panel.add(Title);
        panel_middle.add(Title_panel);

        //FirstName
        FirstName=new JLabel("FIRST NAME ");
        FirstName.setFont(new Font("Arial Black", Font.BOLD, 17));
        FirstName_value=new JTextArea(3,21);
        FirstName_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        FirstName_value.setEditable(false);
        FirstName_value.setBorder(new LineBorder(new Color(0,0,0)));
        FirstName_panel.add(FirstName);
        FirstName_panel.add(FirstName_value);


        //LastName
        LastName=new JLabel("LAST NAME ");
        LastName.setFont(new Font("Arial Black", Font.BOLD, 17));
        LastName_value=new JTextArea(3,21);
        LastName_value.setEditable(false);
        LastName_value.setBorder(new LineBorder(new Color(0,0,0)));
        LastName_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        LastName_panel.add(LastName);
        LastName_panel.add(LastName_value);



        //GENDER
        Gender=new JLabel("GENDER ",SwingConstants.RIGHT);
        Gender.setPreferredSize(new Dimension(130,20));
        Gender.setFont(new Font("Arial Black", Font.BOLD, 17));
        Gender_value=new JTextArea(3,21);
        Gender_value.setEditable(false);
        Gender_value.setBorder(new LineBorder(new Color(0,0,0)));
        Gender_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        Gender_panel.add(Gender);
        Gender_panel.add(Gender_value);
        Gender.setOpaque(true);

        //AGE
        Age=new JLabel("AGE ",SwingConstants.RIGHT);
        Age.setPreferredSize(new Dimension(130,20));
        Age.setFont(new Font("Arial Black", Font.BOLD, 17));
        Age_value=new JTextArea(3,21);
        Age_value.setEditable(false);
        Age_value.setBorder(new LineBorder(new Color(0,0,0)));
        Age_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        Age_panel.add(Age);
        Age_panel.add(Age_value);

        //CONTACT NO
        Contact=new JLabel("CONTACT NO ",SwingConstants.LEFT);
        Contact.setPreferredSize(new Dimension(130,20));
        Contact.setOpaque(true);
        Contact.setFont(new Font("Arial Black", Font.BOLD, 17));
        Contactno_value=new JTextArea(3,21);
        Contactno_value.setEditable(false);
        Contactno_value.setBorder(new LineBorder(new Color(0,0,0)));
        Contactno_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        Contactno_panel.add(Contact);
        Contactno_panel.add(Contactno_value);

        //Adress
        Address=new JLabel("ADDRESS ",SwingConstants.RIGHT);
        Address_panel.setLayout(new FlowLayout());
        Address.setOpaque(true);
        Address.setPreferredSize(new Dimension(170,20));
        Address.setFont(new Font("Arial Black", Font.BOLD, 17));
        Address_value=new JTextArea(7,21);
        Address_value.setBorder(new LineBorder(new Color(0,0,0)));
        Address_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        Address_value.setEditable(false);
        Address_panel.add(Address);
        Address_panel.add(Address_value);

        //ADDING TO LEFT PANEL
        panel_middle.add(FirstName_panel);
        panel_middle.add(LastName_panel);
        panel_middle.add(Gender_panel);
        panel_middle.add(Age_panel);
        panel_middle.add(Contactno_panel);
        panel_middle.add(Address_panel);

        //RIGHT SIDE OF THE UI
        //Drug Name
        Drug=new JLabel("DRUG ",SwingConstants.RIGHT);
        Drug.setFont(new Font("Arial Black", Font.BOLD, 17));
        Drug_value=new JComboBox<>(drug_name);
        Drug.setPreferredSize(new Dimension(140,20));
        Drug_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        Drug_value.setBorder(new LineBorder(new Color(0,0,0)));
        AutoCompleteDecorator.decorate(Drug_value);
        Drug_value.setEditable(true);
        Drug_panel.add(Drug);
        Drug_panel.add(Drug_value);

       //Drug quantity
        Drug_qty=new JLabel("DRUG QUANTITY ",SwingConstants.LEFT);
        Drug_qty.setFont(new Font("Arial Black", Font.BOLD, 17));
        Drug_qty.setPreferredSize(new Dimension(165,20));
        Drug_qty_value=new JTextArea(3,22);
        Drug_qty_value.setBorder(new LineBorder(new Color(0,0,0)));
        Drug_qty_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        Drug_qty_panel.add(Drug_qty);
        Drug_qty_panel.add(Drug_qty_value);

        //Bill details
        Bill=new JLabel("BILL AMOUNT",SwingConstants.CENTER);
        Bill.setFont(new Font("Arial Black", Font.BOLD, 17));
        Bill.setPreferredSize(new Dimension(140,20));
        Bill_value=new JTextArea(3,21);
        Bill_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        Bill_value.setBorder(new LineBorder(new Color(0,0,0)));
        Bill_value.setEditable(false);
        Bill_panel.add(Bill);
        Bill_panel.add(Bill_value);

        //INSTRUCTION
        Instructions=new JLabel("INSTRUCTIONS ",SwingConstants.RIGHT);
        Instructions.setFont(new Font("Arial Black", Font.BOLD, 17));
        Instructions_value=new JTextArea(7,22);
        Instructions_value.setFont(new Font("Arial Black", Font.BOLD, 17));
        Instructions_value.setBorder(new LineBorder(new Color(0,0,0)));
        Instructions_panel.add(Instructions);
        Instructions_panel.add(Instructions_value);

        //Panel adding - right
        panel_right.add(new JPanel());
        panel_right.add(Drug_panel);
        panel_right.add(Drug_qty_panel);
        panel_right.add(Bill_panel);
        panel_right.add(Instructions_panel);

        frame.setLayout(new GridLayout(1,3));
        frame.add(panel_left);
        frame.add(panel_middle);
        frame.add(panel_right);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);




    }
        public  void actionPerformed(ActionEvent event)
        {
            if (Objects.equals(event.getActionCommand(), "GET DETAILS"))
            {
                int j=Integer.parseInt(Search_value.getText());
                Patient p=getdetails(j);
                if(p!=null)
                displayDetails(p);
            }
            else if (event.getActionCommand().equals("ADD MORE"))
             try{
                 if(addmore())
                     JOptionPane.showMessageDialog(null,"NOT AVAILABLE","ERROR",JOptionPane.ERROR_MESSAGE);
                 else {
                     drug_index.add(Drug_value.getSelectedIndex());
                     drug_qty_req.add(Integer.parseInt(Drug_qty_value.getText()));
                 }

             }
            catch (Exception e)
            {
                System.out.println(e);
            }
            else if(event.getActionCommand().equals("SUBMIT")) {
                Pharmacy p=new Pharmacy();
               try {
                   if(addmore())
                       JOptionPane.showMessageDialog(null,"NOT AVAILABLE","ERROR",JOptionPane.ERROR_MESSAGE);
                   else {
                       drug_index.add(Drug_value.getSelectedIndex());
                       drug_qty_req.add(Integer.parseInt(Drug_qty_value.getText()));
                   }

                     float l = p.findPrice(drug_index,drug_qty_req);
                    Bill_value.setText(String.valueOf(l));
                    print();
                }
               catch (Exception e)
               {
                   System.out.println(e);
               }
            }
        }
        public Patient getdetails(int j)
        {
            Patient p=null;
            try
            {
                FileInputStream f = new FileInputStream("data/Patient_details/" + j + ".dat" );
                ObjectInputStream o=new ObjectInputStream(f);
                p=(Patient) o.readObject();

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"PATIENT UNAVAIALBLE \n\n LOGIN AS ADMIN AND\n ADD THE PATIENT","ERROR NOT AVAILABLE",JOptionPane.ERROR_MESSAGE);
                new Admin_Page();
                frame.dispose();
            }
            return p;
        }
        public void displayDetails(Patient p)
        {
            FirstName_value.setText(p.FirstName);
            LastName_value.setText(p.LastName);
            Age_value.setText(String.valueOf(p.Age));
            Gender_value.setText(p.Gender);
            Contactno_value.setText(String.valueOf(p.ContactNo));
            Address_value.setText(p.a.Housemo+"  "+p.a.Street+"  "+p.a.District+"  "+p.a.State+"  "+p.a.Pincode);

        }
        public boolean addmore() throws IOException, ClassNotFoundException {

            FileInputStream f1=new FileInputStream("data/Drug_details/"+Drug_value.getSelectedIndex()+".dat");
            ObjectInputStream o1=new ObjectInputStream(f1);
            Pharmacy p=(Pharmacy) o1.readObject();
            int qty=Integer.parseInt(Drug_qty_value.getText());
            if(p.Drug_Available-qty>0)
                p.Drug_Available=p.Drug_Available-qty;
            else
                return true;

            o1.close();
            f1.close();
            FileOutputStream f=new FileOutputStream("data/Drug_details/"+Drug_value.getSelectedIndex()+".dat");
            ObjectOutputStream o=new ObjectOutputStream(f);
            o.writeObject(p);

            o.flush();
            o.close();
            f.close();
            return false;

        }

        public void print() throws IOException {
            LocalDateTime now = LocalDateTime.now();
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/Bill/"+Search_value.getText()+"_"+now.getHour()+now.getMinute()+now.getSecond()+".txt"));            writer.write(FirstName_value.getText()+LastName.getText()+Age_value.getText()+Contactno_value.getText()+Address_value.getText()+Bill_value.getText());
            for(int i=0;i<drug_index.size();i++)
                writer.write(drug_index.get(i)+"PRICE "+drug_qty_req.get(i));
            writer.write(Bill_value.getText());
            writer.close();
        }


}


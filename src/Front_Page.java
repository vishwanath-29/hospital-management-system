import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//TODO PUT BACK BUTTON
//TODO CONNECT DATABASE
public class Front_Page implements ActionListener {
    JButton admin;
    JButton pharmacy;
    JFrame frame;
    JPanel panel;

    Front_Page() {

        panel = new JPanel();
        frame = new JFrame();
        frame.setLayout(new GridBagLayout());

        //BUTTONS
        admin = new JButton("ADMIN");
        admin.setPreferredSize(new Dimension(200,50));
        pharmacy = new JButton("PHARMACY");
        pharmacy.setPreferredSize(new Dimension(200,50));


        //ADDING ELEMENTS
        panel.setLayout(new GridLayout(3,0,70,70));
        panel.setSize(400,500);
        panel.add(admin);
        panel.add(pharmacy);
        frame.add(panel);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        // LISTENERS
        pharmacy.addActionListener(this);
        admin.addActionListener(this);
    }

   public static void main(String[] a) {
        new Front_Page();
   }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getActionCommand().equals("ADMIN")) {
            new Admin_Page();
            frame.dispose();

        }
        if(actionEvent.getActionCommand().equals("PHARMACY"))
        {
            new Pharmacy_Page();
            frame.dispose();
        }
        
    }

}
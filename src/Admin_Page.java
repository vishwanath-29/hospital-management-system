
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Admin_Page implements ActionListener {
    Admin a;
    JFrame frame;
    JPanel panel;
    JPanel user_column;
    JPanel password_column;
    JPanel sign_in_column;
    JButton sign_in;
    JTextField username_value;
    JLabel username;
    JLabel password;
    JPasswordField password_value;

    Admin_Page() {
        frame= new JFrame();
        panel=new JPanel();
        user_column=new JPanel();
        password_column =new JPanel();
        sign_in_column=new JPanel();
        sign_in=new JButton("SIGN IN");
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        user_column.setLayout(new BoxLayout(user_column,BoxLayout.X_AXIS));
        password_column.setLayout(new BoxLayout(password_column,BoxLayout.X_AXIS));

        //USER NAME
        username=new JLabel("USER NAME ");
        username_value=new JTextField(10);
        username.setFont(new Font("Arial Black", Font.BOLD, 15));
        username_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        username_value.setPreferredSize(new Dimension(70,30));
        user_column.add(username);
        user_column.add(username_value);
        Border username_border = user_column.getBorder();
        Border username_margin = new EmptyBorder(0,10,20,0);
        user_column.setBorder(new CompoundBorder(username_border, username_margin));
        panel.add(user_column);

        // PASSWORD
        password=new JLabel("PASSWORD ");
        password_value=new JPasswordField(10);
        password.setFont(new Font("Arial Black", Font.BOLD, 15));
        password_value.setFont(new Font("Arial Black", Font.BOLD, 15));
        password_value.setPreferredSize(new Dimension(70,30));
        password_column.add(password);
        password_column.add(password_value);
        panel.add(password_column);
        Border password_border = user_column.getBorder();
        Border password_margin = new EmptyBorder(0,0,20,0);
        password_column.setBorder(new CompoundBorder(password_border, password_margin));

        // BUTTON
        sign_in_column.add(sign_in);
        sign_in.setPreferredSize(new Dimension(100,30));
        panel.add(sign_in_column);
        sign_in.addActionListener(this);

        frame.add(panel, BorderLayout.CENTER);
        frame.setLayout(new GridBagLayout());
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        frame.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    a= new Admin();
        try {
            a = a.getAdmin();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String username=username_value.getText().toString();
        String password= String.valueOf(password_value.getPassword());
        System.out.println(a.getUsername());
        System.out.println(a.getPassword());
        if(username.equals(a.getUsername()) && password.equals(a.getPassword()))
        {
            new Patient_Page();
            frame.dispose();
        }
        else
            JOptionPane.showMessageDialog(null,"AUTHENTICATION ERROR","ERROR",JOptionPane.ERROR_MESSAGE);

    }
}

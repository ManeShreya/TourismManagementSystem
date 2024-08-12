
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class AddCustomerDetails extends JFrame implements ActionListener {
    
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfno,tfcountry,tfaddress,tfphone,tfemail;
    JRadioButton rmale,rfemale;
    
    
    AddCustomerDetails(String Username)
    {

        
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setForeground(Color.BLACK);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);
        
        labelusername= new JLabel();
        labelusername.setBounds(220, 50, 150, 25);
        add(labelusername);
        
        JLabel lblid = new JLabel("Id Proof");
        lblid.setForeground(Color.BLACK);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);
        
        comboid = new JComboBox(new String[] {"Passport","Adhar Card","Pan Card","Ration Card"});
        comboid.setBounds(220, 90, 150, 25);
        comboid.setBackground(Color.WHITE);
        add(comboid);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setForeground(Color.BLACK);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblnumber.setBounds(30, 130, 150, 25);
        add(lblnumber);
        
        tfno = new JTextField();
        tfno.setBounds(220, 130, 200, 25);
        add(tfno);
        
        JLabel lblname = new JLabel("Name");
        lblname.setForeground(Color.BLACK);
        lblname.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblname.setBounds(30,170, 150, 25);
        add(lblname);
        
        labelname = new JLabel();
        labelname.setBounds(220, 170, 150, 25);
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setForeground(Color.BLACK);
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblgender.setBounds(30,210, 150, 25);
        add(lblgender);
        
        rmale = new JRadioButton(new String("Male"));
        rmale.setBounds(220, 210, 70, 25);
        add(rmale);
        
        rfemale = new JRadioButton(new String("Female"));
        rfemale.setBounds(300, 210, 80, 25);
        add(rfemale);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setForeground(Color.BLACK);
        lblcountry.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblcountry.setBounds(30, 250, 150, 25);
        add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(220, 250, 200, 25);
        add(tfcountry);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setForeground(Color.BLACK);
        lbladdress.setFont(new Font("Tahoma",Font.PLAIN,16));
        lbladdress.setBounds(30, 290, 150, 25);
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220, 290, 200, 25);
        add(tfaddress);
        
        JLabel lblphone = new JLabel("Contact No.");
        lblphone.setForeground(Color.BLACK);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblphone.setBounds(30, 330, 150, 25);
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(220, 330, 200, 25);
        add(tfphone);
        
        JLabel lblemail = new JLabel("Email Id");
        lblemail.setForeground(Color.BLACK);
        lblemail.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblemail.setBounds(30, 370, 150, 25);
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(220, 370, 200, 25);
        add(tfemail);
        
        JButton add = new JButton("Add");
        add.setBounds(100, 440, 100, 25);
        add.addActionListener(this);
        add(add);
        
         
        JButton back = new JButton("Back");
        back.setBounds(250, 440, 100, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 40, 450, 420);
        add(image);
        
        try
        {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username = 'shreya mane' ");
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        setVisible(true);
}
        
    public void actionPerformed(ActionEvent ae)
    {
        String username = labelusername.getText();
        String id = (String)comboid.getSelectedItem();
        String no = tfno.getText();
        String name = labelname.getText();
        String gender = null;
        if(rmale.isSelected())
        {
            gender="Male";
        }
        else
        {
            gender="Female";
        }
        String country = tfcountry.getText();
        String address = tfaddress.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
        
        try
        {
            Conn c = new Conn();
            String query = "insert into customer values('"+username+"','"+id+"','"+no+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
            c.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"Costomer Details Added Successfully");
            setVisible(false);
        }catch(Exception e)
        {
            e.printStackTrace();
        }


    }

    public static void main(String[] args)
    {
        new AddCustomerDetails("shreya mane");
    }
    
}

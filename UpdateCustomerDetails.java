
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class UpdateCustomerDetails extends JFrame implements ActionListener {
    
    JLabel labelusername,labelname;
    JTextField tfno,tfcountry,tfaddress,tfphone,tfemail,tfid,tfgender;
    
    
    UpdateCustomerDetails(String username)
    {

        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel head = new JLabel("UPDATE CUSTOMER DETAILS");
        head.setForeground(Color.BLACK);
        head.setFont(new Font("Tahoma",Font.BOLD,20));
        head.setBounds(270, 10, 300, 25);
        add(head);
        
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
        
        tfid = new JTextField();
        tfid.setBounds(220, 90, 200, 25);
        add(tfid);
        
        
        JLabel lblno = new JLabel("Number");
        lblno.setForeground(Color.BLACK);
        lblno.setFont(new Font("Tahoma",Font.PLAIN,16));
        lblno.setBounds(30, 130, 150, 25);
        add(lblno);
        
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
        
        tfgender = new JTextField();
        tfgender.setBounds(220, 210, 200, 25);
        add(tfgender);
                
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
        
        JButton update = new JButton("Update");
        update.setBounds(100, 440, 100, 25);
        update.addActionListener(this);
        add(update);
        
         
        JButton back = new JButton("Back");
        back.setBounds(250, 440, 100, 25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(420, 80, 400, 400);
        add(image);
        
        try
        {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfno.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
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
        String id = tfid.getText();
        String number = tfno.getText();
        String name = labelname.getText();
        String gender = tfgender.getText();
        String country = tfcountry.getText();
        String address = tfaddress.getText();
        String phone = tfphone.getText();
        String email = tfemail.getText();
 
        try
        {
            Conn c = new Conn();
            String query = "update customer set username = '"+username+"',id = '"+id+"',number = '"+number+"',name = '"+name+"',gender = '"+gender+"',country = '"+country+"',address = '"+address+"',phone = '"+phone+"',email = '"+email+"'";
            c.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null,"Costomer Details Updated Successfully");
            setVisible(false);
        }catch(Exception e)
        {
            e.printStackTrace();
        }


    }

    public static void main(String[] args)
    {
        new UpdateCustomerDetails("Shreya");
    }
    
}

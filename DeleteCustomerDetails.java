
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class DeleteCustomerDetails extends JFrame implements ActionListener{
    
    String username;
    
    DeleteCustomerDetails(String username)
    {
        
        this.username = username;
        
        JButton del;
        
        setBounds(350,180,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 40, 150, 50);
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 40, 150, 50);
        add(labelusername);
        
        JLabel lblid = new JLabel("ID");
        lblid.setBounds(30, 100, 150, 50);
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220, 100, 150, 50);
        add(labelid);
        
        JLabel lblno= new JLabel("Number");
        lblno.setBounds(30, 160, 150, 50);
        add(lblno);
        
        JLabel labelno = new JLabel();
        labelno.setBounds(220, 160, 150, 50);
        add(labelno);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 220, 150, 50);
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(220, 220, 150, 50);
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30, 280, 150, 50);
        add(lblgender);
        
        JLabel labelgender = new JLabel();
        labelgender.setBounds(220, 280, 150, 50);
        add(labelgender);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setBounds(480, 40, 150, 50);
        add(lblcountry);
        
        JLabel labelcountry = new JLabel();
        labelcountry.setBounds(690, 40, 150, 50);
        add(labelcountry);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(480, 100, 150, 50);
        add(lbladdress);
        
        JLabel labeladdress = new JLabel();
        labeladdress.setBounds(690, 100, 150, 50);
        add(labeladdress);
        
        JLabel lblphone = new JLabel("Contact No.");
        lblphone.setBounds(480, 160, 150, 50);
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(690, 160, 150, 50);
        add(labelphone);
        
        
       JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(480, 220, 150, 50);
        add(lblemail);
        
        JLabel labelemail = new JLabel();
        labelemail.setBounds(690, 220, 150, 50);
        add(labelemail);
         
        del = new JButton("Delete");
        del.setBounds(300, 360, 100, 30);
        del.addActionListener(this);
        add(del);
     
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(20,400,600,200);
        add(Image);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 200,Image.getHorizontalAlignment());
        ImageIcon i6 = new ImageIcon(i5);
        JLabel Image2 = new JLabel(i6);
        Image2.setBounds(600,400,600,200);
        add(Image2);
        
        try
        {
            Conn conn = new Conn();
            String query = "select * from customer where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelno.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        setVisible(true);
                
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            Conn c = new Conn();
            c.s.executeUpdate("delete from account where username = '"+username+"'");
            c.s.executeUpdate("delete from customer where username = '"+username+"'");
            c.s.executeUpdate("delete from bookpackages where username = '"+username+"'");
            c.s.executeUpdate("delete from hotel where username = '"+username+"'");
            c.s.executeUpdate("delete from bookhotels where username = '"+username+"'");
            
            JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
            setVisible(false);
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
        new DeleteCustomerDetails("Shreya");
    }
    
}

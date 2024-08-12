
package tourism.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;  



public class ViewBookedPackage extends JFrame implements ActionListener  {

    
    String username; 
    ViewBookedPackage(String username )
    {
        this.username = username;
        JButton back;
        
        setBounds(350,180,870,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       JLabel head = new JLabel("VIEW BOOKED PACKAGE");
       head.setBounds(280, 20, 600, 40);
       head.setForeground(Color.BLACK);
       head.setFont(new Font("Times New Roman",Font.ITALIC,30));
       add(head);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 60, 150, 80);
        lblusername.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 75, 150, 50);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelusername);
        
        JLabel lblsp = new JLabel("Package Booked");
        lblsp.setBounds(30, 120, 180, 50);
        lblsp.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblsp);
        
        JLabel labelsp = new JLabel();
        labelsp.setBounds(220, 120, 150, 50);
        labelsp.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelsp);
        
        JLabel lbltp= new JLabel("Total People");
        lbltp.setBounds(30, 170, 150, 50);
        lbltp.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lbltp);
        
        JLabel labeltp = new JLabel();
        labeltp.setBounds(220, 170, 150, 50);
        add(labeltp);
        
        JLabel lblid = new JLabel("ID Proof");
        lblid.setBounds(30, 220, 150, 50);
        lblid.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220, 220, 150, 50);
        add(labelid);
        
        JLabel lblno = new JLabel("Number");
        lblno.setBounds(30, 270, 150, 50);
        lblno.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblno);
        
        JLabel labelno = new JLabel();
        labelno.setBounds(220, 270, 150, 50);
        add(labelno);
        
        JLabel lblphone = new JLabel("Contact No");
        lblphone.setBounds(30, 320, 150, 50);
        lblphone.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220, 320, 150, 50);
        add(labelphone);
        
        
        JLabel lblcost = new JLabel("Total Price");
        lblcost.setBounds(30, 370, 150, 50);
        lblcost.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblcost);
        
        JLabel labelcost = new JLabel();
        labelcost.setBounds(220, 370, 150, 50);
        add(labelcost);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(400, 85, 500, 500);
        add(Image);
        
 
         
        back = new JButton("Back");
        back.setBounds(160, 470, 100, 30);
        back.addActionListener(this);
        add(back);
     
       
        
        try
        {
            Conn conn = new Conn();
            String query = "select * from bookpackages where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelsp.setText(rs.getString("sp"));
                labeltp.setText(rs.getString("tp"));
                labelid.setText(rs.getString("id"));
                labelno.setText(rs.getString("no"));
                labelcost.setText(rs.getString("cost"));
                labelphone.setText(rs.getString("phone"));
                
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        setVisible(true);
                
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
    }
    
    
    public static void main(String[] args)
    {
        new ViewBookedPackage("Shreya");
    }
}

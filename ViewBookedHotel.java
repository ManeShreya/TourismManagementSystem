
package tourism.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;  



public class ViewBookedHotel extends JFrame implements ActionListener  {

    
    
    ViewBookedHotel(String username )
    {
       
        JButton back;
        
        setBounds(350,180,1000,625);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       JLabel head = new JLabel("VIEW BOOKED HOTEL");
       head.setBounds(280, 20, 600, 40);
       head.setForeground(Color.BLACK);
       head.setFont(new Font("Times New Roman",Font.ITALIC,30));
       add(head);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 60, 150, 80);
        lblusername.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblusername);
        
        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 80, 150, 50);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(labelusername);
        
        JLabel lblhn = new JLabel("Hotel Name");
        lblhn.setBounds(30, 120, 180, 50);
        lblhn.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblhn);
        
        JLabel labelhn = new JLabel();
        labelhn.setBounds(220, 120, 300, 50);
        labelhn.setFont(new Font("Tahoma",Font.PLAIN,18));
       
        add(labelhn);
        
        JLabel lbltp= new JLabel("Total People");
        lbltp.setBounds(30, 170, 150, 50);
        lbltp.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lbltp);
        
        JLabel labeltp = new JLabel();
        labeltp.setBounds(220, 180, 150, 50);
        add(labeltp);
        
        JLabel lbltd= new JLabel("Total Days");
        lbltd.setBounds(30, 210, 150, 50);
        lbltd.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lbltd);
        
        JLabel labeltd = new JLabel();
        labeltd.setBounds(220, 210, 150, 50);
        add(labeltd);
        
        JLabel lblac= new JLabel("AC Included ");
        lblac.setBounds(30, 250, 150, 50);
        lblac.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblac);
        
        JLabel labelac = new JLabel();
        labelac.setBounds(220, 250, 150, 50);
        add(labelac);
        
       JLabel lblfood= new JLabel("Food Included ");
        lblfood.setBounds(30, 290, 150, 50);
        lblfood.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblfood);
        
        JLabel labelfood = new JLabel();
        labelfood.setBounds(220, 290, 150, 50);
        add(labelfood);
        
        
        JLabel lblid = new JLabel("ID Proof");
        lblid.setBounds(30, 330, 150, 50);
        lblid.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblid);
        
        JLabel labelid = new JLabel();
        labelid.setBounds(220, 330, 150, 50);
        add(labelid);
        
        JLabel lblno = new JLabel("Number");
        lblno.setBounds(30, 370, 150, 50);
        lblno.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblno);
        
        JLabel labelno = new JLabel();
        labelno.setBounds(220, 370, 150, 50);
        add(labelno);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30, 410, 150, 50);
        lblname.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblname);
        
        JLabel labelname = new JLabel();
        labelname.setBounds(220, 410, 150, 50);
        add(labelname);
        
        JLabel lblphone = new JLabel("Contact No");
        lblphone.setBounds(30, 450, 150, 50);
        lblphone.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblphone);
        
        JLabel labelphone = new JLabel();
        labelphone.setBounds(220, 450, 150, 50);
        add(labelphone);
        
        
        JLabel lblcost = new JLabel("Total Price");
        lblcost.setBounds(30, 490, 150, 50);
        lblcost.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
        add(lblcost);
        
        JLabel labelcost = new JLabel();
        labelcost.setBounds(220, 490, 150, 50);
        add(labelcost);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(500, 85, 500, 500);
        add(Image);
        
 
         
        back = new JButton("Back");
        back.setBounds(160, 540, 100, 30);
        back.addActionListener(this);
        add(back);
     
       
        
        try
        {
            Conn conn = new Conn();
            String query = "select * from bookhotels where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next())
            {
                labelusername.setText(rs.getString("username"));
                labelhn.setText(rs.getString("name"));
                labeltp.setText(rs.getString("people"));
                labeltd.setText(rs.getString("days"));
                labelac.setText(rs.getString("ac"));
                labelfood.setText(rs.getString("food"));
                labelid.setText(rs.getString("id"));
                labelno.setText(rs.getString("no"));
                labelname.setText(rs.getString("name1"));
                labelphone.setText(rs.getString("phone"));
                labelcost.setText(rs.getString("cost"));
                
                
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
        new ViewBookedHotel("shreya mane");
    }
}

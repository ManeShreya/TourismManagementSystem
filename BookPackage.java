package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class BookPackage extends JFrame implements ActionListener{
    
    JComboBox combosp;
    JTextField tftp;
    JLabel labelcost,labelusername,labelid,labelname,labelphone,labelno;
    JButton checkprice,bookpackage,back;
    String username;
    BookPackage(String username)
    {
        
        this.username = username;
        
        setBounds(300,150,1000,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
       JLabel head = new JLabel("BOOK PACKAGE");
       head.setBounds(350, 20, 600, 40);
       head.setForeground(Color.BLACK);
       head.setFont(new Font("Times New Roman",Font.ITALIC,40));
       add(head);
    
       
       JLabel lblusername = new JLabel("Username");
       lblusername.setBounds(20, 80, 500, 40);
       lblusername.setForeground(Color.BLACK);
       lblusername.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblusername);
       
       labelusername = new JLabel();
       labelusername.setBounds(200, 80, 200, 30);
       labelusername.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelusername);
       
       JLabel lblsp = new JLabel("Select Package");
       lblsp.setBounds(20, 140, 500, 40);
       lblsp.setForeground(Color.BLACK);
       lblsp.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblsp);
       
       
       combosp = new JComboBox(new String [] {"GOLD PACKAGE","SILVER PACKAGE","BRONZE PACKAGE"});
       combosp.setBounds(200, 140, 200, 30);
       combosp.setBackground(Color.WHITE);
       add(combosp);
       
       JLabel lbltp = new JLabel("Total People");
       lbltp.setBounds(20, 200, 500, 40);
       lbltp.setForeground(Color.BLACK);
       lbltp.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lbltp);
       
       tftp = new JTextField();
       tftp.setBounds(200, 210, 200, 30);
       add(tftp);
       
       JLabel lblid = new JLabel("ID");
       lblid.setBounds(20, 260, 500, 40);
       lblid.setForeground(Color.BLACK);
       lblid.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblid);
     
       
       labelid = new JLabel();
       labelid.setBounds(200, 260, 200, 30);
       labelid.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelid);
       
       JLabel lblno = new JLabel("Number");
       lblno.setBounds(20, 320, 500, 40);
       lblno.setForeground(Color.BLACK);
       lblno.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblno);
     
       
       labelno = new JLabel();
       labelno.setBounds(200, 320, 200, 30);
       labelno.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelno);

       
       JLabel lblname = new JLabel("Name");
       lblname.setBounds(20, 380, 500, 40);
       lblname.setForeground(Color.BLACK);
       lblname.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblname);
       
       labelname = new JLabel();
       labelname.setBounds(200, 380, 200, 30);
       labelname.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelname);

       
       JLabel lblphone = new JLabel("Contact No.");
       lblphone.setBounds(20, 440, 500, 40);
       lblphone.setForeground(Color.BLACK);
       lblphone.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblphone);
       
       labelphone = new JLabel();
       labelphone.setBounds(200, 440, 200, 30);
       labelphone.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelphone);

       JLabel lblcost = new JLabel("Total Price");
       lblcost.setBounds(20, 500, 500, 40);
       lblcost.setForeground(Color.BLACK);
       lblcost.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblcost);
       
       labelcost = new JLabel();
       labelcost.setBounds(200, 500, 200, 30);
       labelcost.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelcost);
       
       checkprice = new JButton("Check Price");
       checkprice.setBounds(200, 530, 120, 30);
       checkprice.addActionListener(this);
       add(checkprice);
       
              
       bookpackage = new JButton("Book Package");
       bookpackage.setBounds(350, 530, 120, 30);
       bookpackage.addActionListener(this);
       add(bookpackage);
       
       back = new JButton("Back");
       back.setBounds(500, 530, 120, 30);
       back.addActionListener(this);
       add(back);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
       Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel Image = new JLabel(i3);
       Image.setBounds(500, 80, 500, 400);
       add(Image);
       

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
        if(ae.getSource() == checkprice)
        {
           String pack = (String)combosp.getSelectedItem();
           int cost = 0;
           if(pack.equals("GOLD PACKAGE"))
           {
               cost +=16000;
           }
           else if(pack.equals("SILVER PACKAGE"))
           {
               cost +=12000;
           }
           else
           {
               cost +=9000;
           }
           int tp = Integer.parseInt(tftp.getText());
           cost *= tp;
           labelcost.setText("Rs" +cost);
   
        }
        else if(ae.getSource() == bookpackage)
        {
            try
            {
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookpackages values ('"+labelusername.getText()+"','"+combosp.getSelectedItem()+"','"+tftp.getText()+"','"+labelid.getText()+"','"+labelno.getText()+"','"+labelname.getText()+"','"+labelphone.getText()+"','"+labelcost.getText()+"')");
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else
        {
           setVisible(false);
            }
    
 
    }


    
    public static void main(String[] args)
    {
       new BookPackage("Shreya"); 
    }
    
}

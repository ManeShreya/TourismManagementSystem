package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class BookHotel extends JFrame implements ActionListener{
    
    JComboBox combosh,comboac,combofi;
    JTextField tftp,tfnd;
    JLabel labelcost,labelusername,labelid,labelname,labelphone,labelno;
    JButton checkprice,bookpackage,back;
    String username;
    BookHotel(String username)
    {
        
        this.username = username;
        
        setBounds(300,120,1000,800);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
       JLabel head = new JLabel("BOOK HOTEL");
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
       
       JLabel lblsp = new JLabel("Select Hotel");
       lblsp.setBounds(20, 140, 500, 40);
       lblsp.setForeground(Color.BLACK);
       lblsp.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblsp);
       
       
       combosh = new JComboBox(new String [] {"JW Marriot Hotel","Madarin Oriental Hotel","Four Seasons Hotel","Raddisson Blue Hotel","Classio hotel","The Bay Club Hotel","Brezze Blow Hotel","The Taj Hotel","Happy Morning Motel","River View Hotel"});
       combosh.setBounds(200, 140, 200, 30);
       combosh.setBackground(Color.WHITE);
       add(combosh);
       
       try
       {
           Conn c = new Conn();
           ResultSet rs = c.s.executeQuery("select * from hotel");
           while(rs.next())
           {
               combosh.addItem(rs.getString("name"));
           }
           
       }catch(Exception e)
       {
           e.printStackTrace();
       }
       
       JLabel lbltp = new JLabel("Total People");
       lbltp.setBounds(20, 200, 500, 40);
       lbltp.setForeground(Color.BLACK);
       lbltp.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lbltp);
       
       tftp = new JTextField();
       tftp.setBounds(200, 200, 200, 30);
       add(tftp);
       
       JLabel lblnd = new JLabel("No of Days");
       lblnd.setBounds(20, 260, 500, 40);
       lblnd.setForeground(Color.BLACK);
       lblnd.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblnd);
       
       tfnd = new JTextField();
       tfnd.setBounds(200, 260, 200, 30);
       add(tfnd);
       
       JLabel lblac = new JLabel("AC/NON-AC");
       lblac.setBounds(20, 320, 500, 40);
       lblac.setForeground(Color.BLACK);
       lblac.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblac);
       
       
       comboac = new JComboBox(new String [] {"YES","NO"});
       comboac.setBounds(200, 320, 200, 30);
       comboac.setBackground(Color.WHITE);
       add(comboac);
       
       JLabel lblfi = new JLabel("Food Included");
       lblfi.setBounds(20, 380, 500, 40);
       lblfi.setForeground(Color.BLACK);
       lblfi.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblfi);
       
       
       combofi = new JComboBox(new String [] {"YES","NO"});
       combofi.setBounds(200, 380, 200, 30);
       combofi.setBackground(Color.WHITE);
       add(combofi);
       
       
       
       JLabel lblid = new JLabel("ID");
       lblid.setBounds(20, 440, 500, 40);
       lblid.setForeground(Color.BLACK);
       lblid.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblid);
     
       
       labelid = new JLabel();
       labelid.setBounds(200, 440, 200, 30);
       labelid.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelid);
       
       JLabel lblno = new JLabel("Number");
       lblno.setBounds(20, 500, 500, 40);
       lblno.setForeground(Color.BLACK);
       lblno.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblno);
     
       
       labelno = new JLabel();
       labelno.setBounds(200, 500, 200, 30);
       labelno.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelno);

       
       JLabel lblname = new JLabel("Name");
       lblname.setBounds(20, 560, 500, 40);
       lblname.setForeground(Color.BLACK);
       lblname.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblname);
       
       labelname = new JLabel();
       labelname.setBounds(200, 560, 200, 30);
       labelname.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelname);

       
       JLabel lblphone = new JLabel("Contact No.");
       lblphone.setBounds(20, 620, 500, 40);
       lblphone.setForeground(Color.BLACK);
       lblphone.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblphone);
       
       labelphone = new JLabel();
       labelphone.setBounds(200, 620, 200, 30);
       labelphone.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelphone);

       JLabel lblcost = new JLabel("Total Price");
       lblcost.setBounds(20, 680, 500, 40);
       lblcost.setForeground(Color.BLACK);
       lblcost.setFont(new Font("Segoe UI Mono",Font.ITALIC,20));
       add(lblcost);
       
       labelcost = new JLabel();
       labelcost.setBounds(200, 680, 200, 30);
       labelcost.setFont(new Font("Tahoma",Font.PLAIN,18));
       add(labelcost);
       
       checkprice = new JButton("Check Price");
       checkprice.setBounds(200, 720, 120, 30);
       checkprice.addActionListener(this);
       add(checkprice);
       
              
       bookpackage = new JButton("Book Hotel");
       bookpackage.setBounds(350, 720, 120, 30);
       bookpackage.addActionListener(this);
       add(bookpackage);
       
       back = new JButton("Back");
       back.setBounds(500, 720, 120, 30);
       back.addActionListener(this);
       add(back);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
       Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel Image = new JLabel(i3);
       Image.setBounds(500, 80, 500, 500);
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
           try
           {
               Conn c = new Conn();
               ResultSet rs = c.s.executeQuery("select * from hotel where name = '"+combosh.getSelectedItem()+"'");
               while(rs.next())
               {
                   int cost = Integer.parseInt(rs.getString("costperperson"));
                   int ac = Integer.parseInt(rs.getString("acroom"));
                   int food = Integer.parseInt(rs.getString("foodincluded"));
                   
                   int people = Integer.parseInt(tftp.getText());
                   int days = Integer.parseInt(tfnd.getText());
                  
                   String acselected = (String)comboac.getSelectedItem();
                   String foodselected = (String)combofi.getSelectedItem();
                   if(people * days >0)
                   {
                       int total = 0;
                       total += acselected.equals("YES")? ac : 0;
                       total += foodselected.equals("YES")? food : 0;
                       total += cost;
                       total = total*people*days;
                       labelcost.setText(" Rs " + total);
                       
                   }else
                   {
                       JOptionPane.showMessageDialog(null,"Please Enter Valid Numbers");
                   }
               }
                 
           }catch(Exception e)
           {
               e.printStackTrace();
           }
   
        }
        else if(ae.getSource() == bookpackage)
        {
            try
            {
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotels values ('"+labelusername.getText()+"','"+combosh.getSelectedItem()+"','"+tftp.getText()+"','"+tfnd.getText()+"','"+comboac.getSelectedItem()+"','"+combofi.getSelectedItem()+"','"+labelid.getText()+"','"+labelno.getText()+"','"+labelname.getText()+"','"+labelphone.getText()+"','"+labelcost.getText()+"')");
                JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
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
       new BookHotel("shreya mane"); 
    }
    
}

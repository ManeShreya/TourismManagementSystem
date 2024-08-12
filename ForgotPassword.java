package tourism.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgotPassword extends JFrame implements ActionListener{
    
    JTextField tfusername,tfname,tfsecurity,tfanswer,tfpassword;
    JButton search,retrieve,back;
    
    ForgotPassword()
    {
        setBounds(350,200,900,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 30, 500, 280);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(600, 80, 200, 200);
        add(image);
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(20, 30, 150, 25); 
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(160, 30, 200, 30);
        p1.add(tfusername);
        
        search = new JButton("Search");
        search.setBounds(390, 30, 100, 25);
        search.addActionListener(this);
        p1.add(search);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(20, 80, 150, 25); 
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(160, 80, 200, 30);
        p1.add(tfname);
        
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setBounds(20, 120, 150, 25); 
        lblsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblsecurity);
        
        tfsecurity = new JTextField();
        tfsecurity.setBounds(160, 120, 200, 30);
        p1.add(tfsecurity);
        
         
        JLabel lblanswer= new JLabel("Answer");
        lblanswer.setBounds(20, 160, 150, 25); 
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblanswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(160, 160, 200, 30);
        p1.add(tfanswer);
        
        retrieve = new JButton("Retrieve");
        retrieve.setBounds(390, 160, 100, 25);
        retrieve.addActionListener(this);
        p1.add(retrieve);
        
        JLabel lblpassword= new JLabel("Your Password is");
        lblpassword.setBounds(20, 195, 150, 25); 
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblpassword);
        
        tfpassword= new JTextField();
        tfpassword.setBounds(160, 195, 200, 30);
        p1.add(tfpassword);
        
        back = new JButton("Back");
        back.setBounds(135, 235, 100, 25);
        back.addActionListener(this);
        p1.add(back);
        
        
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == search)
        {
         try
         {
             String query = "select * from account where username = '"+tfusername.getText()+"'";
             Conn c = new Conn();
             
             ResultSet rs = c.s.executeQuery(query);
             while(rs.next())
             {
                 tfname.setText(rs.getString("name"));
                 tfsecurity.setText(rs.getString("security"));
             }
         }catch(Exception e){
             e.printStackTrace();
         }
        }
        else if(ae.getSource() == retrieve)
        {
            try{
            String query = "select * from account where answer = '"+tfanswer.getText()+"'AND username ='"+tfusername.getText()+"'";
             Conn c = new Conn();
             
             ResultSet rs = c.s.executeQuery(query);
             while(rs.next())
             {
                 tfpassword.setText(rs.getString("password"));
                 
             }
            
        }catch (Exception e){
                     e.printStackTrace();
                     }
        }
        else
        {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args)
    {
       new ForgotPassword();
    }
    
}
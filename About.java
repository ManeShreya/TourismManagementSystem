
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class About extends JFrame implements ActionListener {
    
    About()
    {
        JButton back;
     
        setBounds(400,150,700,600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel head = new JLabel("ABOUT US");
        head.setBounds(280, 30, 300, 25);
        head.setFont(new Font("Times New Roman",Font.ITALIC,30));
        add(head);
        
        String s = "About Project                \n"+
                "\n"+
                "The Objective of the Travel and Tourism Management System project is to develop a system that automates the processes and activities of a travel and the purpose is to design a system using which one can perform all operation related to traveling\n"+
                "\n"+
                "This application will help in accessing the information related to the travel to the particular destination with great ease.The users can track the information  related to their tour with great ease through this appliction . The travel agency information can also be obtained through this application \n"+
                "\n"+
                "Advantages of Project\n"+
                "Gives accurate information\n"+
                
                "Simplifies the manual work\n"+
                "It minimizes the documentation realted work\n"+
                "Provides up to date information\n"+
                "Friendly Environment by providing warning messages\n"+
                "Travelers Details can be provided\n"+
                "Booking Confirmation notification";
                
        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 650, 300);
        add(area);
        
       back = new JButton("Back");
       back.setBounds(300, 450, 100, 30);
       back.addActionListener(this);
       add(back);
       
        
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
    }
    
    public static void main(String[] args)
    {
        new About();
        
    }
        
    
}

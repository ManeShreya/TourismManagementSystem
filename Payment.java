
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Payment extends JFrame implements ActionListener{
    JButton back,pay;
    Payment()
    {
       setBounds(350,150,800,600);
       setLayout(null);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
       Image i2 = i1.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel Image = new JLabel(i3);
       Image.setBounds(0, 0, 800, 600);
       add(Image);
       
       pay = new JButton("Pay");
       pay.setBounds(50, 30, 100, 30);
       pay.addActionListener(this);
       Image.add(pay);
       
       back = new JButton("Back");
       back.setBounds(590, 30, 100, 30);
       back.addActionListener(this);
       Image.add(back);
       
       
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == pay)
        {
            new paytm();
        }
        else
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Payment();
    }
}

 
package tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashBoard extends JFrame implements ActionListener{
    String username;
    JButton pd,vpd,upd,cp,bp,vp,vh,d,bh,vbh,p,c,n,a,dpd;
    DashBoard(String username)
            
    {
        this.username = username;
        setBounds(0,0,1600,1000);
        //or......if u dont know the full screen size..setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
       
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Icon = new JLabel(i3);
        Icon.setBounds(5, 0, 70, 70);
        p1.add(Icon);
        
        JLabel heading = new JLabel("DashBoard");
        heading.setBounds(80, 20, 600, 35);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 65,300, 900);
        add(p2);
        
        pd = new JButton("ADD PERSONAL  DETAILS");
        pd.setBounds(0, 0, 300, 50);
        pd.setBackground(new Color(0,0,102));
        pd.setForeground(Color.WHITE);
        pd.setFont(new Font("Tahoma",Font.PLAIN,20));
        pd.setMargin(new Insets(0,10,0,10));
        pd.addActionListener(this);
        p2.add(pd);
        
        upd = new JButton("UPDATE PERSONAL  DETAILS");
        upd.setBounds(0, 50,300, 50);
        upd.setBackground(new Color(0,0,102));
        upd.setForeground(Color.WHITE);
        upd.setFont(new Font("Tahoma",Font.PLAIN,20));
        upd.setMargin(new Insets(0,10,0,10));
        upd.addActionListener(this);
        p2.add(upd);
        
        vpd = new JButton("VIEW PERSONAL  DETAILS");
        vpd.setBounds(0, 100, 300, 50);
        vpd.setBackground(new Color(0,0,102));
        vpd.setForeground(Color.WHITE);
        vpd.setFont(new Font("Tahoma",Font.PLAIN,20));
        vpd.setMargin(new Insets(0,10,0,10));
        vpd.addActionListener(this);
        p2.add(vpd);
        
        dpd = new JButton("DELETE PERSONAL  DETAILS");
        dpd.setBounds(0, 150, 300, 50);
        dpd.setBackground(new Color(0,0,102));
        dpd.setForeground(Color.WHITE);
        dpd.setFont(new Font("Tahoma",Font.PLAIN,20));
        dpd.setMargin(new Insets(0,10,0,10));
        dpd.addActionListener(this);
        p2.add(dpd);
        
        cp = new JButton("CHECK PACKAGES");
        cp.setBounds(0, 200, 300, 50);
        cp.setBackground(new Color(0,0,102));
        cp.setForeground(Color.WHITE);
        cp.setFont(new Font("Tahoma",Font.PLAIN,20));
        cp.setMargin(new Insets(0,10,0,10));
        cp.addActionListener(this);
        p2.add(cp);
        
        bp = new JButton("BOOK PACKAGE");
        bp.setBounds(0, 250, 300, 50);
        bp.setBackground(new Color(0,0,102));
        bp.setForeground(Color.WHITE);
        bp.setFont(new Font("Tahoma",Font.PLAIN,20));
        bp.setMargin(new Insets(0,10,0,10));
        bp.addActionListener(this);
        p2.add(bp);
        
        vp = new JButton("VIEW BOOKED PACKAGE");
        vp.setBounds(0, 300, 300, 50);
        vp.setBackground(new Color(0,0,102));
        vp.setForeground(Color.WHITE);
        vp.setFont(new Font("Tahoma",Font.PLAIN,20));
        vp.setMargin(new Insets(0,10,0,10));
        vp.addActionListener(this);
        p2.add(vp);
        
        vh = new JButton("VIEW HOTELS");
        vh.setBounds(0, 350, 300, 50);
        vh.setBackground(new Color(0,0,102));
        vh.setForeground(Color.WHITE);
        vh.setFont(new Font("Tahoma",Font.PLAIN,20));
        vh.setMargin(new Insets(0,10,0,10));
        vh.addActionListener(this);
        p2.add(vh);
        
        bh = new JButton("BOOK HOTEL");
        bh.setBounds(0, 400, 300, 50);
        bh.setBackground(new Color(0,0,102));
        bh.setForeground(Color.WHITE);
        bh.setFont(new Font("Tahoma",Font.PLAIN,20));
        bh.setMargin(new Insets(0,10,0,10));
        bh.addActionListener(this);
        p2.add(bh);
        
        vbh = new JButton("VIEW BOOKED HOTEL");
        vbh.setBounds(0, 450, 300, 50);
        vbh.setBackground(new Color(0,0,102));
        vbh.setForeground(Color.WHITE);
        vbh.setFont(new Font("Tahoma",Font.PLAIN,20));
        vbh.setMargin(new Insets(0,10,0,10));
        vbh.addActionListener(this);
        p2.add(vbh);
        
        d = new JButton("DESTINATIONS");
        d.setBounds(0, 500, 300, 50);
        d.setBackground(new Color(0,0,102));
        d.setForeground(Color.WHITE);
        d.setFont(new Font("Tahoma",Font.PLAIN,20));
        d.setMargin(new Insets(0,10,0,10));
        d.addActionListener(this);
        p2.add(d);
        
        p = new JButton("PAYMENTS");
        p.setBounds(0, 550, 300, 50);
        p.setBackground(new Color(0,0,102));
        p.setForeground(Color.WHITE);
        p.setFont(new Font("Tahoma",Font.PLAIN,20));
        p.setMargin(new Insets(0,10,0,10));
        p.addActionListener(this);
        p2.add(p);
        
        c = new JButton("CALCULATOR");
        c.setBounds(0, 600, 300, 50);
        c.setBackground(new Color(0,0,102));
        c.setForeground(Color.WHITE);
        c.setFont(new Font("Tahoma",Font.PLAIN,20));
        c.setMargin(new Insets(0,10,0,10));
        c.addActionListener(this);
        p2.add(c);
        
        n = new JButton("NOTEPAD");
        n.setBounds(0, 650, 300, 50);
        n.setBackground(new Color(0,0,102));
        n.setForeground(Color.WHITE);
        n.setFont(new Font("Tahoma",Font.PLAIN,20));
        n.setMargin(new Insets(0,10,0,10));
        n.addActionListener(this);
        p2.add(n);
        
        a = new JButton("ABOUT");
        a.setBounds(0, 700, 300, 50);
        a.setBackground(new Color(0,0,102));
        a.setForeground(Color.WHITE);
        a.setFont(new Font("Tahoma",Font.PLAIN,20));
        a.setMargin(new Insets(0,10,0,10));
        a.addActionListener(this);
        p2.add(a);
        
        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text = new JLabel("TOURISM AND MANAGEMENT SYSTEM");
        text.setBounds(400, 70, 1000, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Railway",Font.ITALIC,50));
        image.add(text);
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == pd)
        {
            new AddCustomerDetails(username);
        }
        else if(ae.getSource() == vpd)
        {
            new ViewCustomerDetails(username);
        }
        else if(ae.getSource() == upd)
        {
            new UpdateCustomerDetails(username);
        }
        else if(ae.getSource() == cp)
        {
            new CheckPackage();
        }
        else if(ae.getSource() == bp)
        {
            new BookPackage(username);
        }
         else if(ae.getSource() == vp)
        {
            new ViewBookedPackage(username);
        }
         else if(ae.getSource() == vh)
         {
             new ViewHotels();
         }
        else if(ae.getSource() == d)
         {
             new Destination();
         }
         else if(ae.getSource() == bh)
         {
             new BookHotel(username);
         }
        else if(ae.getSource() == vbh)
         {
             new ViewBookedHotel(username);
         }
        else if(ae.getSource() == p)
         {
             new Payment();
         }
        else if(ae.getSource() == c)
         {
            try{
                
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e)
            {
                e.printStackTrace();
            }
         }
        else if(ae.getSource() == n)
         {
            try{
                
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e)
            {
                e.printStackTrace();
            }
         }
         else if(ae.getSource() == dpd)
         {
             new DeleteCustomerDetails(username);
         }
        else
        {
            new About();
        }
        



    }

public static void main(String[] args)
{
new DashBoard("");
}
}
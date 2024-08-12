
package tourism.management.system;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {
    
    CheckPackage()
    {
       setBounds(320,150,1000,600);
       
       JTabbedPane tab = new JTabbedPane();
       
       JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(Color.WHITE);
       
       tab.addTab("Package1", null, p1);
       add(tab);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/package1.jpg"));
       Image i2 = i1.getImage().getScaledInstance(600, 600,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel Image = new JLabel(i3);
       Image.setBounds(400, 0, 700, 400);
       p1.add(Image);
       
       JLabel l1 = new JLabel("GOLD PACKAGE");
       l1.setBounds(20, 20, 600, 40);
       l1.setForeground(Color.BLACK);
       l1.setFont(new Font("Times New Roman",Font.ITALIC,40));
       p1.add(l1);
       
       JLabel l2 = new JLabel("* 6 Days & 7 Nights");
       l2.setBounds(20, 80, 500, 40);
       l2.setForeground(Color.BLACK);
       l2.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p1.add(l2);
       
       JLabel l3 = new JLabel("* Airport Assistance");
       l3.setBounds(20, 140, 500, 40);
       l3.setForeground(Color.BLACK);
       l3.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p1.add(l3);
       
       JLabel l4 = new JLabel("* HalfDay City Tour");
       l4.setBounds(20, 200, 500, 40);
       l4.setForeground(Color.BLACK);
       l4.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p1.add(l4);
       
       JLabel l5 = new JLabel("* Daily Buffet");
       l5.setBounds(20, 260, 500, 40);
       l5.setForeground(Color.BLACK);
       l5.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p1.add(l5);
       
       JLabel l6 = new JLabel("* 2 Camp Fire Nights");
       l6.setBounds(20, 320, 500, 40);
       l6.setForeground(Color.BLACK);
       l6.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p1.add(l6);
       
       JLabel l7 = new JLabel("* Full Day 3 Island Cruise ");
       l7.setBounds(20, 380, 500, 40);
       l7.setForeground(Color.BLACK);
       l7.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p1.add(l7);
       
       JLabel l8 = new JLabel("* English Speaking Guide");
       l8.setBounds(20, 440, 500, 40);
       l8.setForeground(Color.BLACK);
       l8.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p1.add(l8);
       
       JLabel l9 = new JLabel("BOOK NOW..."
               + " SUMMER SPECIAL!!! ");
       l9.setBounds(480, 400, 550, 40);
       l9.setForeground(Color.RED);
       l9.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p1.add(l9);
       
       JLabel l10 = new JLabel(" 16,000/-");
       l10.setBounds(620,450, 500, 50);
       l10.setForeground(Color.BLACK);
       l10.setFont(new Font("Segoe UI Mono",Font.ITALIC,40));
       p1.add(l10);
       
       
       JPanel p2 = new JPanel();
       p2.setLayout(null);
       p2.setBackground(Color.WHITE);
       
       tab.addTab("Package2", null, p2);
       add(tab);
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/package2.jpg"));
       Image i5 = i4.getImage().getScaledInstance(600, 600,Image.getHorizontalAlignment());
       ImageIcon i6 = new ImageIcon(i5);
       JLabel Image2 = new JLabel(i6);
       Image2.setBounds(400, 0, 700, 400);
       p2.add(Image2);
       
       JLabel l11 = new JLabel("SILVER PACKAGE");
       l11.setBounds(20, 20, 600, 40);
       l11.setForeground(Color.BLACK);
       l11.setFont(new Font("Times New Roman",Font.ITALIC,40));
       p2.add(l11);
       
       JLabel l12 = new JLabel("* 4 Days & 5 Nights");
       l12.setBounds(20, 80, 500, 40);
       l12.setForeground(Color.BLACK);
       l12.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p2.add(l12);
       
       JLabel l13 = new JLabel("* Historic Places Visit");
       l13.setBounds(20, 140, 500, 40);
       l13.setForeground(Color.BLACK);
       l13.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p2.add(l13);
       
       JLabel l14 = new JLabel("* Clubbing");
       l14.setBounds(20, 200, 500, 40);
       l14.setForeground(Color.BLACK);
       l14.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p2.add(l14);
       
       JLabel l15 = new JLabel("* 1 Camp Fire Night");
       l15.setBounds(20, 260, 500, 40);
       l15.setForeground(Color.BLACK);
       l15.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p2.add(l15);
       
       JLabel l16 = new JLabel("* Beaches Day Out");
       l16.setBounds(20, 320, 500, 40);
       l16.setForeground(Color.BLACK);
       l16.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p2.add(l16);
       
       JLabel l17 = new JLabel("* Full Day 1 Island Cruise ");
       l17.setBounds(20, 380, 500, 40);
       l17.setForeground(Color.BLACK);
       l17.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p2.add(l17);
       
       JLabel l18 = new JLabel("* English Speaking Guide");
       l18.setBounds(20, 440, 500, 40);
       l18.setForeground(Color.BLACK);
       l18.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p2.add(l18);
       
       JLabel l19 = new JLabel("BOOK NOW..."
               + " SUMMER SPECIAL!!! ");
       l19.setBounds(480, 400, 550, 40);
       l19.setForeground(Color.RED);
       l19.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p2.add(l19);
       
       JLabel l20 = new JLabel(" 12,000/-");
       l20.setBounds(620,450, 500, 50);
       l20.setForeground(Color.BLACK);
       l20.setFont(new Font("Segoe UI Mono",Font.ITALIC,40));
       p2.add(l20);
       
       
       JPanel p3 = new JPanel();
       p3.setLayout(null);
       p3.setBackground(Color.WHITE);
       
       tab.addTab("Package3", null,p3);
       add(tab);
       
       ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/package3.jpg"));
       Image i8 = i7.getImage().getScaledInstance(600, 600,Image.getHorizontalAlignment());
       ImageIcon i9 = new ImageIcon(i8);
       JLabel Image3 = new JLabel(i9);
       Image3.setBounds(400, 0, 700, 400);
       p3.add(Image3);
       
       JLabel l21 = new JLabel("BRONZE PACKAGE");
       l21.setBounds(20, 20, 600, 40);
       l21.setForeground(Color.BLACK);
       l21.setFont(new Font("Times New Roman",Font.ITALIC,40));
       p3.add(l21);
       
       JLabel l22 = new JLabel("* 2 Days & 3 Nights");
       l22.setBounds(20, 80, 500, 40);
       l22.setForeground(Color.BLACK);
       l22.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p3.add(l22);
       
       JLabel l23 = new JLabel("* Daily Breakfast");
       l23.setBounds(20, 140, 500, 40);
       l23.setForeground(Color.BLACK);
       l23.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p3.add(l23);
       
       JLabel l24 = new JLabel("* Temples Tour");
       l24.setBounds(20, 200, 500, 40);
       l24.setForeground(Color.BLACK);
       l24.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p3.add(l24);
       
       JLabel l25 = new JLabel("* Treaking Experience");
       l25.setBounds(20, 260, 500, 40);
       l25.setForeground(Color.BLACK);
       l25.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p3.add(l25);
       
       JLabel l26 = new JLabel("* 1 Camp Fire Nights");
       l26.setBounds(20, 320, 500, 40);
       l26.setForeground(Color.BLACK);
       l26.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p3.add(l26);
       
       JLabel l27 = new JLabel("* Malls Visit ");
       l27.setBounds(20, 380, 500, 40);
       l27.setForeground(Color.BLACK);
       l27.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p3.add(l27);
       
       JLabel l28 = new JLabel("* English Speaking Guide");
       l28.setBounds(20, 440, 500, 40);
       l28.setForeground(Color.BLACK);
       l28.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p3.add(l28);
       
       JLabel l29 = new JLabel("BOOK NOW..."
               + " SUMMER SPECIAL!!! ");
       l29.setBounds(480, 400, 550, 40);
       l29.setForeground(Color.RED);
       l29.setFont(new Font("Segoe UI Mono",Font.ITALIC,30));
       p3.add(l29);
       
       JLabel l30 = new JLabel(" 9,000/-");
       l30.setBounds(620,450, 500, 50);
       l30.setForeground(Color.BLACK);
       l30.setFont(new Font("Segoe UI Mono",Font.ITALIC,40));
       p3.add(l30);
       
       
       
       setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new CheckPackage();
    }
    
}

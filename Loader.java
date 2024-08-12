
package tourism.management.system;

import javax.swing.*;
import java.awt.*;

public class Loader extends JFrame implements Runnable {
    
    Thread t;
    JProgressBar bar;
    String username;
    public void run()
    {
        try
        {
            for(int i=1 ; i<=101 ; i++)
            {
                int max = bar.getMaximum();
                int value =  bar.getValue();
                
                if(value < max)
                {
                    bar.setValue(bar.getValue()+ 1);
                }
                else
                {
                    setVisible(false);
                    new DashBoard(username);
                }
                Thread.sleep(50);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    Loader(String username)
    {
        this.username = username;
        t = new Thread(this);
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("Tourism Management Application");
        text.setBounds(200, 70, 550, 50);
        text.setFont(new Font("Railway",Font.ITALIC,35));
        text.setForeground(Color.BLUE);
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(320,150,300,30);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading,please wait.....");
        loading.setBounds(380,170, 150, 70);
        add(loading);
        
        JLabel lblusername = new JLabel("Welcome " +username);
        lblusername.setBounds(50, 200, 550, 200);
        lblusername.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,30));
        lblusername.setForeground(Color.RED);
        add(lblusername);
        
        t.start();
        setVisible(true);       
    }
    

public static void main(String[] args)
{
new Loader("");

}
}
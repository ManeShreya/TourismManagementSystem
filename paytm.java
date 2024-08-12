/*
package tourism.management.system;

import javax.swing.*;


public class paytm extends JFrame {
    
    paytm()
    {
        setBounds(350,150,800,600);
        
        JEditorPane pane = new JEditorPane();
        pane.setEditable(false);
        
        try
        {
            pane.setPage("https://paytm.com/rent.paytm");
        }catch(Exception e)
        {
            e.printStackTrace();
            pane.setContentType("text/html");
            pane.setText("<html>Could not load , Error 404</html>");
        }
        
        JScrollPane sp = new JScrollPane(pane);
        getContentPane().add(sp);
         setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new paytm();
    }
    
}
*/
package tourism.management.system;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.*;
import java.awt.event.*;

public class paytm extends JFrame implements ActionListener {
    
    
    paytm()
    {
        setBounds(350,150,800,600);
        
        try {
            Desktop.getDesktop().browse(new URI("https://paytm.com/rent.paytm"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }

       JButton back = new JButton("Back");
       back.setBounds(590, 30, 100, 30);
       back.addActionListener(this);
       add(back);
       
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
    }
    public static void main(String[] args) {
       new paytm();
    }
}


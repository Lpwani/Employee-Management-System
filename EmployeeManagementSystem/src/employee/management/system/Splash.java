
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{    // For making frame we have to use JFrame class which is available in swing package..
    
    Splash(){
        
        
        getContentPane().setBackground(Color.WHITE);     // COLOR is available in awl package...
        // There are some certain layout guidelines provided by swing such as border layout,grid layout,Here we will not use dafult layout type
        // and will create our own layout design...
        setLayout(null);
        
        JLabel heading =new JLabel("Employee Management System");  // Here we have created a component of name heading
        // TO add these heading component we need to use add() function...
        heading.setBounds(80,20,1200,80);    // Bound is used to decide the position of component on window...
                                                            //  3 arg Width decide width of the component and height vice versa...
        heading.setFont(new Font("serif",Font.PLAIN,60));   // first arg:font-family,second arg:font-style,third arg:size...
        heading.setForeground(Color.red);     // We can mention color name in both UpperCase or LowerCase...
        
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,100,810,300);
        add(image);
        
        // Button display
        JButton clickhere = new JButton("Click Here To Continue");
        clickhere.setBounds(270,200,250,50);
        clickhere.setBackground(Color.black);
        clickhere.setForeground(Color.white);
        clickhere.addActionListener(this);
        image.add(clickhere);
                
        
        setSize(920,450);
        setLocation(250,100);       // The default Location from where the windows size appear in left uppermost corner of the screen..
                                        // First argument is distance from left and second one is distant from top
        setVisible(true);
        
        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);    // here the arg is given in milliseconds...
            }
            catch(Exception e){
                
            }
            heading.setVisible(true);
            try{
                Thread.sleep(500);    // here the arg is given in milliseconds...
            }
            catch(Exception e){
                
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[]args){
        new Splash();
    }
}

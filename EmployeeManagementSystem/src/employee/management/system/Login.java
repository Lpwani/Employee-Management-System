
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JTextField tfusername,tfpassword;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,20,100,30);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150,20,150,25);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40,65,100,30);
        add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(150,68,150,25);
        add(tfpassword);
        
        JButton login = new JButton("LOGIN");
       login.setBounds(150,140,150,30);
       login.setBackground(Color.black);
       login.setForeground(Color.white);
       login.addActionListener(this);
        add(login );
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
        
        setSize(650,350);
        setLocation(400,180);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            String UserName = tfusername.getText();
            String Password = tfpassword.getText();
            UserName=UserName.trim();
            
            Conn c = new Conn();
            String query = "select* from login where UserName = '"+UserName+"' and password = '"+Password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){    // we can use while but here we need to accept single token so if...
                new Home();
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid UserName or Password");
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Login();
    }
    
}

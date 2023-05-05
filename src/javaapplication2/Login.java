package javaapplication2;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        super("Login Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(300,20,100,20);
        add(lblusername);
        
        JTextField username=new JTextField();
        username.setBounds(400,20,150,20);
        add(username);
        
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(300,60,100,20);
        add(lblpassword);
        
        JTextField password=new JTextField();
        password.setBounds(400,60,150,20);
        add(password);
        
        JLabel loggininas=new JLabel("Loggin in as");
        loggininas.setBounds(300,100,100,20);
        add(loggininas);
        
        Choice logginin=new Choice();
        logginin.setBounds(400,100,150,20);
        logginin.add("Admin");
        logginin.add("Customer");
        add(logginin);
        
        JButton login=new JButton("Login");
        login.setBounds(330,160,100,20);
        add(login);
        
        JButton cancel=new JButton("Cancel");
        cancel.setBounds(450,160,100,20);
        add(cancel);
        
        JButton signup=new JButton("Signup");
        signup.setBounds(380,200,100,20);
        add(signup);
        
        ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image i8=i7.getImage().getScaledInstance(250,250, Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel image=new JLabel(i9);
        image.setBounds(0,0,250,250);
        add(image);
        
        setSize(640,300);
        setLocation(400,200);
        setVisible(true);
        
        
    }
    
    public static void main(String[] args){
        new Login();
    }
}

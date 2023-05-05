package javaapplication2;

import javax.swing.*;
import javax.swing.border.*; //import subpackage
import java.awt.*;


public class Signup extends JFrame {
    
    Signup(){
        setBounds(450,150,700,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        //creating panel and applying border on it
        JPanel panel = new JPanel();
        panel.setBounds(30,30,650,300);
        panel.setBorder(new TitledBorder(new LineBorder(new Color(173,216,230),2),"Create-Account",TitledBorder.LEADING,TitledBorder.TOP,null,new Color(173,216,230)));
        panel.setBackground(Color.WHITE);
        add(panel);
        
        setVisible(true);
    }
    public static void main(String[] args){
        new Signup();
    }
    
}


package javaapplication2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;



public class NewCustomer extends JFrame implements ActionListener{
    JTextField tfname,tfaddress,tfstate,tfcity,tfemail,tfphone ;
    JButton next,cancel;
    JLabel lblmeter;
    NewCustomer(){
        setSize(650,500);
        setLocation(400,200);
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(null);
        
        
        JLabel heading = new JLabel("New Customer");
        heading.setBounds(245,15,200,25);
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
        add(heading);
        
        JLabel lblname = new JLabel("Customer Name");
        lblname.setBounds(130,80,100,20);
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(290,80,200,20);
        add(tfname);
        
        JLabel lblmeterno = new JLabel("Meter No");
        lblmeterno.setBounds(150,120,100,20);
        add(lblmeterno);
        
        lblmeter = new JLabel("");
        lblmeter.setBounds(290,120,100,20);
        add(lblmeter);
        
        Random ran=new Random();
        long number = ran.nextLong() % 1000000; //no of values u want eg 6 
        lblmeter.setText(""+Math.abs(number));
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(150,160,100,20);
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(290,160,200,20);
        add(tfaddress);
        
        JLabel lblcity= new JLabel("City");
        lblcity.setBounds(150,200,100,20);
        add(lblcity);
        
        tfcity=new JTextField();
        tfcity.setBounds(290,200,200,20);
        add(tfcity);
        
        
        JLabel lblstate = new JLabel("State");
        lblstate.setBounds(150,240,100,20);
        add(lblstate);
        
        tfstate=new JTextField();
        tfstate.setBounds(290,240,200,20);
        add(tfstate);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(150,280,100,20);
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(290,280,200,20);
        add(tfemail);
        
        JLabel lblphone = new JLabel("Phone No");
        lblphone.setBounds(150,320,100,20);
        add(lblphone);
        
        tfphone=new JTextField();
        tfphone.setBounds(290,320,200,20);
        add(tfphone);
        
        next= new JButton("Next");
        next.setBounds(170,390,100,25);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        cancel= new JButton("Cancel");
        cancel.setBounds(300,390,100,25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
       
        
        
        
        
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            String name=tfname.getText();
            String meter=lblmeter.getText();
            String address= tfaddress.getText();
            String city=tfcity.getText();
            String state=tfstate.getText();
            String email=tfemail.getText();
            String phone=tfphone.getText();
            
            
            String query1="Insert into customer values('"+name+"','"+meter+"','"+address+"','"+city+"','"+state+"','"+email+"','"+phone+"')";
            String query2="Insert into login values('"+meter+"','','"+name+"','','')";
            
            try{
                Conn c = new Conn();
                
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Customer details added successfully");
                        
                setVisible(false);
                new Meterinfo(meter);
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == cancel){
            setVisible(false);
            
            new Project();
        }
    }
    public static void main(String[] args){
        new NewCustomer();
    }
    
}

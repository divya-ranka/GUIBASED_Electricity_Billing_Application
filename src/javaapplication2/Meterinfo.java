
package javaapplication2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;



public class Meterinfo extends JFrame implements ActionListener{
    JTextField tfname,tfaddress,tfstate,tfcity,tfemail,tfphone ;
    JButton submit;
    JLabel lblmeter;
    Choice meterlocation,metertype,phasecode,billtype;
    String metern;
    Meterinfo(String metern){
        this.metern=metern;
        setSize(700,500);
        setLocation(400,200);
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(null);
        
        
        JLabel heading = new JLabel("Meter Information");
        heading.setBounds(240,15,300,25);
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
        add(heading);
        
        JLabel lblname = new JLabel("Meter No");
        lblname.setBounds(150,80,100,20);
        add(lblname);
        
        JLabel lblmetern = new JLabel(metern);
        lblmetern.setBounds(290,80,100,20);
        add(lblmetern);
        
        JLabel lblmeterno = new JLabel("Meter Location");
        lblmeterno.setBounds(150,120,100,20);
        add(lblmeterno);
        
        meterlocation = new Choice();
        meterlocation.add("Inside");
        meterlocation.add("Outside");
        meterlocation.setBounds(290,120,200,20);
        add(meterlocation);
       
        
        JLabel lbladdress = new JLabel("Meter Type");
        lbladdress.setBounds(150,160,100,20);
        add(lbladdress);
        
        metertype = new Choice();
        metertype.add("Electric Meter");
        metertype.add("Smart Meter");
        metertype.add("Solar Meter");
        metertype.setBounds(290,160,200,20);
        add(metertype);
        
        
        JLabel lblcitys= new JLabel("Phase Code");
        lblcitys.setBounds(150,200,100,20);
        add(lblcitys);
        
        phasecode = new Choice();
        phasecode.add("11");
        phasecode.add("22");
        phasecode.add("33");
        phasecode.add("44");
        phasecode.setBounds(290,200,200,20);
        add(phasecode);
        
        
        JLabel lblstate = new JLabel("Bill Type");
        lblstate.setBounds(150,240,100,20);
        add(lblstate);
        
        billtype = new Choice();
        billtype.add("Normal");
        billtype.add("Commercial");
        billtype.setBounds(290,240,200,20);
        add(billtype);
        
        JLabel lblemail = new JLabel("Days");
        lblemail.setBounds(150,280,100,20);
        add(lblemail);
        
        JLabel lblemails = new JLabel("30 Days");
        lblemails.setBounds(290,280,100,20);
        add(lblemails);
        
        JLabel lblphone = new JLabel("Note");
        lblphone.setBounds(150,320,100,20);
        add(lblphone);
        
        JLabel lblphones = new JLabel("Bill is calculated for 30 days only (bydefault)");
        lblphones.setBounds(290,320,500,20);
        add(lblphones);
        

        submit= new JButton("Submit");
        submit.setBounds(270,390,100,25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        

        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String meter=metern;
            String location= meterlocation.getSelectedItem();
            String type=metertype.getSelectedItem();
            String code=phasecode.getSelectedItem();
            String btype=billtype.getSelectedItem();
            String days="30";
          
            String query="Insert into meterinfo values('"+meter+"','"+location+"','"+type+"','"+code+"','"+btype+"','"+days+"')";
          
            
            try{
                Conn c = new Conn();
                
                c.s.executeUpdate(query);
               
                
                JOptionPane.showMessageDialog(null, "Meter information added successfully");
                        
                setVisible(false);
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
            
            
        }
    }
    public static void main(String[] args){
        new Meterinfo("");
    }
    
}


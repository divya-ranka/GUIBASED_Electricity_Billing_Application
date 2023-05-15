
package javaapplication2;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;



public class Calculatebill extends JFrame implements ActionListener{
    JTextField tfunits ;
    JButton next,cancel;
    JLabel lblname,Labeladdress;
    Choice meterno,cmonth;
    Calculatebill(){
        setSize(650,500);
        setLocation(400,200);
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(null);
        
        
        JLabel heading = new JLabel("Calculate Electricity Bill");
        heading.setBounds(215,20,300,20);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        add(heading);
        
        JLabel lblmeternumber = new JLabel("Meter No");
        lblmeternumber.setBounds(150,85,100,20);
        add(lblmeternumber);
        
        meterno = new Choice();
        try{
            Conn c =new Conn();
            ResultSet rs=c.s.executeQuery("Select * from customer");
            while(rs.next()){
                meterno.add(rs.getString("meter_no"));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        meterno.setBounds(290,85,200,20);
        add(meterno);
        
        JLabel lblmeterno = new JLabel("Name");
        lblmeterno.setBounds(150,130,100,20);
        add(lblmeterno);
        
        lblname = new JLabel("");
        lblname.setBounds(290,130,100,20);
        add(lblname);
       
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(150,170,100,20);
        add(lbladdress);
        
        Labeladdress=new JLabel();
        Labeladdress.setBounds(290,170,200,20);
        add(Labeladdress);
        
      
        meterno.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent ie){
                try{
                    Conn c=new Conn();
                    ResultSet rs= c.s.executeQuery("select * from customer where meter_no='"+meterno.getSelectedItem()+"'");
                    while(rs.next()){
                        lblname.setText(rs.getString("name"));
                        Labeladdress.setText(rs.getString("address"));
                    }
                }
                catch(Exception ex){
                    ex.printStackTrace();
                }
                
            }
        
        });
           
        
        JLabel lblcity= new JLabel("Units Consumed");
        lblcity.setBounds(150,210,100,20);
        add(lblcity);
        
        tfunits=new JTextField();
        tfunits.setBounds(290,210,200,20);
        add(tfunits);
        
        
        JLabel lblstate = new JLabel("Month");
        lblstate.setBounds(150,250,100,20);
        add(lblstate);
        
        cmonth=new Choice();
        cmonth.setBounds(290,250,200,20);
        cmonth.add("January");
        cmonth.add("February");
        cmonth.add("March");
        cmonth.add("April");
        cmonth.add("May");
        cmonth.add("June");
        cmonth.add("July");
        cmonth.add("August");
        cmonth.add("September");
        cmonth.add("October");
        cmonth.add("November");
        cmonth.add("December");
        add(cmonth);
        
        
        
        next= new JButton("Submit");
        next.setBounds(185,385,100,25);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        cancel= new JButton("Cancel");
        cancel.setBounds(315,385,100,25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
       
        
        
        
        
        setVisible(true);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            String meter=meterno.getSelectedItem();
            String units=tfunits.getText();
            String month=cmonth.getSelectedItem();
            
            int totalbill=0;
            
         
            String query="select * from tax";
            int unit_consumed=Integer.parseInt(units);
            
            try{
                Conn c = new Conn();
                ResultSet rs=c.s.executeQuery(query);
             
                while(rs.next()){
                    totalbill+=unit_consumed*Integer.parseInt(rs.getString("cost_per_unit"));
                    totalbill+=Integer.parseInt(rs.getString("meter_rent"));
                    totalbill+=Integer.parseInt(rs.getString("service_charge"));
                    totalbill+=Integer.parseInt(rs.getString("service_tax"));
                    totalbill+=Integer.parseInt(rs.getString("fixed_tax"));
                 
                
                
                }
            
            }catch(Exception e){
                e.printStackTrace();
            }
            
            String query2="insert into bill values('"+meter+"','"+month+"','"+units+"','"+totalbill+"','Not Paid')";
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Customer Bill Updated Successfully");
                setVisible(false);
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
        new Calculatebill();
    }
    
}


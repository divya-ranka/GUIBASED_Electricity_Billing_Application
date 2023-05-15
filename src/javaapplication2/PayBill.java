
package javaapplication2;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class PayBill extends JFrame implements ActionListener{

    Choice cmonth;
    JButton pay, back;
    String meter;
    PayBill(String meter) {
        this.meter = meter;
        setLayout(null);
        setBounds(300, 150, 650, 580);
        
        JLabel heading = new JLabel("Electicity Bill");
        heading.setFont(new Font("Tahoma", Font.BOLD, 24));
        heading.setBounds(200, 15, 400, 30);
        add(heading);
        
        JLabel lblmeternumber = new JLabel("Meter Number");
        lblmeternumber.setBounds(75, 80, 200, 20);
        add(lblmeternumber);
        
        JLabel meternumber = new JLabel("");
        meternumber.setBounds(340, 80, 200, 20);
        add(meternumber);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(75, 140, 200, 20);
        add(lblname);
        
        JLabel labelname = new JLabel("");
        labelname.setBounds(340, 140, 200, 20);
        add(labelname);
        
        JLabel lblmonth = new JLabel("Month");
        lblmonth.setBounds(75, 200, 200, 20);
        add(lblmonth);
        
        cmonth = new Choice();
        cmonth.setBounds(340, 200, 200, 20);
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
        
        JLabel lblunits = new JLabel("Units");
        lblunits.setBounds(75, 260, 200, 20);
        add(lblunits);
        
        JLabel labelunits = new JLabel("");
        labelunits.setBounds(340, 260, 200, 20);
        add(labelunits);
        
        JLabel lbltotalbill = new JLabel("Total Bill");
        lbltotalbill.setBounds(75, 320, 200, 20);
        add(lbltotalbill);
        
        JLabel labeltotalbill = new JLabel("");
        labeltotalbill.setBounds(340, 320, 200, 20);
        add(labeltotalbill);
        
        JLabel lblstatus = new JLabel("Status");
        lblstatus.setBounds(75, 380, 200, 20);
        add(lblstatus);
        
        JLabel labelstatus = new JLabel("");
        labelstatus.setBounds(340, 380, 200, 20);
        labelstatus.setForeground(Color.RED);
        add(labelstatus);
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where meter_no = '"+meter+"'");
            while(rs.next()) {
                meternumber.setText(meter);
                labelname.setText(rs.getString("name"));
            }
            
            rs = c.s.executeQuery("select * from bill where meter_no = '"+meter+"' AND month = 'January'");//as 1st entry of month is normally January.so can be that
            while(rs.next()) {
                labelunits.setText(rs.getString("units"));
                labeltotalbill.setText(rs.getString("totalbill"));
                labelstatus.setText(rs.getString("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cmonth.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent ae) {
                try {
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from bill where meter_no = '"+meter+"' AND month = '"+cmonth.getSelectedItem()+"'");
                    while(rs.next()) {
                        labelunits.setText(rs.getString("units"));
                        labeltotalbill.setText(rs.getString("totalbill"));
                        labelstatus.setText(rs.getString("status"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        
        pay = new JButton("Pay");
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.WHITE);
        pay.setBounds(140, 470, 100, 25);
        pay.addActionListener(this);
        add(pay);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(300, 470, 100, 25);
        back.addActionListener(this);
        add(back);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == pay) {
            try {
                Conn c = new Conn();
                c.s.executeUpdate("update bill set status = 'Paid' where meter_no = '"+meter+"' AND month='"+cmonth.getSelectedItem()+"'");
            } catch (Exception e) {
                e.printStackTrace();
            }
            setVisible(false);
            new Paytm(meter);
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new PayBill("");
    }
}
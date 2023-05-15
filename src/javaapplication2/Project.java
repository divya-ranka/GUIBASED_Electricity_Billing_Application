
package javaapplication2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    JMenuItem newcustomer,calculatebill;
    String atype,meter;
    Project(String atype,String meter){
        this.atype=atype;
        this.meter=meter;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/homepage.jpg"));
        Image i2=i1.getImage().getScaledInstance(1550,850,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        JMenuBar mb=new JMenuBar();
        setJMenuBar(mb);
        
        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);
        
        
        JMenuItem customerdetails=new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced",Font.PLAIN,12));
        customerdetails.setBackground(Color.WHITE);
        customerdetails.setMnemonic('M');
        customerdetails.addActionListener(this);
        customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        master.add(customerdetails);
        
        newcustomer=new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,12));
        newcustomer.setBackground(Color.WHITE);
        newcustomer.setMnemonic('T');
        newcustomer.addActionListener(this);
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,ActionEvent.CTRL_MASK));
        master.add(newcustomer);
        
        JMenuItem depositdetails=new JMenuItem("Deposit Details");
        depositdetails.setFont(new Font("monospaced",Font.PLAIN,12));
        depositdetails.setBackground(Color.WHITE);
        depositdetails.setMnemonic('D');
        depositdetails.addActionListener(this);
        depositdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        master.add(depositdetails);
        
        calculatebill=new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced",Font.PLAIN,12));
        calculatebill.setBackground(Color.WHITE);
        calculatebill.setMnemonic('L');
        calculatebill.addActionListener(this);
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        master.add(calculatebill);
        
        JMenu info = new JMenu("Information");
        info.setForeground(Color.RED);
        
        
        JMenuItem updateinformation=new JMenuItem("Update Information");
        updateinformation.setFont(new Font("monospaced",Font.PLAIN,12));
        updateinformation.setBackground(Color.WHITE);
        updateinformation.setMnemonic('I');
        updateinformation.addActionListener(this);
        updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,ActionEvent.CTRL_MASK));
        info.add(updateinformation);
        
        JMenuItem viewinformation=new JMenuItem("View Information");
        viewinformation.setFont(new Font("monospaced",Font.PLAIN,12));
        viewinformation.setBackground(Color.WHITE);
        viewinformation.setMnemonic('V');
        viewinformation.addActionListener(this);
        viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
        info.add(viewinformation);
        
        JMenu user = new JMenu("User");
        user.setForeground(Color.BLUE);
        
        
        JMenuItem paybill=new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced",Font.PLAIN,12));
        paybill.setBackground(Color.WHITE);
        paybill.setMnemonic('P');
        paybill.addActionListener(this);
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        user.add(paybill);
        
        JMenuItem billdetails=new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced",Font.PLAIN,12));
        billdetails.setBackground(Color.WHITE);
        billdetails.setMnemonic('B');
        billdetails.addActionListener(this);
        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        user.add(billdetails);
        
        JMenu report = new JMenu("Report");
        report.setForeground(Color.RED);
        
        
        JMenuItem generatebill=new JMenuItem("Generate Bill");
        generatebill.setFont(new Font("monospaced",Font.PLAIN,12));
        generatebill.setBackground(Color.WHITE);
        generatebill.setMnemonic('G');
        generatebill.addActionListener(this);
        generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
        report.add(generatebill);
        
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        
        
        JMenuItem notepad=new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,12));
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        notepad.setMnemonic('N');
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        utility.add(notepad);
        
        JMenuItem calculator=new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced",Font.PLAIN,12));
        calculator.setBackground(Color.WHITE);
        calculator.setMnemonic('C');
        calculator.addActionListener(this);
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        utility.add(calculator); 
        
        JMenu mexit = new JMenu("Exit");
        mexit.setForeground(Color.RED);
        
        
        JMenuItem exit=new JMenuItem("Exit");
        exit.setFont(new Font("monospaced",Font.PLAIN,12));
        exit.setBackground(Color.WHITE);
        exit.setMnemonic('W');
        exit.addActionListener(this);
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
        mexit.add(exit);
        
        if(atype.equals("Admin")){
            mb.add(master);
        }
        else{
           
            mb.add(info);
            mb.add(user);
            mb.add(report);
            
        }
        
        mb.add(utility);
        mb.add(mexit);
            
        setLayout(new FlowLayout());
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if (msg.equals("New Customer")) {
            new NewCustomer();
            
        }
        else if(msg.equals("Customer Details")) {
            new customerDetails();
            
        }
        else if(msg.equals("Deposit Details")){
            new DepositDetails();
        }
        else if(msg.equals("Calculate Bill")){
            new Calculatebill();
        }
        else if(msg.equals("View Information")){
            new ViewInformation(meter);
        }
        else if(msg.equals("Update Information")){
            new UpdateInformation(meter);
        }
        else if(msg.equals("Bill Details")){
            new BillDetails(meter);
        }
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception ex){
                ex.printStackTrace();
                
            }
            
        }
        
        else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception ex){
                ex.printStackTrace();
                
            }
        }
        else if(msg.equals("Exit")){
            setVisible(false);
            new Login();
        }
        else if(msg.equals("Pay Bill")){
            new PayBill(meter);
        }
        else if(msg.equals("Generate Bill")){
            new GenerateBill(meter);
        }
        
    }
        
        

    public static void main(String[] args){
        new Project("","");
    }
}

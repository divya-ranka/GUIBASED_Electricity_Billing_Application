package javaapplication2;
import javax.swing.*; //swing is from java's extended package
import java.awt.*;
public class Splash extends JFrame implements Runnable{
    Thread t;//declaring thread object
    
    //insering image of elect.jpg
    //constructor of object
    Splash(){
        //to insert image onto frame-ImageIcon class
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/elec_t.jpg")); //creating object
        
        //scaling image
        Image i2= i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        
        //displaying image onto frame
        JLabel image=new JLabel(i3);
        add(image);
        
        //Since frame visibility is hidden as bydefault->therefore setVisible() function
        setVisible(true); //to show hidden visibility of frame
        
        

        int x=1;
        for(int i=2;i<600;i+=4,x+=1){
            //making frame- by swing package and swing has class called Jframe,therefore "extends JFrame"
            //setSize() function of JFrame for creating frame
            setSize(i+x,i); //l and w of box frame. ,wanted same size of image .therefore w and h of image
            //keeping i,i
            
            //frame will open as left top bydeault position,to change ->setLocation(500,200) i.e from L 350 and from top 150
            setLocation(700-((i+x)/2),400-(i/2));
            
            try{
                Thread.sleep(5); //10 millisec (1 sec=1000 millsec) i.e very less
            }catch(Exception e){
                e.printStackTrace();
            }
                       
        }
        
        t=new Thread(this); //current class reference
        t.start();
        
        setVisible(true);

        
       
    }
    
    //to override run function of runnable interface 
    public void run(){
        try{
            Thread.sleep(5000); //700 millsecs = 7 sec
            setVisible(false); //closing frame
            
            //login frame
            new Login();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    public static void main(String[] args){
        new Splash(); //Creating object of class,once created frame should be seen
    }
}

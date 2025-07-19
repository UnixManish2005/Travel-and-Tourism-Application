package travel.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements Runnable, ActionListener {
    Thread thread;

    Splash(){
        setSize(1200,600);
        setLocation(200,100);
        ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/Splash.png"));

        //ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Splash.PNG"));
        Image i2=i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);

        JButton click=new JButton("Click Here");
        click.setBackground(Color.BLUE);
        click.setForeground(Color.WHITE);
        click.setBounds(470,400,100,25);
        click.addActionListener(this);
        image.add(click);


        setVisible(true);
        thread=new Thread(this);
        thread.start();
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public void run(){
        try{
            Thread.sleep(10000);
            //new Login();
            setVisible(false);
        }catch (Exception e){

        }

    }
    public static void main(String args[]){
        Splash frame=new Splash();
        int x=1;
        for(int i=1; i<=500; x+=7, i+=6){
            frame.setLocation(800-x,600-i);
            frame.setSize(x+i,i);
            try{
                Thread.sleep(10);
            }catch (Exception e){}
        }
    }
}

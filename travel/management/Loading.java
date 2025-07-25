package travel.management;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    public void run(){
        try{
            for(int i=1;i<=101;i++){
                int max=bar.getMaximum();//100
                int value=bar.getValue();

                if(value<max){//101<100
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                    new Dashboard(username);
                    //new class object
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    Loading(String username){
        this.username=username;
        t=new Thread(this);

        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text=new JLabel("Manish Travel & Tourism Application");
        text.setBounds(90,20,600,40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Railway",Font.BOLD,25));
        add(text);

        bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading=new JLabel("Loading, please wait...");
        loading.setBounds(200,140,300,30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Railway",Font.BOLD,15));
        add(loading);

        JLabel lblusername=new JLabel("Welcome "+username);
        lblusername.setBounds(220,310,400,40);
        lblusername.setForeground(Color.red);
        lblusername.setFont(new Font("Railway",Font.BOLD,20));
        add(lblusername);

        t.start();
        setVisible(true);

    }
    public static void main(String args[]){
        new Loading("");

    }
}

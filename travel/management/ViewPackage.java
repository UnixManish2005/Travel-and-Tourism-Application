package travel.management;




import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewPackage extends JFrame implements ActionListener {
    JButton back;
    ViewPackage(String username){
        setBounds(450,200,900,450);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text=new JLabel(" ** VIEW PACKAGE DETAILS ** ");
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        text.setBounds(50,0,400,30);
        add(text);

        JLabel lblusername=new JLabel("Username");
        lblusername.setForeground(Color.BLUE);
        lblusername.setFont(new Font("Railway",Font.BOLD,15));
        lblusername.setBounds(30,50,150,25);
        add(lblusername);

        JLabel labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);

        JLabel lblid=new JLabel("Package ");
        lblid.setForeground(Color.BLUE);
        lblid.setFont(new Font("Railway",Font.BOLD,15));
        lblid.setBounds(30,90,150,25);
        add(lblid);

        JLabel labepackage=new JLabel();
        labepackage.setBounds(220,90,150,25);
        add(labepackage);

        JLabel lblnumber=new JLabel("Total Persons");
        lblnumber.setForeground(Color.BLUE);
        lblnumber.setFont(new Font("Railway",Font.BOLD,15));
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);

        JLabel labelpersons=new JLabel();
        labelpersons.setBounds(220,130,150,25);
        add(labelpersons);

        JLabel lblname=new JLabel("Id");
        lblname.setForeground(Color.BLUE);
        lblname.setFont(new Font("Railway",Font.BOLD,15));
        lblname.setBounds(30,170,150,25);
        add(lblname);

        JLabel labelid=new JLabel();
        labelid.setBounds(220,170,150,25);
        add(labelid);

        JLabel lblgender=new JLabel("Number");
        lblgender.setForeground(Color.BLUE);
        lblgender.setFont(new Font("Railway",Font.BOLD,15));
        lblgender.setBounds(30,210,150,25);
        add(lblgender);

        JLabel labelnumber=new JLabel();
        labelnumber.setBounds(220,210,150,25);
        add(labelnumber);

        JLabel lblcountry=new JLabel("Phone Number");
        lblcountry.setForeground(Color.BLUE);
        lblcountry.setFont(new Font("Railway",Font.BOLD,15));
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);

        JLabel labelphone=new JLabel();
        labelphone.setBounds(220,250,150,25);
        add(labelphone);

        JLabel lbladdress=new JLabel("Price");
        lbladdress.setForeground(Color.BLUE);
        lbladdress.setFont(new Font("Railway",Font.BOLD,15));
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);

        JLabel labelprice=new JLabel();
        labelprice.setBounds(220,290,150,25);
        add(labelprice);



        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(130,360,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(420,8,500,400);
        add(image);



        try{
            Conn conn=new Conn();
            String query="select *from bookpackage where username='"+username+"'";
            ResultSet rs= conn.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labepackage.setText(rs.getString("package"));
                labelprice.setText(rs.getString("price"));
                labelphone.setText(rs.getString("phone"));
                labelpersons.setText(rs.getString("persons"));



            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){

        setVisible(false);
    }
    public static void main(String args[]){

        new ViewPackage("Ramu");
    }
}



package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewBookedHotel extends JFrame implements ActionListener {
    JButton back;
    ViewBookedHotel(String username){
        setBounds(400,200,1000,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text=new JLabel("** VIEW BOOKED HOTEL DETAILS ** ");
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

        JLabel lblid=new JLabel("Hotel Name ");
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

        JLabel lbldays=new JLabel("Total Days");
        lbldays.setForeground(Color.BLUE);
        lbldays.setFont(new Font("Railway",Font.BOLD,15));
        lbldays.setBounds(30,170,150,25);
        add(lbldays);

        JLabel labeldays=new JLabel();
        labeldays.setBounds(220,170,150,25);
        add(labeldays);

        JLabel lblac=new JLabel("AC/ Non-AC");
        lblac.setForeground(Color.BLUE);
        lblac.setFont(new Font("Railway",Font.BOLD,15));
        lblac.setBounds(30,210,150,25);
        add(lblac);

        JLabel labelac=new JLabel();
        labelac.setBounds(220,210,150,25);
        add(labelac);

        JLabel lblfood=new JLabel("Food Included ?");
        lblfood.setForeground(Color.BLUE);
        lblfood.setFont(new Font("Railway",Font.BOLD,15));
        lblfood.setBounds(30,250,150,25);
        add(lblfood);

        JLabel labelfood=new JLabel();
        labelfood.setBounds(220,250,150,25);
        add(labelfood);

        JLabel lblname=new JLabel("ID");
        lblname.setForeground(Color.BLUE);
        lblname.setFont(new Font("Railway",Font.BOLD,15));
        lblname.setBounds(30,290,150,25);
        add(lblname);

        JLabel labelid=new JLabel();
        labelid.setBounds(220,290,150,25);
        add(labelid);

        JLabel lblgender=new JLabel("Number");
        lblgender.setForeground(Color.BLUE);
        lblgender.setFont(new Font("Railway",Font.BOLD,15));
        lblgender.setBounds(30,330,150,25);
        add(lblgender);

        JLabel labelnumber=new JLabel();
        labelnumber.setBounds(220,330,150,25);
        add(labelnumber);

        JLabel lblcountry=new JLabel("Phone Number");
        lblcountry.setForeground(Color.BLUE);
        lblcountry.setFont(new Font("Railway",Font.BOLD,15));
        lblcountry.setBounds(30,370,150,25);
        add(lblcountry);

        JLabel labelphone=new JLabel();
        labelphone.setBounds(220,370,150,25);
        add(labelphone);

        JLabel lbladdress=new JLabel("Total Cost");
        lbladdress.setForeground(Color.BLUE);
        lbladdress.setFont(new Font("Railway",Font.BOLD,15));
        lbladdress.setBounds(30,410,150,25);
        add(lbladdress);

        JLabel labelprice=new JLabel();
        labelprice.setBounds(220,410,150,25);
        add(labelprice);


        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(130,470,100,25);
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
            String query="select *from bookhotel where username='"+username+"'";
            ResultSet rs= conn.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labepackage.setText(rs.getString("name"));
                labelprice.setText(rs.getString("price"));
                labelphone.setText(rs.getString("phone"));
                labelpersons.setText(rs.getString("persons"));
                labelfood.setText(rs.getString("food"));
                labelac.setText(rs.getString("ac"));
                labeldays.setText(rs.getString("days"));




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

        new ViewBookedHotel("Damini");
    }
}

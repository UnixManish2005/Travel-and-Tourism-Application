package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCustomer extends JFrame implements ActionListener {

    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;


    UpdateCustomer(String username){
        setBounds(500,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel text=new JLabel("* UPDATE CUSTOMER DETAILS *");
        text.setBounds(50,5,350,25);
        text.setFont(new Font("Tahoma",Font.BOLD,20));
        add(text);

        JLabel lblusername=new JLabel("Username");
        lblusername.setForeground(Color.red);
        lblusername.setFont(new Font("Railway",Font.BOLD,15));
        lblusername.setBounds(30,50,150,25);
        add(lblusername);

        labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);

        JLabel lbid=new JLabel("ID");
        lbid.setForeground(Color.red);
        lbid.setFont(new Font("Railway",Font.BOLD,15));
        lbid.setBounds(30,90,150,25);
        add(lbid);


        tfid=new JTextField();
        tfid.setBounds(220,90,150,25);
        add(tfid);

        JLabel lblnumber=new JLabel("Number");
        lblnumber.setForeground(Color.red);
        lblnumber.setFont(new Font("Railway",Font.BOLD,15));
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);

        tfnumber=new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);

        JLabel lblname=new JLabel("Name");
        lblname.setForeground(Color.red);
        lblname.setFont(new Font("Railway",Font.BOLD,15));
        lblname.setBounds(30,170,150,25);
        add(lblname);

        labelname=new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);

        JLabel lblgender=new JLabel("Gender");
        lblgender.setForeground(Color.red);
        lblgender.setFont(new Font("Railway",Font.BOLD,15));
        lblgender.setBounds(30,210,150,25);
        add(lblgender);

        tfgender=new JTextField();
        tfgender.setBounds(220,210,150,25);
        add(tfgender);

        JLabel lblcountry=new JLabel("Country");
        lblcountry.setForeground(Color.red);
        lblcountry.setFont(new Font("Railway",Font.BOLD,15));
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);

        tfcountry=new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);

        JLabel lbladdress=new JLabel("Address");
        lbladdress.setForeground(Color.red);
        lbladdress.setFont(new Font("Railway",Font.BOLD,15));
        lbladdress.setBounds(30,290,150,25);
        add(lbladdress);

        tfaddress=new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);

        JLabel lblemail=new JLabel("Email");
        lblemail.setForeground(Color.red);
        lblemail.setFont(new Font("Railway",Font.BOLD,15));
        lblemail.setBounds(30,330,150,25);
        add(lblemail);

        tfemail=new JTextField();
        tfemail.setBounds(220,330,150,25);
        add(tfemail);

        JLabel lblphone=new JLabel("Phone Number");
        lblphone.setForeground(Color.red);
        lblphone.setFont(new Font("Railway",Font.BOLD,15));
        lblphone.setBounds(30,370,150,25);
        add(lblphone);

        tfphone=new JTextField();
        tfphone.setBounds(220,370,150,25);
        add(tfphone);

        add=new JButton("Update");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70,430,100,25);
        add.addActionListener(this);
        add(add);

        back=new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/UDPATE.JPG"));
        Image i2=i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(400,-60,450,630);
        add(image);

        try{
            Conn c=new Conn();
            ResultSet rs=  c.s.executeQuery("select * from customer where username='"+username+"'");
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        setVisible(true);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){
            String username=labelusername.getText();
            String id=tfid.getText();
            String number=tfnumber.getText();
            String name=labelname.getText();
            String gender=tfgender.getText();
            String country=tfcountry.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();

            try{
                Conn c=new Conn();
                String query = "Update customer set username='" + username + "', id= '" + id + "', name='" + name + "', number= '" + number + "', gender='" + gender + "', country='" + country + "', address='" + address + "', phone='" + phone + "', email='" + email + "'";
                c.s.executeUpdate(query);  // Correct method for INSERT


                JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully");
                setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }else{
            setVisible(false);
        }
    }

    public static void main(String args[]){
        new UpdateCustomer("Vijay");

    }
}


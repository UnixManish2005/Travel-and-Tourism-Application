package travel.management;
//import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgetPassword extends JFrame implements ActionListener {

    JTextField tfusername,tfname,tfquesion,tfanswer,tfpassword;
    JButton search,retrieve,back;

    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Forgot.jpeg"));
        Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(530,25,300,300);
        add(image);


        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);

        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(40,20,100,25);
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblusername);

        tfusername=new JTextField();
        tfusername.setBounds(220,20,150,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        search=new JButton("Search");
        search.setBackground(Color.black);
        search.setForeground(Color.white);
        search.setBounds(380,20,100,25);
        search.addActionListener(this);
        p1.add(search);

        JLabel lblname=new JLabel("Name");
        lblname.setBounds(40,60,100,25);
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblname);

        tfname=new JTextField();
        tfname.setBounds(220,60,150,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblquesion=new JLabel("Your Security Question");
        lblquesion.setBounds(40,100,200,25);
        lblquesion.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblquesion);

        tfquesion=new JTextField();
        tfquesion.setBounds(220,100,150,25);
        tfquesion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquesion);

        JLabel lblanswer=new JLabel("Answer");
        lblanswer.setBounds(40,140,200,25);
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblanswer);

        tfanswer=new JTextField();
        tfanswer.setBounds(220,140,150,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        retrieve=new JButton("Retrieve");
        retrieve.setBackground(Color.black);
        retrieve.setForeground(Color.white);
        retrieve.setBounds(380,140,100,25);
        retrieve.addActionListener(this);
        p1.add(retrieve);

        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(40,180,200,25);
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(lblpassword);

        tfpassword=new JTextField();
        tfpassword.setBounds(220,180,150,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(200,230,100,25);
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            try{
                String query="select * from account where username='"+tfusername.getText()+"'AND username='"+tfusername.getText()+"'";
                Conn c=new Conn();

                Resultset rs= (Resultset) c.s.executeQuery(query);
                while(((ResultSet) rs).next()){
                    tfname.setText(((ResultSet) rs).getString("name"));
                    tfquesion.setText(((ResultSet) rs).getString("security"));

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if(ae.getSource()==retrieve){
            try{
                String query="select * from account where answer='"+tfanswer.getText()+"'AND username='"+tfusername.getText()+"'";
                Conn c=new Conn();

                Resultset rs= (Resultset) c.s.executeQuery(query);
                while(((ResultSet) rs).next()){
                    tfpassword.setText(((ResultSet) rs).getString("password"));

                }

            } catch (Exception e) {
                e.printStackTrace();
            }


        }else{
            setVisible(false);
            new Login();
        }
    }
    public static void main(String args[]){
        new ForgetPassword();
    }
}

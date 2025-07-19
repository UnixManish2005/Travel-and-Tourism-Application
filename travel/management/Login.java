package travel.management;
import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JButton signup,password,login;
    JTextField tfusername,tfpassword;
    public Login(){
        setSize(900,500);
        setLocation(300,150);
        setLayout(null);
        getContentPane().setBackground(Color.black);

        JPanel p1=new JPanel();
        p1.setBackground(Color.black);
        p1.setBounds(0,0,400,500);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(getClass().getResource("/icons/Login.JPG"));
        //ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Login.JPG"));
        Image i2=i1.getImage().getScaledInstance( 400,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(-5,30,460,400);
        p1.add(image);

        // White panel where accepting user name password
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450,400);
        add(p2);
        // Username Text
        JLabel Username=new JLabel("Username");
        Username.setBounds(60,20,100,25);
        Username.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(Username);

        // Username TextField
        tfusername=new JTextField();
        tfusername.setBounds(60,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);

        // Password Written
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setBounds(60,110,100,25);
        lblpassword.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(lblpassword);

        //Password Text Field
        tfpassword=new JTextField();
        tfpassword.setBounds(60,150,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

        //Login Button
        login=new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.setBorder(new LineBorder(new Color(133,193,233)));
        login.addActionListener(this);
        p2.add(login);

        //Signup button
        signup=new JButton("Sign UP");
        signup.setBounds(200,200,130,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.setBorder(new LineBorder(new Color(133,193,233)));
        signup.addActionListener(this);
        p2.add(signup);
        // Forget password button

        password=new JButton("Forget Password ?");
        password.setBounds(130,250,130,30);
        password.setBackground(Color.black);
        password.setForeground(Color.white);
        password.setBorder(new LineBorder(new Color(133,193,233)));
        password.addActionListener(this);
        p2.add(password);

        JLabel text=new JLabel("Trouble in Login...");
        text.setBounds(300,250,150,20);
        text.setForeground(Color.red);
        p2.add(text);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==login){

            try{
                String username=tfusername.getText();
                String pass=tfpassword.getText();

                String query="select* from account where username='"+username+"' AND password='"+pass+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Loading(username);
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect username or password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else if(ae.getSource()==signup){
            setVisible(false);
            new Signup();

        }else{
            setVisible(false);
            new ForgetPassword();
        }

    }
    public static void main(String args[]){
        new Login().setVisible(true);;
    }

}

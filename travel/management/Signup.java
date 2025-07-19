package travel.management;
import com.mysql.cj.log.Log;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Signup extends JFrame implements ActionListener {

    JButton create,back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;

    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);

        JLabel lblusername=new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.BOLD,14));
        lblusername.setBounds(50,20,125,25);
        p1.add(lblusername);

        JLabel lblname=new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.BOLD,14));
        lblname.setBounds(50,60,125,25);
        p1.add(lblname);

        tfname=new JTextField();
        tfname.setBounds(200,60,200,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        tfusername=new JTextField();
        tfusername.setBounds(200,20,200,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel lblpassword=new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,14));
        lblpassword.setBounds(50,100,125,25);
        p1.add(lblpassword);

        tfpassword=new JTextField();
        tfpassword.setBounds(200,100,200,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        JLabel lblsecurity=new JLabel("Security Question");
        lblsecurity.setFont(new Font("Tahoma",Font.BOLD,14));
        lblsecurity.setBounds(50,150,150,25);
        p1.add(lblsecurity);

        security=new Choice();
        security.add("What is your GirlFriend Name ?");
        security.add("Your Favourite Person ?");
        security.add("Your Favorite Dish ? Other than Fish !!");
        security.add("Pasandida Jagah ?");
        security.add("Your Date of Birth");
        security.setBounds(200,150,190,25);
        p1.add(security);

        JLabel lblanswer=new JLabel("Your Answer");
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,14));
        lblanswer.setBounds(50,200,125,25);
        p1.add(lblanswer);

        tfanswer=new JTextField();
        tfanswer.setBounds(200,200,200,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        create=new JButton("Create");
        create.setBackground(Color.black);
        create.setForeground((Color.white) );
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);

        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground((Color.white));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(200,250,100,30);
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/SIGNUP.JPG"));
        Image i2=i1.getImage().getScaledInstance( 300,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(530,15,300,300);
        add(image);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==create){
            String username=tfusername.getText();
            String name=tfname.getText();
            String password=tfpassword.getText();
            String question=security.getSelectedItem();
            String answer=tfanswer.getText();

            String query="insert into account values('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"')";
            try{
                Conn c=new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                setVisible(false);
                new Login();

            } catch (Exception e) {
                e.printStackTrace();
            }


        }else if(ae.getSource()==back){
            setVisible(false);
            new Login();
        }

    }

    public static void main(String args[]){
        new Signup();
    }
}

package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {

    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1=new JLabel("About");
        l1.setBounds(200,10,100,40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);

        String s="Manish Travel and Tourism is a Java-based desktop application designed to streamline the management of travel and tourism-related activities. The application aims to provide a user-friendly interface for both travel agencies and customers, enabling efficient booking, management, and tracking of travel packages, accommodations, and transportation.\n" +
                "\n" +
                "Objectives:\n" +
                "User Management: Allow users (admin, agents, and customers) to register, log in, and manage their profiles.\n" +
                "\n" +
                "Package Management: Enable travel agents to create, update, and delete travel packages.\n" +
                "\n" +
                "Booking Management: Facilitate customers to browse available packages, book trips, and view booking details.\n" +
                "\n" +
                "Payment Integration: Integrate a basic payment system for processing bookings.\n" +
                "\n"+
                "Conclusion :\n"+

                "MR Travel & Tourism is a comprehensive travel and tourism management system that simplifies the process of booking and managing travel packages. With its user-friendly interface and robust backend, it caters to the needs of both travel agencies and customers, making travel planning a seamless experience. This project not only enhances your understanding of Java programming but also provides hands-on experience with database management, GUI development, and system integration.";

        TextArea area=new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,100,450,300);
        add(area);

        JButton back=new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String args[]){
        new About();
    }
}

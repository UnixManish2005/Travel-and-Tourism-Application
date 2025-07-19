package travel.management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.JavaBean;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,bookpackages,viewpackages,viewhotels,destinations,bookhotels,viewbookedhotel,payments,calculator,notepad,about,deletePersonalDetails;
    Dashboard(String username){
        this.username=username;
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.BLACK);
        p1.setBounds(0,0,1600,65);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);

        addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(Color.cyan);
        addPersonalDetails.setForeground(Color.blue);
        addPersonalDetails.setFont(new Font("Railway",Font.BOLD,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(Color.cyan);
        updatePersonalDetails.setForeground(Color.blue);
        updatePersonalDetails.setFont(new Font("Railway",Font.BOLD,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails=new JButton("View Details");
        viewPersonalDetails.setBounds(0,100,300,50);
        viewPersonalDetails.setBackground(Color.cyan);
        viewPersonalDetails.setForeground(Color.blue);
        viewPersonalDetails.setFont(new Font("Railway",Font.BOLD,20));
        viewPersonalDetails.setMargin(new Insets(0,0,0,140));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(Color.cyan);
        deletePersonalDetails.setForeground(Color.blue);
        deletePersonalDetails.setFont(new Font("Railway",Font.BOLD,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,35));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

        checkpackages=new JButton("Check Package");
        checkpackages.setBounds(0,200,300,50);
        checkpackages.setBackground(Color.cyan);
        checkpackages.setForeground(Color.blue);
        checkpackages.setFont(new Font("Railway",Font.BOLD,20));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);

        bookpackages=new JButton("Book Package");
        bookpackages.setBounds(0,250,300,50);
        bookpackages.setBackground(Color.cyan);
        bookpackages.setForeground(Color.blue);
        bookpackages.setFont(new Font("Railway",Font.BOLD,20));
        bookpackages.setMargin(new Insets(0,0,0,120));
        bookpackages.addActionListener(this);
        p2.add(bookpackages);

        viewpackages=new JButton("View Package");
        viewpackages.setBounds(0,300,300,50);
        viewpackages.setBackground(Color.cyan);
        viewpackages.setForeground(Color.blue);
        viewpackages.setFont(new Font("Railway",Font.BOLD,20));
        viewpackages.setMargin(new Insets(0,0,0,124));
        viewpackages.addActionListener(this);
        p2.add(viewpackages);

        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(Color.cyan);
        viewhotels.setForeground(Color.blue);
        viewhotels.setFont(new Font("Railway",Font.BOLD,20));
        viewhotels.setMargin(new Insets(0,0,0,144));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

        bookhotels=new JButton("Book Hotel");
        bookhotels.setBounds(0,400,300,50);
        bookhotels.setBackground(Color.cyan);
        bookhotels.setForeground(Color.blue);
        bookhotels.setFont(new Font("Railway",Font.BOLD,20));
        bookhotels.setMargin(new Insets(0,0,0,150));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);

        viewbookedhotel=new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,450,350,50);
        viewbookedhotel.setBackground(Color.cyan);
        viewbookedhotel.setForeground(Color.blue);
        viewbookedhotel.setFont(new Font("Railway",Font.BOLD,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,130));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);

        destinations=new JButton("Destinations");
        destinations.setBounds(0,500,350,50);
        destinations.setBackground(Color.cyan);
        destinations.setForeground(Color.blue);
        destinations.setFont(new Font("Railway",Font.BOLD,20));
        destinations.setMargin(new Insets(0,0,0,190));
        destinations.addActionListener(this);
        p2.add(destinations);

        payments=new JButton("Payments");
        payments.setBounds(0,550,350,50);
        payments.setBackground(Color.cyan);
        payments.setForeground(Color.blue);
        payments.setFont(new Font("Railway",Font.BOLD,20));
        payments.setMargin(new Insets(0,0,0,215));
        payments.addActionListener(this);
        p2.add(payments);

        calculator=new JButton("Calculator");
        calculator.setBounds(0,600,350,50);
        calculator.setBackground(Color.cyan);
        calculator.setForeground(Color.blue);
        calculator.setFont(new Font("Railway",Font.BOLD,20));
        calculator.setMargin(new Insets(0,0,0,210));
        calculator.addActionListener(this);
        p2.add(calculator);

        notepad=new JButton("Notepad");
        notepad.setBounds(0,650,350,50);
        notepad.setBackground(Color.cyan);
        notepad.setForeground(Color.blue);
        notepad.setFont(new Font("Railway",Font.BOLD,20));
        notepad.setMargin(new Insets(0,0,0,230));
        notepad.addActionListener(this);
        p2.add(notepad);

        about=new JButton("About");
        about.setBounds(0,700,350,50);
        about.setBackground(Color.cyan);
        about.setForeground(Color.blue);
        about.setFont(new Font("Railway",Font.BOLD,20));
        about.setMargin(new Insets(0,0,0,250));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/DASH.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);

        JLabel text=new JLabel("Welcome to Manish Travel & Tourism System");
        text.setBounds(340,80,1200,70);
        text.setForeground(Color.red);
        text.setFont(new Font("Calligraphy",Font.BOLD,55));
        image.add(text);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
        }else if(ae.getSource()==viewPersonalDetails){
            new ViewCustomer(username);
        } else if (ae.getSource()==updatePersonalDetails) {
            new UpdateCustomer(username);
        }else if(ae.getSource()==checkpackages){
            new CheckPackage();
        }else if(ae.getSource()==bookpackages){
            new BookPackage(username);
        }else if(ae.getSource()==viewpackages){
            new ViewPackage(username);
        }else if(ae.getSource()==viewhotels){
            new CheckHotels();
        }else if(ae.getSource()==destinations){
            new Destinations();
        } else if (ae.getSource()==bookhotels) {
            new BookHotel(username);
        } else if (ae.getSource()==viewbookedhotel) {
            new ViewBookedHotel(username);
        } else if (ae.getSource()==payments) {
            new Payment();
        } else if (ae.getSource()==calculator) {
            try{
                Runtime.getRuntime().exec("calc.exe");

            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else if (ae.getSource()==notepad) {
            try{
                Runtime.getRuntime().exec("notepad.exe");

            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource()==about) {
            new About();

        } else if (ae.getSource()==deletePersonalDetails) {
            new DeleteDetails(username);
        }
    }
    public static void main(String args[]){
        new Dashboard("");
    }
}

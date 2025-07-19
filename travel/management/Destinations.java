package travel.management;

import javax.swing.*;
import java.awt.*;

public class Destinations extends JFrame implements Runnable  {

        Thread t1;
        /*JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
        JLabel[] label=new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10 };*/


        JLabel[] label = new JLabel[10];

        public void run(){

            try{
                for(int i=0;i<9; i++) {
                    if (label[i] != null) {
                        label[i].setVisible(true);
                        Thread.sleep(2500);
                        label[i].setVisible(false);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        Destinations(){
            setBounds(500,200,800,600);
            setLayout(null);



            ImageIcon[] image = new ImageIcon[10];
            Image[] jimage = new Image[10];
            ImageIcon[] kimage = new ImageIcon[10];

            for (int i = 0; i < 9; i++) {
                // Load image from resources
                java.net.URL imageURL = getClass().getResource("/icons/dest" + (i + 1) + ".jpg");

                if (imageURL != null) {
                    image[i] = new ImageIcon(imageURL);
                    jimage[i] = image[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                    kimage[i] = new ImageIcon(jimage[i]);

                    label[i] = new JLabel(kimage[i]);  // Initialize JLabel before using it
                    label[i].setBounds(0, 0, 800, 600);
                    add(label[i]);
                } else {
                    System.out.println("Image not found: dest" + (i + 1) + ".jpg");
                }
            }
            t1=new Thread(this);
            t1.start();


            setVisible(true);

        }

        public static void main(String args[]){
            new Destinations();
        }
}




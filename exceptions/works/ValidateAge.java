import java.util.*;
import javax.swing.*;

import javax.swing.JTextField;

public class ValidateAge implements AgeException{
    public static void main(String[] args) {
        JFrame f=new JFrame("JFrameInstanceExample");
        JLabel ageLabel = new JLabel("AGE");
        JTextField text = new JTextField();
        JButton b = new JButton();
        text.setBounds(100,150,150, 40);
        ageLabel.setBounds(50, 150, 100, 30);

 
        f.add(b);//add button in JFrame
 
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
        // Scanner obj1 = new Scanner(System.in);
        // System.out.println("Enter the age: ");
        String ageT = text.getText();

        if (e.getSource() == text) {
            int age = Integer.parseInt(ageT);
            if (age<18) {
                try {
                    throw new AgeException();
                } catch (AgeException ae) {
                    System.out.println("Exception raised");
                }
            }
            else {
                System.out.println("Age entered is " + age);    
        } 
        }

    }

}

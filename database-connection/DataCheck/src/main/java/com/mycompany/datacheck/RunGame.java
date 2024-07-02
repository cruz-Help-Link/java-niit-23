/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datacheck;

/**
 *
 * @author Donna
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * RunGame
 */
public class RunGame extends JFrame implements ActionListener{

    JPanel panel = new JPanel();
    JTextField userName = new JTextField(1);
    JTextField userPassword = new JTextField(1);
    JTextField userRePassword = new JTextField(1);
    JButton submit = new JButton();
    JLabel userNamelable = new JLabel();
    JLabel userPasslable = new JLabel();
    JLabel userRePasslable = new JLabel();

    public RunGame() {
        this.add(panel);
        panel.add(userName);
        panel.add(userPassword);
        panel.add(userRePassword);
        panel.add(submit);
        panel.add(userNamelable);
        panel.add(userPasslable);
        panel.add(userRePasslable);
        this.setVisible(true);
        this.setDefaultLookAndFeelDecorated(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10, 10, 300, 300);
        formLook();
        submit.addActionListener(this);

    }

    public void formLook() {
        userNamelable.setBounds(10, 10, 30, 15);
        userPasslable.setBounds(10, 30, 30, 15);
        userRePasslable.setBounds(10, 50, 30, 15);
        userName.setBounds(60, 10, 30, 15);
        userPassword.setBounds(60, 30, 30, 15);
        userRePassword.setBounds(60, 50, 30, 15);
        submit.setBounds(80, 30, 15, HEIGHT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String firstPassInput = userPassword.getText();
        String secPassInput = userRePassword.getText();
        String name = userName.getText();    //1ST INPUT INTO DB
        String mss ="Password Mismatch";
        String password = firstPassInput.equals(secPassInput) ? firstPassInput: mss; //2ND INPUT INTO DB

        saveJavaUser(name, password);
    }

    private void saveJavaUser(String name, String password) {
        Connection connection;  //OBJECT OF CONNECTION
        
        String url = "jdbc:mysql://localhost:3306//zero";
        String userName = "root";
        String dBpassword = "Java2023!";
        String prepQuery = "insert into javaUsers(?, ?)";
        
        try{
            Class.forName("com.mysql.cj.jdbc.zero"); //calling static Driver class
            connection = DriverManager.getConnection(url, userName, dBpassword); //Creates DB connection
            
            
            
        }
        catch(Exception e) {
            System.out.println("Exception Occured");
        }
    }
    
    public static void main(String[] args) {
        RunGame rGame = new RunGame();
    }
}

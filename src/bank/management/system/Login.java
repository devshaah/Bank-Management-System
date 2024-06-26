package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{

    JLabel header,cardNumber,pin;
    JTextField card;
    JPasswordField password;
    JButton logIn,signUp,clear;
    Login(){
        super("Bank Management System");

        // GETTING IMAGES
        // BANK ICON 
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image); 

        // HAND ICON 
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image i12 = i11.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel image1 = new JLabel(i13);
        image1.setBounds(630,320,100,100);
        add(image1);

        //Adding Labels
        header = new JLabel("WELCOME TO ATM");
        header.setForeground(Color.WHITE);
        header.setFont(new Font("AvantGarde", Font.BOLD, 38));
        header.setBounds(230,125,450,40);
        add(header);

        cardNumber = new JLabel("Card No: ");
        cardNumber.setForeground(Color.WHITE);
        cardNumber.setFont(new Font("Ralway", Font.BOLD, 20));
        cardNumber.setBounds(150,190,375,30);
        add(cardNumber);

        card = new JTextField(15);
        card.setBounds(300,190,230,30);
        card.setFont(new Font("Arial", Font.BOLD, 14));
        add(card);

        pin = new JLabel("PIN: ");
        pin.setForeground(Color.WHITE);
        pin.setFont(new Font("Ralway", Font.BOLD, 20));
        pin.setBounds(150,250,375,30);
        add(pin);

        password = new JPasswordField(15);
        password.setBounds(300,250,230,30);
        password.setFont(new Font("Arial", Font.BOLD, 14));
        add(password);


        //BUTTONS
        logIn = new JButton("Log In");
        logIn.setBounds(300,300,100,30);
        logIn.setFont(new Font("Arial", Font.BOLD, 14));
        logIn.setForeground(Color.WHITE);
        logIn.setBackground(Color.black);
        logIn.addActionListener(this);
        add(logIn);

        clear = new JButton("Clear");
        clear.setBounds(425,300,100,30);
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setForeground(Color.WHITE);
        clear.setBackground(Color.black);
        clear.addActionListener(this);
        add(clear);

        signUp = new JButton("Sign Up");
        signUp.setBounds(325,350,200,30);
        signUp.setFont(new Font("Arial", Font.BOLD, 14));
        signUp.setForeground(Color.WHITE);
        signUp.setBackground(Color.black);
        signUp.addActionListener(this);
        add(signUp);


        // BACKGROUND IMAGE 
        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image i22 = i21.getImage().getScaledInstance(850, 450, Image.SCALE_DEFAULT);
        ImageIcon i23 = new ImageIcon(i22);
        JLabel image2 = new JLabel(i23);
        image2.setBounds(0,0,850,450);
        add(image2);

        // SET WINDOW
        setLayout(null); //customize krne ke liye, naitoh default window aayega
        setSize(850,450);
        setLocation(250,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == logIn){
                System.out.println(card.getText());
                System.out.println(password.getPassword());
            }
            else if(e.getSource() == clear){
                card.setText("");
                password.setText("");
            }
            else if(e.getSource() == signUp){

            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }
}

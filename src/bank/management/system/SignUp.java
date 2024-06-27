package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class SignUp extends JFrame implements ActionListener{

    Random ran = new Random();
    String applicationNo = " " + Math.abs(ran.nextLong() % 9000L);
    JTextField textName, fatherName, email, address, city, state, textPin;
    JRadioButton male, female, m1, m2, m3;
    JButton next;

    public SignUp() {
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel formNo = new JLabel("Application Form No:" + applicationNo);
        formNo.setBounds(160, 20, 600, 40);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        add(formNo);

        JLabel page = new JLabel("Page 1");
        page.setBounds(330, 70, 600, 40);
        page.setFont(new Font("Raleway", Font.BOLD, 22));
        add(page);

        JLabel personalInfo = new JLabel("Personal Details");
        personalInfo.setBounds(290, 100, 600, 40);
        personalInfo.setFont(new Font("Raleway", Font.BOLD, 22));
        add(personalInfo);

        JLabel name = new JLabel("Name : ");
        name.setBounds(100, 190, 100, 30);
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        add(name);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 300, 30);
        add(textName);

        JLabel fname = new JLabel("Father's Name :");
        fname.setBounds(100, 240, 200, 30);
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        add(fname);

        fatherName = new JTextField();
        fatherName.setFont(new Font("Raleway", Font.BOLD, 14));
        fatherName.setBounds(300, 240, 300, 30);
        add(fatherName);

        JLabel gen = new JLabel("Gender :");
        gen.setBounds(100, 290, 200, 30);
        gen.setFont(new Font("Raleway", Font.BOLD, 20));
        add(gen);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 80, 30);
        male.setBackground(new Color(222, 255, 228));
        male.setFont(new Font("Raleway", Font.BOLD, 14));
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 290, 90, 30);
        female.setBackground(new Color(222, 255, 228));
        female.setFont(new Font("Raleway", Font.BOLD, 14));
        add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel mail = new JLabel("Email :");
        mail.setBounds(100, 340, 200, 30);
        mail.setFont(new Font("Raleway", Font.BOLD, 20));
        add(mail);

        email = new JTextField();
        email.setFont(new Font("Raleway", Font.BOLD, 14));
        email.setBounds(300, 340, 300, 30);
        add(email);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 390, 200, 30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 390, 100, 30);
        m1.setBackground(new Color(222, 255, 228));
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222, 255, 228));
        m2.setBounds(450, 390, 100, 30);
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222, 255, 228));
        m3.setBounds(635, 390, 100, 30);
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m3);

        ButtonGroup buttonGroupmarital = new ButtonGroup();
        buttonGroupmarital.add(m1);
        buttonGroupmarital.add(m2);
        buttonGroupmarital.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 440, 200, 30);
        add(labelAdd);

        address = new JTextField();
        address.setFont(new Font("Raleway", Font.BOLD, 14));
        address.setBounds(300, 440, 400, 30);
        add(address);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 490, 200, 30);
        add(labelCity);

        city = new JTextField();
        city.setFont(new Font("Raleway", Font.BOLD, 14));
        city.setBounds(300, 490, 400, 30);
        add(city);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 540, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 540, 400, 30);
        add(textPin);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 590, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 700);
        setLocation(300, 10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String gender,marritalStatus ;
            if(male.isSelected()){
                 gender = "Male";
            }else{
                gender = "Female";
            }

            if(m1.isSelected()){
                marritalStatus = "Married";
            }
            else if(m1.isSelected()){
                marritalStatus = "Unmarried";
            }
            else{
                marritalStatus = "Other";
            }

            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the Fields");
            }else{
                Connect connect = new Connect();
                String q = "insert into signup values('"+applicationNo+"','"+textName.getText()+"','"+fatherName.getText()+"','"+gender+"','"+email.getText()+"','"+marritalStatus+"','"+address.getText()+"','"+city.getText()+"','"+textPin.getText()+"')";
                connect.statement.executeUpdate(q);
                new SignUp2();
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }
}

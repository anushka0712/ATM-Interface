package client;


import logic.ATM_Interface;
import logic.Login;
import logic.User;

import javax.swing.*;
import java.util.ArrayList;

public class Final_interface {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } finally {
        }

        ArrayList<User> A1 = new ArrayList<User>();
        User u1 = new User("Rai",12345,6969,100000.1);
        User u2 = new User("Sai",24680,6968,200000.1);
        User u3 = new User("Mai",13579,6967,300000.1);
        A1.add(u1);
        A1.add(u2);
        A1.add(u3);
        System.out.println("lololo");
        Login l = new Login(A1);
        ATM_Interface a = new ATM_Interface();

        l.setContentPane(new Login(A1).LoginMain);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setVisible(true);
        l.pack();

        a.setContentPane(new ATM_Interface().Main);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
        a.pack();





    }
}

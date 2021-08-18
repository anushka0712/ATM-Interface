package client;


import logic.ATM_Interface;
import logic.Login;
import logic.User;

import javax.swing.*;
import java.util.ArrayList;

public class Final_interface {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        Login l = new Login();
        ATM_Interface a = new ATM_Interface();
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } finally {

        }

        l.setContentPane(new Login().LoginMain);
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setVisible(true);
        l.pack();


        a.setContentPane(new ATM_Interface().Main);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
        a.pack();

        ArrayList<User> A1 = new ArrayList<User>();
        User u = new User("Rai",12345,6969,100000.1);
        A1.add(u);

    }
}

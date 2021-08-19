package client;


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

        ArrayList<User> sampleUsers = new ArrayList<User>();
        User u1 = new User("Rai",12345,6969,100000.1);
        User u2 = new User("Sai",24680,6968,200000.1);
        User u3 = new User("Mai",13579,6967,300000.1);
        sampleUsers.add(u1);
        sampleUsers.add(u2);
        sampleUsers.add(u3);
        User user = new User("",0,0,0.0);


        Login l = new Login(sampleUsers);

        l.setContentPane(new Login(sampleUsers).getLoginMain());
        l.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        l.setVisible(true);
        l.pack();
        user = l.getCurrentUser();
    }
}

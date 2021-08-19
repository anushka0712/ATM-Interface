package logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login extends JFrame {
    private JPanel LoginMain;
    private JButton ENTERButton;
    private JPasswordField passwordField1;
    private JTextArea textArea1;

    private ArrayList<User> sampleUsers = new ArrayList<User>();
    private User currentUser;


    public Login(ArrayList Users) {

        this.sampleUsers = Users;
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean validCard = cardValidity(textArea1.getText());
                System.out.println(textArea1.getText() + validCard);
                if (validCard != true) {
                    JOptionPane.showMessageDialog(null, "INVALID ACCOUNT NUMBER");
                } else {
                    boolean validPin = pinValidity(passwordField1.getPassword());
                    if (validPin != true) {
                        JOptionPane.showMessageDialog(null, "INVALID PIN");
                    } else {
                        JOptionPane.showMessageDialog(null, "LOGGED IN SUCESSFULLY!");

                        ATM_Interface atmInterface = new ATM_Interface(currentUser);
                        atmInterface.setContentPane(new ATM_Interface(currentUser).getMain());
                        atmInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        atmInterface.setVisible(true);
                        atmInterface.pack();
                    }
                }
            }
        });
    }

    public boolean cardValidity(String number) {
        boolean valid = false;
        for (User u : sampleUsers) {
            if (u.getCard_number() == Integer.parseInt(number)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public boolean pinValidity(char[] pin) {
        boolean valid = false;
        for (User u : sampleUsers) {
            if (u.getPin() == Integer.parseInt(String.valueOf(pin))) {
                valid = true;
                currentUser = u; // SINCE PIN IS VERIFIED WE INITIALLIZE CURRENT USER OBJECT
//                currentUser.setName(u.getName());
//                currentUser.setCard_number(u.getCard_number());
//                currentUser.setPin(u.getPin());
//                currentUser.setBalance((u.getBalance()));
                break;
            }
        }
        return valid;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public JPanel getLoginMain() {
        return LoginMain;
    }

    public JButton getENTERButton() {
        return ENTERButton;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }
}

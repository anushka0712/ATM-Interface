package logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Login extends JFrame{
    public JPanel LoginMain;
    private JButton ENTERButton;
    private JPasswordField passwordField1;
    private JTextArea textArea1;

      ArrayList<User> sampleUsers = new ArrayList<User>();
//    User u1 = new User("Rai",12345,6969,100000.1);
//    User u2 = new User("Sai",24680,6968,200000.1);
//    User u3 = new User("Mai",13579,6967,300000.1);




    public Login(ArrayList Users) {

        this.sampleUsers = Users;
        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean validCard = cardValidity(textArea1.getText());
                System.out.println(textArea1.getText() + validCard);
                if (validCard != true)
                {
                    JOptionPane.showMessageDialog(null,"INVALID ACCOUNT NUMBER");
                }
                else
                {
                    boolean validPin = pinValidity(passwordField1.getPassword());
                    if(validPin != true)
                    {
                        JOptionPane.showMessageDialog(null,"INVALID PIN");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"LOGGED IN SUCESSFULLY!");
                    }
                }
            }
        });

    }

    public boolean cardValidity(String number){
        boolean valid = false;
        for (User u:sampleUsers) {
//            System.out.println("In");
//            System.out.println(u.getCard_number());
//            System.out.println(Integer.parseInt(number));
            if (u.getCard_number() == Integer.parseInt(number)) {
//                System.out.println("In true");
                valid = true;
                break;
            }
        }
//        System.out.println(valid + "!");
        return valid;
    }

    public boolean pinValidity(char[] pin){
        boolean valid = false;
        for (User u:sampleUsers) {
            System.out.println(u.getPin() + Integer.parseInt(String.valueOf(pin)));
            if (u.getPin() == Integer.parseInt(String.valueOf(pin))) {
                valid = true;
                break;
            }
        }
        return valid;
    }
}

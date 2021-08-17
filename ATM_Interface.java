import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM_Interface extends JFrame{
    private JPanel Main;
    private JButton withdrawButton;
    private JButton transferButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JPasswordField passwordField1;
    private JTextArea displayTextArea;
    private JButton changePinButton;
    private JButton exitButton;
    private JButton depositButton;
    private JButton checkBalanceButton;
    private JTextArea textArea1;
    private JButton a6Button;
    private JButton a8Button;
    private JButton a7Button;
    private JButton a9Button;
    private JButton cancelButton;
    private JButton a0Button;
    private JButton goButton;

    public ATM_Interface() {

        final String[] amount = {""};
        final String[] operation = {""};
        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] += "Transfer";
                JOptionPane.showMessageDialog(null, "Money Transferred.");
            }
        });
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] += "Withdraw";
                JOptionPane.showMessageDialog(null, "Money Withdrawn.");
            }
        });
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] += "Deposit";
                Deposit d = new Deposit();
                textArea1.setText("Enter the amount to be deposited : " + "\n\n" + "Rs. ");
                d.deposit_amount(amount);
            }
        });
        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] += "Check Balance";
                JOptionPane.showMessageDialog(null, "Your Balance is Rs.");
            }
        });
        changePinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] += "Change Pin";
                JOptionPane.showMessageDialog(null, "Pin changed.");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String one = a1Button.getText();
                textArea1.append(one);
                amount[0] += one;
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String two = a2Button.getText();
                textArea1.append(two);
                amount[0] += two;
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String three = a3Button.getText();
                textArea1.append(three);
                amount[0] += three;
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String four = a4Button.getText();
                textArea1.append(four);
                amount[0] += four;
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String five = a5Button.getText();
                textArea1.append(five);
                amount[0] += five;
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String six = a6Button.getText();
                textArea1.append(six);
                amount[0] += six;
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seven = a7Button.getText();
                textArea1.append(seven);
                amount[0] += seven;
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eight = a8Button.getText();
                textArea1.append(eight);
                amount[0] += eight;
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nine = a9Button.getText();
                textArea1.append(nine);
                amount[0] += nine;
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String zero = a0Button.getText();
                textArea1.append(zero);
                amount[0] += zero;
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("Deposit".equals(operation[0])) {
                    double finalValue = Double.valueOf(amount[0]);
                    JOptionPane.showMessageDialog(null,"Rs. " + amount[0] + " Deposited");
                    //JOptionPane.showMessageDialog(null, "Money Deposited.");

                }

            }
        });
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        ATM_Interface a = new ATM_Interface();
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } finally {

        }

        a.setContentPane(new ATM_Interface().Main);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
        a.pack();
    }
}

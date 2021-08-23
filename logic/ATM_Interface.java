package logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ATM_Interface extends JFrame {
    private JPanel Main;
    private JButton withdrawButton;
    private JButton transferButton;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JPasswordField passwordField1;
    //public JTextArea displayTextArea;
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
    private JButton exitButton1;
    private JButton transactionHistoryButton;

    private String[] amount = {""};
    private String[] operation = new String[1];
    private User user;

    public ATM_Interface(User currentUser) {

        this.user = currentUser;

        textArea1.setText("\n" + "Welcome " + user.getName() + " !");

        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] = "Transfer";
                JOptionPane.showMessageDialog(null, "Money Transferred.");
            }
        });
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] = "Withdraw";
                textArea1.setText("Enter the amount to be withdrawn : " + "\n\n" + "Rs. ");
            }
        });
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] = "Deposit";
                textArea1.setText("Enter the amount to be deposited : " + "\n\n" + "Rs. ");
            }
        });
        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] = "Check Balance";
            }
        });
        changePinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operation[0] = "Change Pin";
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
                    Deposit d = new Deposit(user);
                    double finalValue = Double.parseDouble(amount[0]);
                    d.deposit_amount(finalValue);
                    JOptionPane.showMessageDialog(null, "Rs. " + amount[0] + " Deposited successfully.");
                    d.addHistory();
                    amount[0] = "";
                }
                else if("Withdraw".equals(operation[0])){
                    Withdraw w = new Withdraw(user);
                    w.withdraw_amount(amount[0]);
                    // double finalValue = Double.parseDouble(amount[0]);
                    JOptionPane.showMessageDialog(null,"Rs. " + amount[0] + " Withdrawn successfully.");
                    amount[0] = "";
                }

            }
        });
        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("Your Current Balance is : " + "\n\n" + "Rs. " + String.valueOf(user.getBalance()));
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("\n" + "Welcome " + user.getName() + " !");
            }
        });
        transactionHistoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TransactionHistory panel = new TransactionHistory();


                panel.setContentPane(new TransactionHistory().getRecentTransactions());
                panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                panel.setVisible(true);
                panel.pack();

            }
        });
    }

    public String getOperation(){
        return operation[0];
    }

    public String[] getAmount() {
        return amount;
    }

    public JPanel getMain() {
        return Main;
    }

    public JButton getWithdrawButton() {
        return withdrawButton;
    }

    public JButton getTransferButton() {
        return transferButton;
    }

    public JPasswordField getPasswordField1() {
        return passwordField1;
    }

    public JButton getChangePinButton() {
        return changePinButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public JButton getDepositButton() {
        return depositButton;
    }

    public JButton getCheckBalanceButton() {
        return checkBalanceButton;
    }

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public JButton getCancelButton() {
        return cancelButton;
    }
}

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
    private JEditorPane editorPane1;

    public ATM_Interface() {
        transferButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Money Transferred.");
            }
        });
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Money Withdrawn.");

            }
        });
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Money Deposited.");

            }
        });
        checkBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Your Balance is Rs.");

            }
        });
        changePinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Pin changed.");

            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String one = a1Button.getText();

            }
        });

    }

    public static void main(String[] args) {
        ATM_Interface a = new ATM_Interface();
        a.setContentPane(new ATM_Interface().Main);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
        a.pack();
    }
}

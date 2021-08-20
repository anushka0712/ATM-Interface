package logic;

import javax.swing.*;
import java.util.Stack;

public class TransactionHistory extends JFrame{
    private JPanel RecentTransactions;
    private JTextArea tNameField;
    private JTextArea tOperationField;
    private JTextArea tAmountField;
    private JButton OKButton;

    public void displayHistory(Stack<Transaction> transactions){

    }


    public JPanel getRecentTransactions() {
        return RecentTransactions;
    }

    public void setRecentTransactions(JPanel recentTransactions) {
        RecentTransactions = recentTransactions;
    }

    public JTextArea gettNameField() {
        return tNameField;
    }

    public void settNameField(JTextArea tNameField) {
        this.tNameField = tNameField;
    }

    public JTextArea gettOperationField() {
        return tOperationField;
    }

    public void settOperationField(JTextArea tOperationField) {
        this.tOperationField = tOperationField;
    }

    public JTextArea gettAmountField() {
        return tAmountField;
    }

    public void settAmountField(JTextArea tAmountField) {
        this.tAmountField = tAmountField;
    }

    public JButton getOKButton() {
        return OKButton;
    }

    public void setOKButton(JButton OKButton) {
        this.OKButton = OKButton;
    }
}

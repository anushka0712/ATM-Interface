package logic;

public class Transaction {

    private String operation;
    private String amount;

    public Transaction(String deposit, double depositAmnt) {
        this.operation = operation;
        this.amount = amount;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}

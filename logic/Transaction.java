package logic;

public class Transaction {

    private String name;
    private String operation;
    private String amount;

    public Transaction(String name, String deposit, double depositAmnt) {
        this.name = name;
        this.operation = operation;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

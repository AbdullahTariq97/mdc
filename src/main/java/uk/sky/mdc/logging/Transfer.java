package uk.sky.mdc.logging;

public class Transfer {
    private String transactionId;
    private String sender;
    private double amount;

    public Transfer(String transactionId, String sender, Double amount) {
        this.transactionId = transactionId;
        this.sender = sender;
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Double getAmount() {
        return amount;
    }
}

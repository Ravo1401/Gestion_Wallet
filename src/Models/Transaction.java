package Models;

import java.sql.Date;

public class Transaction {
    private String transactionId;
    private Date date;
    private String description;
    private double amount;
    private TransactionType type;
}

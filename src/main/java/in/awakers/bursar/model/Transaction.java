package in.awakers.bursar.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public abstract sealed class Transaction permits CreditTransaction, DebitTransaction
{
    private Integer transactionID;
    private LocalDate dateOfTransaction;
    private Float amount;
    private String category;
    private AccountType accountType;
}
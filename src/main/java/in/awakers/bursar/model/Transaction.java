package in.awakers.bursar.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public abstract class Transaction
{
    @Setter(AccessLevel.NONE)
    private final TransactionType transactionType;
    private Integer transactionID;
    private LocalDateTime dateOfTransaction;
    private Float amount;
    private String category;
    private AccountType accountType;
}
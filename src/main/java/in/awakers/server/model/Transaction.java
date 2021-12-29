package in.awakers.server.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Transaction
{
    @Setter(AccessLevel.NONE)
    private final TransactionType transactionType;

    private Integer transactionID;

    @NotNull(message = "{transaction.dateOfTransaction.notNull}")
    @PastOrPresent(message = "{transaction.dateOfTransaction.notFuture}")
    private LocalDateTime dateOfTransaction;

    @NotNull(message = "{transaction.amount.notNull}")
    @Positive(message = "{transaction.amount.positive}")
    private Float amount;

    private String category;

    @NotNull(message = "{transaction.accountType.notNull}")
    private AccountType accountType;
}
package in.awakers.server.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public abstract class Transaction
{
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
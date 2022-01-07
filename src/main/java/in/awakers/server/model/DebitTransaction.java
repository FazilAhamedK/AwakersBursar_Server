package in.awakers.server.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Getter
@Setter
@SuperBuilder
public final class DebitTransaction extends Transaction
{
    private final TransactionType transactionType = TransactionType.DEBIT;

    private Set<String> particulars;
}
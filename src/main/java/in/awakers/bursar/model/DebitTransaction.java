package in.awakers.bursar.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public final class DebitTransaction extends Transaction
{
    public static final TransactionType TRANSACTION_TYPE = TransactionType.DEBIT;

    private Set<String> particulars;
}
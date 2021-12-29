package in.awakers.server.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
public final class DebitTransaction extends Transaction
{
    private Set<String> particulars;

    @Builder
    public DebitTransaction(Integer transactionID, LocalDateTime dateOfTransaction, Float amount,
                            String category, AccountType accountType, Set<String> particulars)
    {
        super(TransactionType.DEBIT, transactionID, dateOfTransaction, amount, category,
              accountType);

        this.particulars = particulars;
    }
}
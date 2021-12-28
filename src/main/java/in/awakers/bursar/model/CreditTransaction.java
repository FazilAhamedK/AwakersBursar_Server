package in.awakers.bursar.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public final class CreditTransaction extends Transaction
{
    private String payorName;
    private String payorEmail;
    private TransactionStatus transactionStatus;
    private String verifiedBy;
    private LocalDateTime verifiedOn;

    @Builder
    public CreditTransaction(Integer transactionID, LocalDateTime dateOfTransaction, Float amount,
                             String category, AccountType accountType, String payorName,
                             String payorEmail, TransactionStatus transactionStatus,
                             String verifiedBy, LocalDateTime verifiedOn)
    {
        super(TransactionType.CREDIT, transactionID, dateOfTransaction, amount, category,
              accountType);

        this.payorName = payorName;
        this.payorEmail = payorEmail;
        this.transactionStatus = transactionStatus;
        this.verifiedBy = verifiedBy;
        this.verifiedOn = verifiedOn;
    }
}
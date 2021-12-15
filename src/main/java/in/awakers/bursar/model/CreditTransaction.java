package in.awakers.bursar.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public final class CreditTransaction extends Transaction
{
    public static final TransactionType TRANSACTION_TYPE = TransactionType.CREDIT;

    private String payorName;
    private String payorEmail;
    private TransactionStatus transactionStatus;
    private String verifiedBy;
    private LocalDateTime verifiedOn;
}
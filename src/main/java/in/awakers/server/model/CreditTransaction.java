package in.awakers.server.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public final class CreditTransaction extends Transaction
{
    private final TransactionType transactionType = TransactionType.CREDIT;

    private String payorName;
    private String payorEmail;
    private TransactionStatus transactionStatus;
    private String verifiedBy;
    private LocalDateTime verifiedOn;
}
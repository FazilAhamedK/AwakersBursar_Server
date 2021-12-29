package in.awakers.server.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
public final class CreditTransaction extends Transaction
{
    @NotBlank(message = "{transaction.payorName.notBlank}")
    private String payorName;

    @Email(message = "{transaction.payorEmail.invalid}")
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
package in.awakers.bursar.entity;

import in.awakers.bursar.model.AccountType;
import in.awakers.bursar.model.TransactionStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CREDIT_TRANSACTIONS")
@Getter
@Setter
public class CreditTransactionEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private Integer transactionID;

    private LocalDateTime dateOfTransaction;
    private String payorName;
    private String payorEmail;
    private Float amount;
    private String category;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    private String verifiedBy;
    private LocalDateTime verifiedOn;
}
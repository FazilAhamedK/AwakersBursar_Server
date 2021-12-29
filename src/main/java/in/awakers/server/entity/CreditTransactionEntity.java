package in.awakers.server.entity;

import in.awakers.server.model.AccountType;
import in.awakers.server.model.TransactionStatus;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CREDIT_TRANSACTIONS")
@DynamicInsert
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
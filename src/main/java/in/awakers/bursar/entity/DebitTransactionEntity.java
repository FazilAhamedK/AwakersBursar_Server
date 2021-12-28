package in.awakers.bursar.entity;

import in.awakers.bursar.model.AccountType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "DEBIT_TRANSACTIONS")
@Getter
@Setter
public class DebitTransactionEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private Integer transactionID;

    private LocalDateTime dateOfTransaction;
    private String category;

    @Transient
    private Set<String> particulars;

    private Float amount;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;
}
package in.awakers.bursar.entity;

import in.awakers.bursar.model.AccountType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
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

    private LocalDate dateOfTransaction;
    private String category;
    private Set<String> particulars;
    private Float amount;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;
}
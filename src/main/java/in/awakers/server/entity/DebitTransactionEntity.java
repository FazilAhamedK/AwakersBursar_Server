package in.awakers.server.entity;

import in.awakers.server.model.AccountType;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "DEBIT_TRANSACTIONS")
@DynamicInsert
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
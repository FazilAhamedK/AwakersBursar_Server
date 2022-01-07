package in.awakers.server.entity;

import in.awakers.server.model.AccountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class TransactionEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private Integer transactionID;

    private LocalDateTime dateOfTransaction;
    private Float amount;
    private String category;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;
}
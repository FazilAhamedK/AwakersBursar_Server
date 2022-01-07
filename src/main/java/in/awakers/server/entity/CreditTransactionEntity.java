package in.awakers.server.entity;

import in.awakers.server.model.TransactionStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "CREDIT_TRANSACTIONS")
@DynamicInsert
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class CreditTransactionEntity extends TransactionEntity
{
    private String payorName;
    private String payorEmail;

    @Enumerated(EnumType.STRING)
    private TransactionStatus transactionStatus;

    private String verifiedBy;
    private LocalDateTime verifiedOn;
}
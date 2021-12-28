package in.awakers.bursar.mapper;

import in.awakers.bursar.entity.CreditTransactionEntity;
import in.awakers.bursar.entity.DebitTransactionEntity;
import in.awakers.bursar.model.CreditTransaction;
import in.awakers.bursar.model.DebitTransaction;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TransactionMapper
{
    public static CreditTransaction toDTO(CreditTransactionEntity creditTransactionEntity)
    {
        return CreditTransaction.builder().transactionID(creditTransactionEntity.getTransactionID())
                                .dateOfTransaction(creditTransactionEntity.getDateOfTransaction())
                                .amount(creditTransactionEntity.getAmount())
                                .category(creditTransactionEntity.getCategory())
                                .accountType(creditTransactionEntity.getAccountType())
                                .payorName(creditTransactionEntity.getPayorName())
                                .payorEmail(creditTransactionEntity.getPayorEmail())
                                .transactionStatus(creditTransactionEntity.getTransactionStatus())
                                .verifiedBy(creditTransactionEntity.getVerifiedBy())
                                .verifiedOn(creditTransactionEntity.getVerifiedOn()).build();
    }

    public static DebitTransaction toDTO(DebitTransactionEntity debitTransactionEntity)
    {
        return DebitTransaction.builder().transactionID(debitTransactionEntity.getTransactionID())
                               .dateOfTransaction(debitTransactionEntity.getDateOfTransaction())
                               .amount(debitTransactionEntity.getAmount())
                               .category(debitTransactionEntity.getCategory())
                               .accountType(debitTransactionEntity.getAccountType())
                               .particulars(debitTransactionEntity.getParticulars()).build();
    }
}
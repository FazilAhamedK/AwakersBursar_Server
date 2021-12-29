package in.awakers.server.mapper;

import in.awakers.server.entity.CreditTransactionEntity;
import in.awakers.server.entity.DebitTransactionEntity;
import in.awakers.server.model.CreditTransaction;
import in.awakers.server.model.DebitTransaction;
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

    public static CreditTransactionEntity toEntity(CreditTransaction creditTransaction)
    {
        return CreditTransactionEntity.builder()
                                      .dateOfTransaction(creditTransaction.getDateOfTransaction())
                                      .payorName(creditTransaction.getPayorName())
                                      .payorEmail(creditTransaction.getPayorEmail())
                                      .amount(creditTransaction.getAmount())
                                      .category(creditTransaction.getCategory())
                                      .accountType(creditTransaction.getAccountType()).build();
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

    public static DebitTransactionEntity toEntity(DebitTransaction debitTransaction)
    {
        return DebitTransactionEntity.builder()
                                     .dateOfTransaction(debitTransaction.getDateOfTransaction())
                                     .amount(debitTransaction.getAmount())
                                     .category(debitTransaction.getCategory())
                                     .accountType(debitTransaction.getAccountType())
                                     .particulars(debitTransaction.getParticulars()).build();
    }
}
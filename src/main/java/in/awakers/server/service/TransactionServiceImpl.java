package in.awakers.server.service;

import in.awakers.server.entity.CreditTransactionEntity;
import in.awakers.server.entity.DebitTransactionEntity;
import in.awakers.server.exception.ExceptionConstants;
import in.awakers.server.exception.NotFoundException;
import in.awakers.server.mapper.TransactionMapper;
import in.awakers.server.model.CreditTransaction;
import in.awakers.server.model.DebitTransaction;
import in.awakers.server.model.Transaction;
import in.awakers.server.repository.CreditTransactionRepository;
import in.awakers.server.repository.DebitTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service("transactionService")
public class TransactionServiceImpl implements TransactionService
{
    @Autowired
    private CreditTransactionRepository creditTransactionRepository;

    @Autowired
    private DebitTransactionRepository debitTransactionRepository;

    @Override
    public List<Transaction> getAllTransactions() throws NotFoundException
    {
        List<Transaction> transactions = new ArrayList<>();
        transactions.addAll(getAllCreditTransactions());
        transactions.addAll(getAllDebitTransactions());

        if(transactions.isEmpty())
        {
            throw new NotFoundException(ExceptionConstants.NO_TRANSACTIONS_FOUND);
        }
        else
        {
            return transactions;
        }
    }

    @Override
    public void addATransaction(CreditTransaction creditTransaction)
    {
        creditTransactionRepository.save(TransactionMapper.toEntity(creditTransaction));
    }

    @Override
    public void addATransaction(DebitTransaction debitTransaction)
    {
        debitTransactionRepository.save(TransactionMapper.toEntity(debitTransaction));
    }

    private List<CreditTransaction> getAllCreditTransactions()
    {
        Iterable<CreditTransactionEntity> creditTransactionEntityIterable =
                creditTransactionRepository.findAll();

        return StreamSupport.stream(creditTransactionEntityIterable.spliterator(), true)
                            .map(TransactionMapper::toDTO).toList();
    }

    private List<DebitTransaction> getAllDebitTransactions()
    {
        Iterable<DebitTransactionEntity> debitTransactionEntityIterable =
                debitTransactionRepository.findAll();

        return StreamSupport.stream(debitTransactionEntityIterable.spliterator(), true)
                            .map(TransactionMapper::toDTO).toList();
    }
}
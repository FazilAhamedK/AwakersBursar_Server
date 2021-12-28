package in.awakers.bursar.service;

import in.awakers.bursar.entity.CreditTransactionEntity;
import in.awakers.bursar.entity.DebitTransactionEntity;
import in.awakers.bursar.exception.ExceptionConstants;
import in.awakers.bursar.exception.NotFoundException;
import in.awakers.bursar.mapper.TransactionMapper;
import in.awakers.bursar.model.CreditTransaction;
import in.awakers.bursar.model.DebitTransaction;
import in.awakers.bursar.model.Transaction;
import in.awakers.bursar.repository.CreditTransactionRepository;
import in.awakers.bursar.repository.DebitTransactionRepository;
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
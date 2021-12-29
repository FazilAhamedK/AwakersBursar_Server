package in.awakers.server.service;

import in.awakers.server.exception.NotFoundException;
import in.awakers.server.model.CreditTransaction;
import in.awakers.server.model.DebitTransaction;
import in.awakers.server.model.Transaction;

import java.util.List;

public interface TransactionService
{
    List<Transaction> getAllTransactions() throws NotFoundException;

    void addATransaction(CreditTransaction creditTransaction);

    void addATransaction(DebitTransaction debitTransaction);
}
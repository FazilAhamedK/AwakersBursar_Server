package in.awakers.bursar.service;

import in.awakers.bursar.exception.NotFoundException;
import in.awakers.bursar.model.Transaction;

import java.util.List;

public interface TransactionService
{
    List<Transaction> getAllTransactions() throws NotFoundException;
}
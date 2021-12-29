package in.awakers.server.api;

import in.awakers.server.exception.NotFoundException;
import in.awakers.server.model.CreditTransaction;
import in.awakers.server.model.DebitTransaction;
import in.awakers.server.model.Transaction;
import in.awakers.server.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Transactions")
public class TransactionAPI
{
    @Autowired
    private TransactionService transactionService;

    @GetMapping("all")
    public ResponseEntity<List<Transaction>> getAllTransactions() throws NotFoundException
    {
        List<Transaction> transactions = transactionService.getAllTransactions();

        return new ResponseEntity<>(transactions, HttpStatus.OK);
    }

    @PostMapping("add/credit")
    public void addATransaction(@Valid @RequestBody CreditTransaction creditTransaction)
    {
        transactionService.addATransaction(creditTransaction);
    }

    @PostMapping("add/debit")
    public void addATransaction(@Valid @RequestBody DebitTransaction debitTransaction)
    {
        transactionService.addATransaction(debitTransaction);
    }
}
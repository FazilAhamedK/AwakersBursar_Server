package in.awakers.server.repository;

import in.awakers.server.entity.CreditTransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface CreditTransactionRepository
        extends CrudRepository<CreditTransactionEntity, Integer>
{
}
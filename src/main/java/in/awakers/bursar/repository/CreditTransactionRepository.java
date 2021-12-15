package in.awakers.bursar.repository;

import in.awakers.bursar.entity.CreditTransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface CreditTransactionRepository extends CrudRepository<CreditTransactionEntity, Integer>
{ }
package in.awakers.bursar.repository;

import in.awakers.bursar.entity.DebitTransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface DebitTransactionRepository extends CrudRepository<DebitTransactionEntity, Integer>
{ }
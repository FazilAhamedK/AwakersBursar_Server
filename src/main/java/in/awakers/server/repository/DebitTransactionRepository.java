package in.awakers.server.repository;

import in.awakers.server.entity.DebitTransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface DebitTransactionRepository extends CrudRepository<DebitTransactionEntity, Integer>
{
}
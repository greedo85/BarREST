package barrest.repository;

import barrest.model.BarOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarOrderRepository extends JpaRepository<BarOrder, Integer> {
}

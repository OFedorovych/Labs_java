package ua.lviv.iot.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.iot.Good;

public interface GoodOrderRepository extends JpaRepository<Good, Integer> {

}

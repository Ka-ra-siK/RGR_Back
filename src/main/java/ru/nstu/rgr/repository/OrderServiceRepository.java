package ru.nstu.rgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.rgr.model.OrderService;

@Repository
public interface OrderServiceRepository extends JpaRepository<OrderService, Long> {
}

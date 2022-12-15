package ru.nstu.rgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.rgr.model.Clients;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long> {
}

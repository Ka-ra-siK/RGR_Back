package ru.nstu.rgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.rgr.model.Masters;

@Repository
public interface MastersRepository extends JpaRepository<Masters, Long> {
}

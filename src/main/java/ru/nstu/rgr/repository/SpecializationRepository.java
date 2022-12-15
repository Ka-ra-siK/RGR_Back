package ru.nstu.rgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.rgr.model.Specialization;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
}

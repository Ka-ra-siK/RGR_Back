package ru.nstu.rgr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nstu.rgr.model.Materials;

@Repository
public interface MaterialsRepository extends JpaRepository<Materials, Long> {
}

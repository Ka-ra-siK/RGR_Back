package ru.nstu.rgr.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ru.nstu.rgr.model.OrderService;
import ru.nstu.rgr.model.Specialization;
import ru.nstu.rgr.repository.SpecializationRepository;

@Service
@RequiredArgsConstructor
public class SpecializationService extends BasePersistentService<Specialization>{

    @Getter(AccessLevel.PROTECTED)
    private final SpecializationRepository repo;

    public Specialization edit(Long id, Specialization specialization){
        if (id == null){
            return null;
        }
        Specialization specializationFromDb = repo.findById(id).orElse(null);
        if (specializationFromDb == null) return null;
        BeanUtils.copyProperties(specialization, specializationFromDb, "id");
        return repo.save(specializationFromDb);
    }
}

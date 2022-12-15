package ru.nstu.rgr.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ru.nstu.rgr.model.Materials;
import ru.nstu.rgr.model.MovingInformation;
import ru.nstu.rgr.repository.MaterialsRepository;
import ru.nstu.rgr.repository.MovingInformationRepository;

@Service
@RequiredArgsConstructor
public class MovingInformationService extends BasePersistentService<MovingInformation> {

    @Getter(AccessLevel.PROTECTED)
    private final MovingInformationRepository repo;

    public MovingInformation edit(Long id, MovingInformation movingInformation){
        if (id == null){
            return null;
        }
        MovingInformation movingInformationFromDb = repo.findById(id).orElse(null);
        if (movingInformationFromDb == null) return null;
        BeanUtils.copyProperties(movingInformation, movingInformationFromDb, "id");
        return repo.save(movingInformationFromDb);
    }
}

package ru.nstu.rgr.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ru.nstu.rgr.model.Materials;
import ru.nstu.rgr.repository.MaterialsRepository;

@Service
@RequiredArgsConstructor
public class MaterialsService extends BasePersistentService<Materials>{

    @Getter(AccessLevel.PROTECTED)
    private final MaterialsRepository repo;

    public Materials edit(Long id, Materials materials){
        if (id == null){
            return null;
        }
        Materials materialsFromDb = repo.findById(id).orElse(null);
        if (materialsFromDb == null) return null;
        BeanUtils.copyProperties(materials, materialsFromDb, "id");
        return repo.save(materialsFromDb);
    }
}

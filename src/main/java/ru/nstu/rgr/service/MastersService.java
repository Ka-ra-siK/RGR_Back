package ru.nstu.rgr.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ru.nstu.rgr.model.Clients;
import ru.nstu.rgr.model.Masters;
import ru.nstu.rgr.repository.MastersRepository;

@Service
@RequiredArgsConstructor
public class MastersService extends BasePersistentService<Masters>{

    @Getter(AccessLevel.PROTECTED)
    private final MastersRepository repo;

    public Masters edit(Long id, Masters master) {
        if (id == null) {
            return null;
        }
        Masters masterFromDb = repo.findById(id).orElse(null);
        if (masterFromDb == null) return null;
        BeanUtils.copyProperties(master, masterFromDb, "id");
        return repo.save(masterFromDb);
    }

}

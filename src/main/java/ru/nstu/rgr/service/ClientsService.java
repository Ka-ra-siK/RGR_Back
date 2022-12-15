package ru.nstu.rgr.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ru.nstu.rgr.model.Clients;
import ru.nstu.rgr.repository.ClientsRepository;

@Service
@RequiredArgsConstructor
public class ClientsService extends BasePersistentService<Clients>{

    @Getter(AccessLevel.PROTECTED)
    private final ClientsRepository repo;

    public Clients edit(Long id, Clients client) {
        if (id == null) {
            return null;
        }
        Clients clientFromDb = repo.findById(id).orElse(null);
        if (clientFromDb == null) return null;
        BeanUtils.copyProperties(client, clientFromDb, "id");
        return repo.save(clientFromDb);
    }
}

package ru.nstu.rgr.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ru.nstu.rgr.model.OrderService;
import ru.nstu.rgr.repository.OrderServiceRepository;

@Service
@RequiredArgsConstructor
public class OrderServiceService extends BasePersistentService<OrderService>{

    @Getter(AccessLevel.PROTECTED)
    private final OrderServiceRepository repo;

    public OrderService edit(Long id, OrderService orderService){
        if (id == null){
            return null;
        }
        OrderService orderServiceFromDb = repo.findById(id).orElse(null);
        if (orderServiceFromDb == null) return null;
        BeanUtils.copyProperties(orderService, orderServiceFromDb, "id");
        return repo.save(orderServiceFromDb);
    }
}

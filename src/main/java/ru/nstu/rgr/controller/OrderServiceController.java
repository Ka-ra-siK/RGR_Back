package ru.nstu.rgr.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nstu.rgr.model.OrderService;
import ru.nstu.rgr.service.OrderServiceService;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderServiceController {
    private final OrderServiceService orderService;

    @ApiOperation("Receive all orderService")
    @GetMapping
    public List<OrderService> getAllOrderServices() {
        return orderService.findAll();
    }

    @ApiOperation("Create a orderService")
    @PostMapping
    public OrderService create(@RequestBody OrderService OrderService){
        return orderService.save(OrderService);
    }

    @ApiOperation("Edit a orderService")
    @PutMapping("/{id}")
    public OrderService edit(@PathVariable Long id, @RequestBody OrderService OrderService){
        return orderService.edit(id, OrderService);
    }

    @ApiOperation("Delete a OrderService")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        orderService.delete(id);
    }
}

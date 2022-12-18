package ru.nstu.rgr.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nstu.rgr.model.Clients;
import ru.nstu.rgr.service.ClientsService;
import java.util.List;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientsController {
    private final ClientsService clientsService;

    @ApiOperation("Receive all clients")
    @GetMapping
    public List<Clients> getAllClients() {
        return clientsService.findAll();
    }

    @ApiOperation("Create a client")
    @PostMapping
    public Clients create(@RequestBody Clients client){
        return clientsService.save(client);
    }

    @ApiOperation("Edit a client")
    @PutMapping("/{id}")
    public Clients edit(@PathVariable Long id, @RequestBody Clients client){
        return clientsService.edit(id, client);
    }

    @ApiOperation("Delete a client")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        clientsService.delete(id);
    }
}

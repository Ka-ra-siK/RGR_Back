package ru.nstu.rgr.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nstu.rgr.model.Masters;
import ru.nstu.rgr.service.MastersService;

import java.util.List;

@RestController
@RequestMapping("/master")
@RequiredArgsConstructor
public class MastersController {
    private final MastersService masterService;

    @ApiOperation("Receive all masters")
    @GetMapping
    public List<Masters> getAllMasters() {
        return masterService.findAll();
    }

    @ApiOperation("Create a master")
    @PostMapping
    public Masters create(@RequestBody Masters master){
        return masterService.save(master);
    }

    @ApiOperation("Edit a master")
    @PutMapping("/{id}")
    public Masters edit(@PathVariable Long id, @RequestBody Masters master){
        return masterService.edit(id, master);
    }

    @ApiOperation("Delete a master")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        masterService.delete(id);
    }
}

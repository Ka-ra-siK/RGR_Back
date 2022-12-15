package ru.nstu.rgr.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nstu.rgr.model.Specialization;
import ru.nstu.rgr.service.SpecializationService;

import java.util.List;

@RestController
@RequestMapping("/specialization")
@RequiredArgsConstructor
public class SpecializationController {
    private final SpecializationService specializationService;

    @ApiOperation("Receive all specialization")
    @GetMapping
    public List<Specialization> getAllmovingInformations() {
        return specializationService.findAll();
    }

    @ApiOperation("Create a specialization")
    @PostMapping
    public Specialization create(@RequestBody Specialization specialization){
        return specializationService.save(specialization);
    }

    @ApiOperation("Edit a specialization")
    @PutMapping("/{id}")
    public Specialization edit(@PathVariable Long id, @RequestBody Specialization specialization){
        return specializationService.edit(id, specialization);
    }

    @ApiOperation("Delete a specialization")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        specializationService.delete(id);
    }
}

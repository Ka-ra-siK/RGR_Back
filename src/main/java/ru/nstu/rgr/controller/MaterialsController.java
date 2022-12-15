package ru.nstu.rgr.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nstu.rgr.model.Materials;
import ru.nstu.rgr.service.MaterialsService;

import java.util.List;

@RestController
@RequestMapping("/material")
@RequiredArgsConstructor
public class MaterialsController {

    private final MaterialsService materialService;

    @ApiOperation("Receive all Materials")
    @GetMapping
    public List<Materials> getAllMaterials() {
        return materialService.findAll();
    }

    @ApiOperation("Create a material")
    @PostMapping
    public Materials create(@RequestBody Materials material){
        return materialService.save(material);
    }

    @ApiOperation("Edit a material")
    @PutMapping("/{id}")
    public Materials edit(@PathVariable Long id, @RequestBody Materials material){
        return materialService.edit(id, material);
    }

    @ApiOperation("Delete a material")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        materialService.delete(id);
    }
}

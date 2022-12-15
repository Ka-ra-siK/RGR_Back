package ru.nstu.rgr.controller;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nstu.rgr.model.MovingInformation;
import ru.nstu.rgr.service.MovingInformationService;

import java.util.List;

@RestController
@RequestMapping("/moving_information")
@RequiredArgsConstructor
public class MovingInformationController {
    private final MovingInformationService movingInformationService;

    @ApiOperation("Receive all movingInformations")
    @GetMapping
    public List<MovingInformation> getAllmovingInformations() {
        return movingInformationService.findAll();
    }

    @ApiOperation("Create a movingInformation")
    @PostMapping
    public MovingInformation create(@RequestBody MovingInformation movingInformation){
        return movingInformationService.save(movingInformation);
    }

    @ApiOperation("Edit a movingInformation")
    @PutMapping("/{id}")
    public MovingInformation edit(@PathVariable Long id, @RequestBody MovingInformation movingInformation){
        return movingInformationService.edit(id, movingInformation);
    }

    @ApiOperation("Delete a movingInformation")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        movingInformationService.delete(id);
    }
}

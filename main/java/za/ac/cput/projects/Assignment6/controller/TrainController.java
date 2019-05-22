package za.ac.cput.projects.Assignment6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Assignment6.domain.Train;
import za.ac.cput.projects.Assignment6.domain.TrainStaion;
import za.ac.cput.projects.Assignment6.services.TrainStnServices;

import java.util.Set;

@RestController
@RequestMapping("/MetroFail/Trains")
public class TrainController {

    @Autowired
    @Qualifier("ServiceImpl")
    private TrainStnServices service;

    @PostMapping("/create")
    @ResponseBody
    public TrainStaion create(TrainStaion train) {
        return service.create(train);
    }

    @PostMapping("/update")
    @ResponseBody
    public Train  update(Train train) {
        return service.update(train);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Train  read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Train > getAll() {
        return service.getAll();
    }

}

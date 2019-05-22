package za.ac.cput.projects.Assignment6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.projects.Assignment6.domain.Fare;
import za.ac.cput.projects.Assignment6.domain.Train;
import za.ac.cput.projects.Assignment6.services.FareServices;

import java.util.Set;

@RestController
@RequestMapping("/MetroFail/Fare")
public class FareController {

    @Autowired
    @Qualifier("ServiceImpl")
    private FareServices service;

    @PostMapping("/create")
    @ResponseBody
    public Fare create(Fare  fare) {
        return service.create(fare);
    }

    @PostMapping("/update")
   // @ResponseBody
    //public Train update(Fare  fare) {
        //return service.update(fare);
    //}

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Fare  read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Fare > getAll() {
        return service.getAll();
    }


}

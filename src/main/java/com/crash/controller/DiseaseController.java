package com.crash.controller;

import com.crash.model.Disease;
import com.crash.services.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disease")
public class DiseaseController {

  @Autowired
  DiseaseService diseaseService;


    @PostMapping("/save-disease")
    public Disease saveDisease(@RequestBody Disease disease) {

        return diseaseService.saveDisease(disease);
    }

    @GetMapping("/get-all")
    public List<Disease> getAll() {
        return diseaseService.getAllDiseases();
    }

    @GetMapping("/get-by-Id/{id}")
    public Disease getByID(@PathVariable Integer id) {
        return diseaseService.getById(id);
    }

    @PostMapping("delete-by-id/{id}")
    public void deleteByID(@PathVariable Integer id) {
        diseaseService.deleteById(id);
    }

}

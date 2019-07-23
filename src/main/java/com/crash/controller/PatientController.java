package com.crash.controller;

import java.util.List;
import com.crash.services.PatientService;
import com.crash.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/save-patient")
    public Patient savePatient(@RequestBody Patient patient){
        return patientService.savePatient(patient);
    }


    @GetMapping("/get-all")
    public List<Patient> getAll(){
        return patientService.getAllPatients();
    }

    @GetMapping("/get-by-id/{id}")
    public Patient getById(@PathVariable Integer id){
        return patientService.getById(id);
    }

    @PostMapping("delete-by-id/{id}")
    public void deleteById(@PathVariable Integer id){
        patientService.deleteById(id);
    }


}

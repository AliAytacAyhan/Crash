package com.crash.controller;

import com.crash.model.Doctor;
import com.crash.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired//servisleri inject etmemizi sağlıyor
            DoctorService doctorService;//doctor servisi dahil etmiş olduk

    @PostMapping("/save-doctor") //input olarak doctor classından doctor alıyor
    public Doctor saveDoctor(@RequestBody Doctor doctor) {

        return doctorService.saveDoctor(doctor);
    }

    @GetMapping("/get-all")
    public List<Doctor> getAll() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/get-by-Id/{id}")
    public Doctor getByID(@PathVariable Integer id) {
        return doctorService.getById(id);
    }

    @PostMapping("delete-by-id/{id}")
    public void deleteByID(@PathVariable Integer id) {
        doctorService.deleteById(id);
    }

}

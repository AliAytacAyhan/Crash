package com.crash.services;

import com.crash.model.Doctor;

import java.util.List;

public interface DoctorService {
    //service ler ınterface dir
    Doctor saveDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();

    Doctor getById(Integer id);

    void deleteById(Integer id);
}

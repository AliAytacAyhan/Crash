package com.crash.services;

import com.crash.model.Doctor;
import com.crash.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getById(Integer id) {
        Optional<Doctor> opt = doctorRepository.findById(id);
        Doctor d = new Doctor();
        if (opt.isPresent()) {
            d = opt.get();
        }
        return d;
    }

    @Override
    public void deleteById(Integer id) {

        doctorRepository.deleteById(id);

    }
}
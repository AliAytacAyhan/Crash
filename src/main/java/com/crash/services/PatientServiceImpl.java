package com.crash.services;

import com.crash.model.Patient;
import com.crash.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{

    @Autowired
    PatientRepository patientRepository;

    @Override
    public Patient savePatient(Patient patient){
        return  patientRepository.save(patient);
    }

   @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getById(Integer id) {
        Optional<Patient> opt = patientRepository.findById(id);
        Patient d = new Patient();
        if (opt.isPresent()) {
            d = opt.get();
        }
        return d;
    }

    public void deleteById(Integer id) {

        patientRepository.deleteById(id);

    }

}

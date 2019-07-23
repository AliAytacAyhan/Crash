package com.crash.services;
import com.crash.model.Patient;

import java.util.List;


public interface PatientService {

    Patient savePatient(Patient patient);

    List<Patient> getAllPatients();

    Patient getById(Integer id);

    void deleteById(Integer id);
}

package com.crash.services;

import com.crash.model.Disease;
import com.crash.repository.DiseaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DiseaseServiceImpl implements DiseaseService {

    @Autowired
    DiseaseRepository diseaseRepository;

    @Override
    public Disease saveDisease(Disease disease){
        return  diseaseRepository.save(disease);
    }

    @Override
    public List<Disease> getAllDiseases() {
        return null;
    }

    @Override
    public Disease getById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}

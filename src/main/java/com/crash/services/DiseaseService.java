package com.crash.services;

import com.crash.model.Disease;

import java.util.List;

public interface DiseaseService  {


    Disease saveDisease(Disease disease);

    List<Disease> getAllDiseases();

    Disease getById(Integer id);

    void deleteById(Integer id);
}



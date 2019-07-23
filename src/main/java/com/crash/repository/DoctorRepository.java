package com.crash.repository;

import com.crash.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

//burda hazır sql cümleleri dışında kullanacağımız hql komutlarını yazacapız
    //veritabanından veri alma işlemleri bu interface üzerinden gerçekleşir
    //repositoryler interfacedir ve JpaRepository interfaceini extend ederler
}

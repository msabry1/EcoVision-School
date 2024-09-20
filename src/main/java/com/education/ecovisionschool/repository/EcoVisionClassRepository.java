package com.education.ecovisionschool.repository;

import com.education.ecovisionschool.model.EcoVisionClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EcoVisionClassRepository extends JpaRepository<EcoVisionClass, Integer> {

}

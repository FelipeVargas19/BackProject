package com.example.project.repository;

import com.example.project.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("serviceRepository")
public interface ServiceRepository extends JpaRepository <Services, Long> {
}

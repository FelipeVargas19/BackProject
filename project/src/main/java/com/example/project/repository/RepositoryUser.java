package com.example.project.repository;

import com.example.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Metodos que ya estan definidos podemos implementarlos
@Repository("repositoryUser")
public interface RepositoryUser extends JpaRepository<User, String> {
    void deleteById(String USER_ID);
}

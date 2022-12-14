package com.example.project.repository;

import com.example.project.entity.UserServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository()
public interface UserServiceRepository extends JpaRepository <UserServices, Long> {

   @Query(value = "SELECT u.* FROM APP_DESCUENTOS_TELCO.USER_SERVICES u WHERE u.SERVICE_ID = ?1 and u.USER_ID = ?2", nativeQuery = true)
   Optional<UserServices> findByServiceIdAndUserId(Long service_id, String user_id);

}

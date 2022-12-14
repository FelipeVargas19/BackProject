package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Builder
@Table(name = "USER_SERVICES", schema = "APP_DESCUENTOS_TELCO")
@NoArgsConstructor
@AllArgsConstructor
public class UserServices implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "SERVICE_ID")
    private int serviceId;
    @Column(name = "FECHA_ADQUISICION")
    private LocalDate fechaAdquisicion;
}

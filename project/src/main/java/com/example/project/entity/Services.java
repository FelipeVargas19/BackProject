package com.example.project.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "SERVICES", schema = "APP_DESCUENTOS_TELCO")
public class Services implements Serializable {

    @Id
    private int SERVICE_ID;
    private String NOMBRE;
    private int VALOR;
}

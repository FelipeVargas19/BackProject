package com.example.project.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS", schema = "APP_DESCUENTOS_TELCO")
public class User implements Serializable {
    private String FIRTS_NAME;
    private String LAST_NAME;
    @Id
    private String USER_ID;
    private String TYPE_ID;
    private String PHONE_NUMBER;
    private String ADDRESS;
    private String AGE;

}

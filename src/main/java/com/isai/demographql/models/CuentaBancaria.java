package com.isai.demographql.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CuentaBancaria {

    @Id
    private String id;

    private Date fechaCreacion;

    private Double balance;

    private String divisa;

    @Enumerated(EnumType.STRING)
    private TipoCuenta tipoCuenta;
}

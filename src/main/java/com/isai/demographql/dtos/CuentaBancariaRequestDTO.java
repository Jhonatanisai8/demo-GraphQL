package com.isai.demographql.dtos;

import com.isai.demographql.models.TipoCuenta;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CuentaBancariaRequestDTO {

    private Double balance;

    private String divisa;

    private TipoCuenta tipoCuenta;
}

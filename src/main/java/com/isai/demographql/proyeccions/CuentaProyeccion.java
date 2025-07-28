package com.isai.demographql.proyeccions;

import com.isai.demographql.models.CuentaBancaria;
import com.isai.demographql.models.TipoCuenta;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = CuentaBancaria.class, name = "p1")
public interface CuentaProyeccion {
     String getId();

     TipoCuenta getTipoCuenta();

     Double getBalance();

     String getDivisas();

     String getFechaCreacion();
}

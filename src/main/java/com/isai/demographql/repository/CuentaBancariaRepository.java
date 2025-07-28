package com.isai.demographql.repository;


import com.isai.demographql.models.CuentaBancaria;
import com.isai.demographql.models.TipoCuenta;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface CuentaBancariaRepository {

    @RestResource(path = "/byType")
    List<CuentaBancaria> findByTipoCuenta(@Param("t") TipoCuenta tipoCuenta);

}

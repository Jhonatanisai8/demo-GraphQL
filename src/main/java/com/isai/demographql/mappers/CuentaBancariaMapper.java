package com.isai.demographql.mappers;

import com.isai.demographql.dtos.CuentaBancariaDTO;
import com.isai.demographql.models.CuentaBancaria;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CuentaBancariaMapper {
    public CuentaBancariaDTO fromCuentaBancaria(CuentaBancaria cuentaBancaria) {
        CuentaBancariaDTO cuentaBancariaDTO = new CuentaBancariaDTO();
        BeanUtils.copyProperties(cuentaBancaria, cuentaBancariaDTO);
        return cuentaBancariaDTO;
    }
}

package com.isai.demographql.mappers;

import com.isai.demographql.dtos.CuentaBancariaResponseDTO;
import com.isai.demographql.models.CuentaBancaria;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class CuentaBancariaMapper {
    public CuentaBancariaResponseDTO fromCuentaBancaria(CuentaBancaria cuentaBancaria) {
        CuentaBancariaResponseDTO cuentaBancariaResponseDTO = new CuentaBancariaResponseDTO();
        BeanUtils.copyProperties(cuentaBancaria, cuentaBancariaResponseDTO);
        return cuentaBancariaResponseDTO;
    }
}

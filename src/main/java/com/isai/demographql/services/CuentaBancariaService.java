package com.isai.demographql.services;

import com.isai.demographql.dtos.CuentaBancariaRequestDTO;
import com.isai.demographql.dtos.CuentaBancariaResponseDTO;
import com.isai.demographql.models.CuentaBancaria;

public interface CuentaBancariaService {

    CuentaBancariaResponseDTO addCuentaBancaria(CuentaBancariaRequestDTO cuentaBancariaRequestDTO);

    CuentaBancaria actualizarCuentaBancaria(CuentaBancaria cuentaBancariaBBDD, CuentaBancaria cuentaBancariaRequestDTO);
}

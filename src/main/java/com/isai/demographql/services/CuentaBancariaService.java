package com.isai.demographql.services;

import com.isai.demographql.dtos.CuentaBancariaRequestDTO;
import com.isai.demographql.dtos.CuentaBancariaResponseDTO;

public interface CuentaBancariaService {

    CuentaBancariaResponseDTO addCuentaBancaria(CuentaBancariaRequestDTO cuentaBancariaRequestDTO);

}

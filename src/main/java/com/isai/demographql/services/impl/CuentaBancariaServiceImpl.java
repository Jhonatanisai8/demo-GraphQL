package com.isai.demographql.services.impl;

import com.isai.demographql.dtos.CuentaBancariaRequestDTO;
import com.isai.demographql.dtos.CuentaBancariaResponseDTO;
import com.isai.demographql.mappers.CuentaBancariaMapper;
import com.isai.demographql.models.CuentaBancaria;
import com.isai.demographql.repository.CuentaBancariaRepository;
import com.isai.demographql.services.CuentaBancariaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class CuentaBancariaServiceImpl
        implements CuentaBancariaService {

    private final CuentaBancariaRepository cuentaBancariaRepository;

    private final CuentaBancariaMapper cuentaBancariaMapper;

    @Override
    public CuentaBancariaResponseDTO addCuentaBancaria(CuentaBancariaRequestDTO cuentaBancariaRequestDTO) {
        CuentaBancaria cuentaBancaria = CuentaBancaria.builder()
                .id(UUID.randomUUID().toString())
                .fechaCreacion(new Date())
                .divisa(cuentaBancariaRequestDTO.getDivisa())
                .balance(cuentaBancariaRequestDTO.getBalance())
                .tipoCuenta(cuentaBancariaRequestDTO.getTipoCuenta())
                .build();
        CuentaBancaria cuentaBancariaBBDD = cuentaBancariaRepository.save(cuentaBancaria);
        CuentaBancariaResponseDTO cuentaBancariaResponseDTO = cuentaBancariaMapper.fromCuentaBancaria(cuentaBancariaBBDD);
        return cuentaBancariaResponseDTO;
    }
}

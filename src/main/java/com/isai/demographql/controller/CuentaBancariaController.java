package com.isai.demographql.controller;

import com.isai.demographql.dtos.CuentaBancariaRequestDTO;
import com.isai.demographql.dtos.CuentaBancariaResponseDTO;
import com.isai.demographql.models.CuentaBancaria;
import com.isai.demographql.repository.CuentaBancariaRepository;
import com.isai.demographql.services.CuentaBancariaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/")
@RequiredArgsConstructor
public class CuentaBancariaController {

    private final CuentaBancariaService cuentaBancariaService;

    private final CuentaBancariaRepository cuentaBancariaRepository;

    @RequestMapping(path = "/cuentas-bancarias", method = RequestMethod.GET)
    public List<CuentaBancaria> listarCuentasBancarias() {
        return cuentaBancariaRepository.findAll();
    }

    @RequestMapping(path = "/cuentas-bancarias/{id}")
    public CuentaBancaria buscarCuentaBancaria(String id) {
        return cuentaBancariaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Cuenta %s no encontrada", id)));
    }

    @RequestMapping(method = RequestMethod.POST, path = "/cuentas-bancarias")
    public CuentaBancariaResponseDTO guardarCuentaBancaria(@RequestBody CuentaBancariaRequestDTO cuentaBancariaRequestDTO) {
        return cuentaBancariaService.addCuentaBancaria(cuentaBancariaRequestDTO);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/cuentas-bancarias/{id}")
    public CuentaBancaria actualizarCuentaBancaria(@PathVariable String id, CuentaBancaria cuentaBancariaRequestDTO) {
        CuentaBancaria cuentaBancariaBBDD = cuentaBancariaRepository.findById(id)
                .orElseThrow();
        cuentaBancariaBBDD = cuentaBancariaService.actualizarCuentaBancaria(cuentaBancariaBBDD, cuentaBancariaRequestDTO);
        return cuentaBancariaRepository.save(cuentaBancariaBBDD);
    }
}

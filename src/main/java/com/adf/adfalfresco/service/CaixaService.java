package com.adf.adfalfresco.service;

import com.adf.adfalfresco.model.Caixa;

import java.util.List;
import java.util.Optional;

public interface CaixaService {

    Caixa createCaixa(Caixa caixa);

    List<Caixa> listCaixas();

    Caixa listCaixasSingle(Long idCaixa);

    void deleteCaixa(Long idCaixa);
}

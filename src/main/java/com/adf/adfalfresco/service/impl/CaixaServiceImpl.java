package com.adf.adfalfresco.service.impl;

import com.adf.adfalfresco.model.Caixa;
import com.adf.adfalfresco.repository.CaixaRepository;
import com.adf.adfalfresco.service.CaixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaixaServiceImpl implements CaixaService {

    @Autowired
    private CaixaRepository caixaRepository;

    @Override
    public Caixa createCaixa(Caixa caixa){
        return caixaRepository.save(caixa);
    }

    @Override
    public List<Caixa> listCaixas(){
        return caixaRepository.findAll();
    }

    @Override
    public Caixa listCaixasSingle(Long idCaixa){
        Optional<Caixa> caixa = caixaRepository.findById(idCaixa);
        return caixa.get();
    }

    @Override
    public void deleteCaixa(Long id){
        this.caixaRepository.deleteById(id);
    }

}

package com.adf.adfalfresco.controller;

import com.adf.adfalfresco.model.Caixa;
import com.adf.adfalfresco.service.CaixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/caixa")
public class CaixaController {

    @Autowired
    private CaixaService caixaService;

    @PostMapping("/add")
    public Caixa addCaixa(@RequestBody Caixa caixa){
        return caixaService.createCaixa(caixa);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Caixa>> listCaixas(){
        List<Caixa> caixas = caixaService.listCaixas();
        return new ResponseEntity<>(caixas, HttpStatus.OK);
    }

    @GetMapping("/list/{idCaixa}")
    public ResponseEntity listCaixaSingle(@PathVariable("idCaixa") Long idCaixa){
        Caixa caixa = caixaService.listCaixasSingle(idCaixa);
        return new ResponseEntity(caixa, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{idCaixa}")
    public ResponseEntity deleteCaixa(@PathVariable("idCaixa") Long idCaixa){
        caixaService.deleteCaixa(idCaixa);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{idCaixa}")
    public Caixa updateCaixa(
            @PathVariable("idCaixa") Long idCaixa,
            @RequestBody Caixa caixa){
        return caixaService.createCaixa(caixa);
    }

}

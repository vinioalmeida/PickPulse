package br.com.fiap.pickpulse.conta;

import static org.springframework.http.HttpStatus.CREATED;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;



@RestController
@RequestMapping("conta")
public class ContaController {

    @Autowired
    ContaService service;

    @PostMapping
    @ResponseStatus(CREATED)
    public Conta cadastrar(@RequestBody @Valid Conta conta){
        return service.cadastrar(conta);

    }
    @GetMapping
    public List<Conta> buscarTodas(@RequestParam(required = false) String email){
        if (email == null) return service.buscarTodas();

        return service.buscarPorEmail(email);
    }

    @GetMapping("{id}") 
    public Conta buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public Conta encerrar(@PathVariable Long id){
        return service.encerrar(id);
    }

}
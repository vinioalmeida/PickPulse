package br.com.fiap.pickpulse.conta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service 
public class ContaService {
    
    @Autowired
    ContaRepository repository;

    public Conta cadastrar(Conta conta){
        return repository.save(conta);

    }

	public List<Conta> buscarTodas() {
		return repository.findAll();
	}

    public Conta buscarPorId(Long id) {
        return repository
        .findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public List<Conta> buscarPorEmail(String email) {
        return repository.findByEmail(email);
        
        
    }

    public Conta encerrar(Long id) {
        var conta = buscarPorId(id);
        conta.setAtiva(false);
        return repository.save(conta);
    }

}

package br.com.fiap.pickpulse.conta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long>{

    List<Conta> findByEmail(String email);
    
}

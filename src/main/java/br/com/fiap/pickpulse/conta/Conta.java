package br.com.fiap.pickpulse.conta;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity

public class Conta {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank 
    private String email;
    
    @NotBlank 
    private String senha;

    @PastOrPresent
    private LocalDate dataCriacao;
    
    private boolean ativa = true;
     
    @Pattern(regexp = "(administrador|usuario)")
    private String tipoConta;

}

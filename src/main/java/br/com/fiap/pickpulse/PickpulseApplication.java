package br.com.fiap.pickpulse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PickpulseApplication {

	public static void main(String[] args) {
		SpringApplication.run(PickpulseApplication.class, args);
	}

	@GetMapping
	public String home(){
		return "PickPulse - Kauan Guerreiro Carraro (RM 99891) " + 
							"Leonardo Matheus Mariano Guedes da Silva (RM 99824) " +  
							"Leonardo Shoiti Araki (RM 98587) " +
							"Thiago Martins Bezerra (RM 98644) " +
							"Vinicius Oliveira de Almeida (RM 97967)";
	}
	
}

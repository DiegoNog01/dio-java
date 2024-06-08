package service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping
	Endereco consultarCep(@PathVariable("cep") String cep);
}

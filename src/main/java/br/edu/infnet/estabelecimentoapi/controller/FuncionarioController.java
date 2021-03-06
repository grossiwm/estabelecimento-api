package br.edu.infnet.estabelecimentoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.estabelecimentoapi.model.domain.Funcionario;
import br.edu.infnet.estabelecimentoapi.model.service.FuncionarioService;


@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;

	@PostMapping
	public void incluir(@RequestBody Funcionario funcionario) {
		funcionarioService.incluir(funcionario);		
	}
	
	@GetMapping(value = "/{idEstabelecimento}/listar")
	public List<Funcionario> obterLista(@PathVariable Integer idEstabelecimento){
		return funcionarioService.obterLista(idEstabelecimento);
	}

}

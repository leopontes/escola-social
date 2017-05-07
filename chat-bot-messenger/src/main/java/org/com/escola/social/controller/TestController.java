package org.com.escola.social.controller;

import org.com.escola.social.beans.Teste;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/teste")
	public Teste teste(){
		
		Teste teste = new Teste();
		teste.setNome("Teste 123");
		teste.setDescricao("Rest teste...");
		
		return teste;
	}
}

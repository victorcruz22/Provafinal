package br.com.senai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.senai.model.Produto;
import br.com.senai.repository.ProdutoRepository;

@Controller
public class ProdutoController {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping("/produto")
	public String listaProdutos(Model model) {
		List<Produto> produtos = produtoRepository.findAll();
		model.addAttribute("nome", "Victor Cruz");
		return"produtos";
	}
	
}

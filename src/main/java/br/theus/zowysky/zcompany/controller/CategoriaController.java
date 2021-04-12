package br.theus.zowysky.zcompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.theus.zowysky.zcompany.Exception.RecursoNaoEncontradoException;
import br.theus.zowysky.zcompany.Service.CategoriaService;
import br.theus.zowysky.zcompany.domain.Categoria;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	public List<Categoria> lista(){
		List<Categoria> categorias = categoriaService.listar();  
		return categorias;
	}
	
	@GetMapping("/{codigo}")
	public Categoria buscarPorCodigo(@PathVariable Short codigo) {
		try { 
			Categoria categoria = categoriaService.buscarPorCodigo(codigo);
			return categoria;
	 }catch (RecursoNaoEncontradoException cavalo) { 
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada",null);
		}
		}
	
		
//	@PostMapping
//	public Categoria inserir(@RequestBody Categoria categoria) {
//		Categoria categoriaSalva = categoriaRepository.save(categoria);
//		return categoriaSalva;
//	}
//	
//	@DeleteMapping("/{codigo}")
//	public Optional<Categoria> excluir (@PathVariable Short codigo){
//		Optional<Categoria> categoria = categoriaRepository.findById(codigo);
//		categoriaRepository.delete(categoria.get());
//		return categoria;
//	}
//	@PutMapping
//	public Categoria editar(@RequestBody Categoria categoria) {
//		Categoria categoriaEditada = categoriaRepository.save(categoria);
//		return categoriaEditada;
//	}

}


package com.generation.blogpessoal1.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.generation.blogpessoal1.model.Usuario;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
    
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start(){

		usuarioRepository.deleteAll();

		usuarioRepository.save(new Usuario(0L, "Selena Marie Gomez", "selenagmez@gmail.com.br", "22071992", "https://i.pinimg.com/564x/b4/79/aa/b479aa60c4318c842e1f36e7cd071ff5.jpg"));
		
		usuarioRepository.save(new Usuario(0L, "Olivia Rodrigo", "oliviar.isa@hotmail.com", "20022003", "https://i.pinimg.com/564x/a4/32/dc/a432dccfb61b206a7c347837ffdff26b.jpg"));

        usuarioRepository.save(new Usuario(0L, "Jenna Marie Ortega", "jennamortega@gmail.com", "27092002", "https://i.pinimg.com/564x/18/a8/4d/18a84d012f87ff33d3a33d5b58ddf0e8.jpg"));

        usuarioRepository.save(new Usuario(0L, "Miley Rey Cyrus", "miley_cyrus@outlook.com", "23111992", "https://i.pinimg.com/564x/50/07/72/500772e7c3baa760436c2314b2d6708b.jpg"));
	}

	@Test
	@DisplayName("Retorna 1 usuario")
	public void deveRetornarUmUsuario() {

		Optional<Usuario> usuario = usuarioRepository.findByUsuario("selenagmez@gmail.com.br");

		assertTrue(usuario.get().getUsuario().equals("selenagmez@gmail.com.br"));
	}

	@Test
	@DisplayName("Retorna 3 usuarios")
	public void deveRetornarTresUsuarios() {

		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("A");

		assertEquals(3, listaDeUsuarios.size());
		
		assertTrue(listaDeUsuarios.get(0).getNome().equals("Selena Marie Gomez"));
		assertTrue(listaDeUsuarios.get(1).getNome().equals("Olivia Rodrigo"));
		assertTrue(listaDeUsuarios.get(2).getNome().equals("Jenna Marie Ortega"));
		
	}
	
	@AfterAll
	public void end() {
		usuarioRepository.deleteAll();
	}
	
}
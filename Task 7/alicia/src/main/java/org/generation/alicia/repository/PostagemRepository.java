package org.generation.alicia.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.generation.alicia.model.*;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

	public List<Postagem> findAllByUsuario(Usuario usuario);
	
	//public List<Postagem> findAllByUsuarioAndNome(Usuario usuario,String nome); **implementação a ser verificada com o professor
	
	public List<Postagem> findAllByTextoContainingIgnoreCase(String texto);
	
	public List<Postagem> findAllByTema(Tema tema);
	
}

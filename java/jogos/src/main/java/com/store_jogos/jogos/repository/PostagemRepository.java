package com.store_jogos.jogos.repository;

	import java.util.List;

	import org.springframework.data.jpa.repository.JpaRepository;

	import org.springframework.stereotype.Repository;

	import com.store_jogos.jogos.model.Postagem;

	 

	@Repository
	public interface PostagemRepository extends JpaRepository<Postagem, Long> {	
		public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); 

	}



package com.StoreGames.Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StoreGames.Games.model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
		public List<Tema> findAllByDescricaoContainingIgnoreCase (String genero);
}

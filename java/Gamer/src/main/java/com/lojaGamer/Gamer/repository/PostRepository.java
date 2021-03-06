package com.lojaGamer.Gamer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lojaGamer.Gamer.model.Postagem;


@Repository
public interface PostRepository extends JpaRepository<Postagem, Long> {	
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); 
}
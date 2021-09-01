package com.lojaGamer.Gamer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lojaGamer.Gamer.model.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {	
	public List<Post> findAllByTituloContainingIgnoreCase (String titulo); 
}
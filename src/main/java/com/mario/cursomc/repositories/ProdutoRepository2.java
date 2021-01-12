package com.mario.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mario.cursomc.domain.Produto;

@Repository
public interface ProdutoRepository2 extends JpaRepository<Produto, Integer>{

	
}

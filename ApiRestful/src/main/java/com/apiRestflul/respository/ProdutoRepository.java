package com.apiRestflul.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiRestflul.entities.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto,Long>{

}

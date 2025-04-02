package com.example.projeto_top.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto_top.model.JogadorModel;


public interface JogadorRepository extends JpaRepository<JogadorModel , Long> {

    JogadorModel findByNome(String nome);

    List<JogadorModel> findByClube(String clube);
    
    
    
}

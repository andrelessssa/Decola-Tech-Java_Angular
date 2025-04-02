package com.example.projeto_top.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto_top.model.JogadorModel;
import com.example.projeto_top.repository.JogadorRepository;

@Service
public class JogadorService {

    @Autowired
    JogadorRepository jogadorRepository;

    public JogadorModel save(JogadorModel jogadorModel){
        return jogadorRepository.save(jogadorModel);

    }
    public List<JogadorModel> findAll(){
        return jogadorRepository.findAll();
    }
    public JogadorModel findByNome(String nome){
        return jogadorRepository.findByNome(nome);
    }
    public List<JogadorModel> finByClube(String clube){
        return jogadorRepository.findByClube(clube);
    }
    
    
}

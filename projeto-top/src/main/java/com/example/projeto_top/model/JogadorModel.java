package com.example.projeto_top.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "jogadores")
public class JogadorModel  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer numeroCamisa;
    private String clube;
    private String posicao;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumeroCamisa() {
        return numeroCamisa;
    }
    public void setNumeroCamisa(Integer numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
    public String getClube() {
        return clube;
    }
    public void setClube(String clube) {
        this.clube = clube;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    

    

}

package com.insight.Prova.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_aluno")
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "apelido")
    private String nome;

    private String email;

    @Column (name = "data")
    private Integer idade;

    public Estudante() { }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public Integer getIdade() { return idade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setIdade(Integer idade) { this.idade = idade; }
}

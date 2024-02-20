package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  
  private String logradouro; 
  private String bairro;
  private String cidade;
  private String cep;

  @OneToOne(mappedBy = "endereco")
  @JsonIgnore
  private Estudante estudante;

}
package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Livro {
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String titulo;

  @JoinColumn(name = "estudante_id", nullable = false)
  @ManyToOne
  @JsonIgnore
  private Estudante estudante; 


}
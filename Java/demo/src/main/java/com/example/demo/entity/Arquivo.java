package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Arquivo {
    private String nomeArquivo;
    private String linkDownload;
    private String extensaoArquivo;
    private long size;
}
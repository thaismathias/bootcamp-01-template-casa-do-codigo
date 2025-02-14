package com.cdcAPI.api.model.Request;

import com.cdcAPI.model.Categoria;
import com.cdcAPI.validator.EntradaUnica;

import javax.validation.constraints.NotBlank;

//Complexidade = 2
//EntradaUnica, Categoria

public class CategoriaRequest {

    @NotBlank
    @EntradaUnica(domainClass = Categoria.class, fieldName = "nome")
    private String nome;

    @Deprecated
    public CategoriaRequest() {

    }

    public CategoriaRequest(@NotBlank String nome){
        this.nome = nome;
    }

    public Categoria toModel(){
        return new Categoria(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

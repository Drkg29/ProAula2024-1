package com.example.suplementos.suplementosstores.Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carritos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Carritos(){}

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    
}

package com.example.suplementos.suplementosstores.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.suplementos.suplementosstores.Modelo.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    
}
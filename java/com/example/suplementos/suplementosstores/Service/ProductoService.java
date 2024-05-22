package com.example.suplementos.suplementosstores.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.suplementos.suplementosstores.Modelo.Producto;
import com.example.suplementos.suplementosstores.Repository.ProductoRepository;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerTodosLosProductos(){
        return productoRepository.findAll();
    }

    public void agregarProductoAlCarrito(Long id){
    }
}
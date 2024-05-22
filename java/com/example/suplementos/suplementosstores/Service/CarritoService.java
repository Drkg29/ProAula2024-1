package com.example.suplementos.suplementosstores.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.suplementos.suplementosstores.Modelo.Producto;
import com.example.suplementos.suplementosstores.Repository.CarritosRepository;

@Service
public class CarritoService {
    private final CarritosRepository carritosRepository;

    @Autowired
    public CarritoService(CarritosRepository carritosRepository){
        this.carritosRepository = carritosRepository;
    }

    public List<Producto> obtenerContenidoDelCarrito(){
        return null;
    }

    public void eliminarProductoDelCarrito(Long id){}

    public void procesarCompra(){}
}

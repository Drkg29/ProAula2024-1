package com.example.suplementos.suplementosstores.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.suplementos.suplementosstores.Modelo.Producto;
import com.example.suplementos.suplementosstores.Service.ProductoService;

@RestController
@RequestMapping
public class productoscontroller {
    private ProductoService productoService;

    @Autowired
    public void ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> onteneProductos(){
        return productoService.obtenerTodosLosProductos();
    }
}

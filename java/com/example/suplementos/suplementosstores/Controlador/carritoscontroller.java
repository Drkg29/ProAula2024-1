package com.example.suplementos.suplementosstores.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.suplementos.suplementosstores.Service.CarritoService;

@RestController
@RequestMapping("/carrito")
public class carritoscontroller {
    private final CarritoService carritoService;

    @Autowired
    public Carritoscontroller(CarritoService carritoService){
        this.carritoService = carritoService;
    }

    @GetMapping
    public List<Producto> obtenerCarrito(){
        return carritoService.obtenerContenidoDelCarrito();
    }

    @DeleteMapping("/{id}/eliminar_del_carrito")
    public void eliminarDelCarrito(@PathVariable Long id){
        carritoService.eliminarProductoDelCarrito(id);
    }

    @PostMapping("/comprar")
    public void comprar(){
        carritoService.procesarCompra();
    }
}

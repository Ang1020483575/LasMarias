package com.marias.controlador;

import com.cosmeticos.LasMarias.modelo.entidades.Producto;
import com.cosmeticos.LasMarias.servicios.ProductoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoControlador {
    private final ProductoServicio productoServicio;

    public ProductoControlador(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    @GetMapping("/productos")
    public List<Producto> getProductos() {
        return productoServicio.getTodosProductos();
    }

    @GetMapping("/productosManual")
    public List<Producto> getProductosManual() {
        return productoServicio.getTodosProductosManual();
    }
}
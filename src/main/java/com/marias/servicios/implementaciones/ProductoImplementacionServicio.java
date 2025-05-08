package com.marias.servicios.implementaciones;

import com.cosmeticos.LasMarias.modelo.entidades.Producto;
import com.cosmeticos.LasMarias.modelo.repositorios.ProductoRepositorio;
import com.cosmeticos.LasMarias.servicios.ProductoServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductoImplementacionServicio implements ProductoServicio {

    private final ProductoRepositorio productoRepositorio;

    public ProductoImplementacionServicio(ProductoRepositorio productoRepositorio){
        this.productoRepositorio = productoRepositorio;
    }

    @Override
    public List<Producto> getTodosProductos() {
        return productoRepositorio.findAll();
    }

    @Override
    public List<Producto> getTodosProductosManual() {
        return productoRepositorio.traerTodo();
    }
}

package com.marias.controlador;

import com.cosmeticos.LasMarias.modelo.entidades.Categoria;
import com.cosmeticos.LasMarias.servicios.CategoriaServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class CategoriaControlador {

    private final CategoriaServicio categoriaServicio;

    public CategoriaControlador(CategoriaServicio categoriaServicio) {
        this.categoriaServicio = categoriaServicio;
    }

    @GetMapping("/categorias")
    public List<Categoria> getCategorias(){
        return categoriaServicio.getTodosCategorias();
    }

    @GetMapping("/categoriasManual")
    public List<Categoria> getCategoriasManual(){
        return categoriaServicio.getTodosCategoriasManual();
    }
}

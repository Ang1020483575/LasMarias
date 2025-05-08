package com.marias.servicios.implementaciones;

import com.cosmeticos.LasMarias.modelo.entidades.Categoria;
import com.cosmeticos.LasMarias.modelo.repositorios.CategoriaRepositorio;
import com.cosmeticos.LasMarias.servicios.CategoriaServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoriaImplementacionServicio implements CategoriaServicio {

    private final CategoriaRepositorio categoriaRepositorio;

    public CategoriaImplementacionServicio(CategoriaRepositorio categoriaRepositorio){
        this.categoriaRepositorio = categoriaRepositorio;
    }

    @Override
    public List<Categoria> getTodosCategorias() {
        return categoriaRepositorio.findAll();
    }

    @Override
    public List<Categoria> getTodosCategoriasManual() {
        return categoriaRepositorio.traerTodo();
    }
}

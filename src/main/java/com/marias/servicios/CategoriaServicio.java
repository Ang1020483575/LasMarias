package com.marias.servicios;

import com.cosmeticos.LasMarias.modelo.entidades.Categoria;
import java.util.List;

public interface CategoriaServicio {
    List<Categoria> getTodosCategorias();
    List<Categoria> getTodosCategoriasManual();
}

package com.marias.modelo.repositorios;

import com.cosmeticos.LasMarias.modelo.entidades.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProductoRepositorio extends Repository<Producto, Long> {
    List<Producto> findAll();

    @Query(value = "select * from cosmeticos.productos", nativeQuery = true)
    List<Producto> traerTodo();

}

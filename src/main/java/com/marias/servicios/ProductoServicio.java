package com.marias.servicios;

import com.cosmeticos.LasMarias.modelo.entidades.Producto;
import java.util.List;

public interface ProductoServicio {
    List<Producto> getTodosProductos();
    List<Producto> getTodosProductosManual();
}

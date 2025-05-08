package com.marias.servicios;

import com.cosmeticos.LasMarias.modelo.entidades.Cliente;
import java.util.List;

public interface ClienteServicio {
    List<Cliente> getTodosClientes();
    List<Cliente> getTodosClientesManual();
}

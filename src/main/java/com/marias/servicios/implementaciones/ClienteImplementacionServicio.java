package com.marias.servicios.implementaciones;

import com.cosmeticos.LasMarias.modelo.repositorios.ClienteRepositorio;
import com.cosmeticos.LasMarias.modelo.entidades.Cliente;
import com.cosmeticos.LasMarias.servicios.ClienteServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteImplementacionServicio implements ClienteServicio {

    private final ClienteRepositorio clienteRepositorio;

    public ClienteImplementacionServicio(ClienteRepositorio clienteRepositorio){
        this.clienteRepositorio = clienteRepositorio;
    }

    @Override
    public List<Cliente> getTodosClientes(){
        return clienteRepositorio.findAll();
    }

    @Override
    public List<Cliente> getTodosClientesManual(){
        return clienteRepositorio.traerTodo();
    }
}

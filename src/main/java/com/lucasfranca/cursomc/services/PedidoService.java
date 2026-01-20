package com.lucasfranca.cursomc.services;

import com.lucasfranca.cursomc.domain.Pedido;
import com.lucasfranca.cursomc.exceptions.ObjectNotFoundException;
import com.lucasfranca.cursomc.repositories.ClienteRepository;
import com.lucasfranca.cursomc.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}

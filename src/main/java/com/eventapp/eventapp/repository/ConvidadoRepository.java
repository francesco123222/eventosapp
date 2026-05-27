package com.eventapp.eventapp.repository;

import com.eventapp.eventapp.models.Convidado;
import com.eventapp.eventapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByRg(String rg);
}

package com.eventapp.eventapp.repository;

import com.eventapp.eventapp.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, Long> {
    Evento findByCodigo(long codigo);
}

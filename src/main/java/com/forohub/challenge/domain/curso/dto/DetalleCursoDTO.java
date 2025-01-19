package com.forohub.challenge.domain.curso.dto;

import com.forohub.challenge.domain.curso.Categoria;
import com.forohub.challenge.domain.curso.Curso;

public record DetalleCursoDTO(
        Long id,
        String name,
        Categoria categoria,
        Boolean activo) {

    public DetalleCursoDTO(Curso curso){
        this(
                curso.getId(),
                curso.getName(),
                curso.getCategoria(),
                curso.getActivo());
    }
}

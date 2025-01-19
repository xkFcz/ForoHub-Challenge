package com.forohub.challenge.domain.curso.dto;

import com.forohub.challenge.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}

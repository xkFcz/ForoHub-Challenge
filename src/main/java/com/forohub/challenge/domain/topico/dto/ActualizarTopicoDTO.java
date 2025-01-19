package com.forohub.challenge.domain.topico.dto;

import com.forohub.challenge.domain.topico.Estado;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}

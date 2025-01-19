package com.forohub.challenge.domain.respuesta.dto;

public record ActualizarRespuestaDTO(
        String mensaje,
        Boolean solucion,
        Boolean borrado
) {
}
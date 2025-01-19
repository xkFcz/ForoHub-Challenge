package com.forohub.challenge.domain.respuesta.validations.update;

import com.forohub.challenge.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {
    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}

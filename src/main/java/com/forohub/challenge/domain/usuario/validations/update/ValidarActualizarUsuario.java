package com.forohub.challenge.domain.usuario.validations.update;

import com.forohub.challenge.domain.usuario.dto.ActualizarUsuarioDTO;

public interface ValidarActualizarUsuario {
    void validate(ActualizarUsuarioDTO data);
}

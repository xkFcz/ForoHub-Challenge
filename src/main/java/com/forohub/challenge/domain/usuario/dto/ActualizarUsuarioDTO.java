package com.forohub.challenge.domain.usuario.dto;

import com.forohub.challenge.domain.usuario.Role;

public record ActualizarUsuarioDTO(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}

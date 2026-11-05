package lam.api.dto

import lam.api.entity.Clientes

data class ClientesResponse(
    val id: Int,
    val nombre: String,
    val apellido: String,
    val email: String,
    val telefono: String,
    val direccion: String
) {
    companion object {
        fun fromEntity(c: Clientes): ClientesResponse =
            ClientesResponse(
                id = c.id ?: 0,
                nombre = c.nombre,
                apellido = c.apellido,
                email = c.email,
                telefono = c.telefono ?: "",
                direccion = c.direccion ?: ""
            )
    }
}
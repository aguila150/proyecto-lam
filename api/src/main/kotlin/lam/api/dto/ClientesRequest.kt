package lam.api.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class ClientesRequest(
    @field:NotBlank(message = "El nombre es obligatorio")
    @field:Size(max = 120, message = "El nombre supera el límite permitido")
    val nombre: String,

    @field:NotBlank(message = "El apellido es obligatorio")
    @field:Size(max = 120, message = "El apellido supera el límite permitido")
    val apellido: String,

    @field:NotBlank(message = "El email es obligatorio")
    @field:Email(message = "El formato del email no es válido")
    @field:Size(max = 50, message = "El email supera el límite permitido")
    val email: String,

    @field:NotBlank(message = "El teléfono es obligatorio")
    @field:Size(max = 15, message = "El teléfono supera el límite permitido")
    val telefono: String,

    @field:NotBlank(message = "La dirección es obligatoria")
    @field:Size(max = 50, message = "La dirección supera el límite permitido")
    val direccion: String
)

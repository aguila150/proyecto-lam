package lam.api.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class ClientesRequest(

    @field:NotBlank(message = "El nombre es obligatorio")
    @field:Size(max = 100, message = "El nombre no puede superar los 100 caracteres")
    val nombre: String,

    @field:NotBlank(message = "El apellido es obligatorio")
    @field:Size(max = 100, message = "El apellido no puede superar los 100 caracteres")
    val apellido: String,

    @field:NotBlank(message = "El email es obligatorio")
    @field:Email(message = "El formato del email no es válido")
    @field:Size(max = 100, message = "El email no puede superar los 100 caracteres")
    val email: String,

    @field:NotBlank(message = "El teléfono es obligatorio")
    @field:Size(max = 20, message = "El teléfono no puede superar los 20 caracteres")
    val telefono: String,

    @field:NotBlank(message = "La dirección es obligatoria")
    @field:Size(max = 200, message = "La dirección no puede superar los 200 caracteres")
    val direccion: String
)
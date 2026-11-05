package lam.api.service

import lam.api.dto.ClientesRequest
import lam.api.dto.ClientesResponse
import lam.api.entity.Clientes
import lam.api.exception.ClienteNoEncontradoException
import lam.api.repository.ClientesRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ClientesService(
    private val clientesRepository: ClientesRepository
) {

    @Transactional(readOnly = true)
    fun listar(pageable: Pageable): Page<ClientesResponse> {
        return clientesRepository.findAll(pageable)
            .map { ClientesResponse.fromEntity(it) }
    }

    @Transactional(readOnly = true)
    fun obtener(id: Int): ClientesResponse {
        val cliente = clientesRepository.findById(id)
            .orElseThrow {
                ClienteNoEncontradoException(id)
            }

        return ClientesResponse.fromEntity(cliente)
    }

    @Transactional
    fun crear(req: ClientesRequest): ClientesResponse {
        val nuevoCliente = Clientes(
            nombre = req.nombre,
            apellido = req.apellido,
            email = req.email,
            telefono = req.telefono,
            direccion = req.direccion
        )

        val guardado = clientesRepository.save(nuevoCliente)

        return ClientesResponse.fromEntity(guardado)
    }
}
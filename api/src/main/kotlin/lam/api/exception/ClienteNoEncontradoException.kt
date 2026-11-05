package lam.api.exception

class ClienteNoEncontradoException(id: Int) :
    RuntimeException("Cliente no encontrado con el ID: $id")
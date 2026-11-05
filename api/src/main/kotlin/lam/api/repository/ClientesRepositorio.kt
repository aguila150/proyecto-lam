package lam.api.repository

import lam.api.entity.Clientes
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientesRepository : JpaRepository<Clientes, Int>
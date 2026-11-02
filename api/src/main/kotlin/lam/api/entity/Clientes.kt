package lam.api.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "clientes")
class Clientes(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false, length = 120)
    var nombre: String = "",

    @Column(nullable = false, length = 120)
    var apellido: String = "",

    @Column(nullable = false, length = 50)
    var email: String = "",

    @Column(nullable = false, length = 15)
    var telefono: String = "",

    @Column(name = "dirección", nullable = false, length = 50)
    var direccion: String = ""
)

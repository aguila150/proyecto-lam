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
    var id: Int? = null,

    @Column(nullable = false, length = 100)
    var nombre: String = "",

    @Column(nullable = false, length = 100)
    var apellido: String = "",

    @Column(nullable = false, length = 100)
    var email: String = "",

    @Column(nullable = true, length = 20)
    var telefono: String? = null,

    @Column(nullable = true, length = 200)
    var direccion: String? = null
)
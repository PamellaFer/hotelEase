package com.projetoDeDesenvolvimento.hotelEase.models.entity

import com.projetoDeDesenvolvimento.hotelEase.enum.TypesSuitesEnum
import jakarta.persistence.*

@Entity
@Table(name = "suites")
data class Suites (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suite_number", unique = true, nullable = true)
    val suiteNumber: Long? = null,

    @OneToMany(mappedBy = "suite", cascade = [CascadeType.ALL])
    var reservations: List<Reservations> = mutableListOf(),

    @Column(name = "suite_available", nullable = true)
    var suiteAvailable: Boolean = true,

    @Column(name = "type_suite")
    var typeSuite: TypesSuitesEnum? = null,

)
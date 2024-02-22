package com.projetoDeDesenvolvimento.hotelEase.models.entity

import com.projetoDeDesenvolvimento.hotelEase.enum.TypesSuitesEnum
import jakarta.persistence.*

@Entity
@Table(name = "suites")
data class Suites (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "suite_number", unique = true)
    val suiteNumber: Long? = null,

    @OneToMany
    @JoinColumn(name = "suite", referencedColumnName = "reservationId")
    var reservations: List<Reservations> = mutableListOf(),

    @Column(name = "suite_available")
    var suiteAvailable: Boolean = true,

    @Column(name = "type_suite")
    var typeSuite: TypesSuitesEnum? = null,

)
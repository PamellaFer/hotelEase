package com.projetoDeDesenvolvimento.hotelEase.models.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "reservations")
data class Reservations (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservations_id", unique = true, nullable = true)
    val reservationId: Long? = null,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    var user: Users,

    @ManyToOne
    @JoinColumn(name = "suite", referencedColumnName = "suiteNumber")
    var suite: Suites,

    @OneToOne(mappedBy = "reservationId", cascade = [CascadeType.ALL])
    val payment: Payment,

    @Column(name = "date_check-in", nullable = true)
    var dateCheckIn: LocalDateTime? = null,

    @Column(name = "date_check-out", nullable = true)
    var dateCheckOut: LocalDateTime? = null,

    ) {
    constructor() : this() {
    }
}
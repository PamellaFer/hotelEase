package com.projetoDeDesenvolvimento.hotelEase.models.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "reservations")
data class Reservations (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservations_id", unique = true)
    val reservationId: Long? = null,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    var user: Users? = null,

    @ManyToOne
    @JoinColumn(name = "suite", referencedColumnName = "suiteNumber")
    var suite: Suites? = null,

    @OneToOne
    @JoinColumn(name = "reservation", referencedColumnName = "paymentId")
    val payment: Payment? = null,

    @Column(name = "date_check-in")
    var dateCheckIn: LocalDateTime? = null,

    @Column(name = "date_check-out")
    var dateCheckOut: LocalDateTime? = null,

)


package com.projetoDeDesenvolvimento.hotelEase.models.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "reservations")
data class Reservations (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id", unique = true)
    val reservationId: Long? = null,

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    var userId: Users? = null,

    @ManyToOne
    @JoinColumn(name = "suite", referencedColumnName = "suite_number")
    var suite: Suites? = null,

    @OneToOne
    @JoinColumn(name = "payment_id", referencedColumnName = "payment_id")
    val payment: Payment? = null,

    @Column(name = "date_check-in")
    var dateCheckIn: LocalDateTime? = null,

    @Column(name = "date_check-out")
    var dateCheckOut: LocalDateTime? = null,

)


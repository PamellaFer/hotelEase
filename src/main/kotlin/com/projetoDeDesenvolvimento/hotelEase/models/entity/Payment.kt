package com.projetoDeDesenvolvimento.hotelEase.models.entity

import com.projetoDeDesenvolvimento.hotelEase.enum.TypePaymentEnum
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "payment")
data class Payment (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // talvez nao precise de gerar automaticamente dnv pq ja faz isso na classe Users, se preicisar, gerar do reservationId abaixo tb
    @Column(name = "user_id", unique = true, nullable = true)
    var userId: Long? = null,

    @Column(name = "reservation_id", unique = true, nullable = true)
    var reservationNumber: Long? = null,

    @Column(name = "type_payment", nullable = true)
    var typePayment: TypePaymentEnum? = null,

    @Column(name = "payment_approved")
    var paymentApproved: Boolean? = null,

) {
    constructor (user: Users, reservations: Reservations): this() {
        this.userId = user.userId
        this.reservationNumber = reservations.reservationNumber
    }
}



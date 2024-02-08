package com.projetoDeDesenvolvimento.hotelEase.models.entity

import com.projetoDeDesenvolvimento.hotelEase.enum.PaymentStatusEnum
import com.projetoDeDesenvolvimento.hotelEase.service.ServiceForCalculatingPayment
import com.projetoDeDesenvolvimento.hotelEase.service.ServiceForMakingReservations
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
@Table(name = "reservations")
data class Reservations (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// talvez nao precise de gerar automaticamente dnv pq ja faz isso na classe Users
    @Column(name = "user_id", unique = true, nullable = true)
    var userId: Long? = null,

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_number", unique = true, nullable = true)
    val reservationNumber: Long? = null,

    @Column(name = "suite_number", unique = true, nullable = true)
    var suiteNumber: Long? = null,

    @Column(name = "date_check-in", nullable = true)
    var dateCheckIn: LocalDateTime? = null,

    @Column(name = "date_check-out", nullable = true)
    var dateCheckOut: LocalDateTime? = null,

    @Column(name = "total_payable", nullable = true)
    val totalPayable: BigDecimal? = null,

    @Column(name = "amount_paid", nullable = true)
    val amountPaid: BigDecimal? = null,

    @Column(name = "pending_amount", nullable = true)
    val pendingAmount: BigDecimal? = null,

    @Column(name = "payment_status", nullable = true)
    val paymentStatus: PaymentStatusEnum? = null

) {
    constructor (users: Users, suites: Suites, serviceForCalculatingPayment: ServiceForCalculatingPayment):
            this() {
        this.userId = users.userId
        this.suiteNumber = suites.suiteNumber
        this.totalPayable = serviceForCalculatingPayment.totalPayable()
        this.amountPaid = serviceForCalculatingPayment.amountPaid()
        this.pendingAmount = serviceForCalculatingPayment.pendingAmount()
    }
}

package com.projetoDeDesenvolvimento.hotelEase.models.entity

import com.projetoDeDesenvolvimento.hotelEase.enum.PaymentStatusEnum
import com.projetoDeDesenvolvimento.hotelEase.enum.TypePaymentEnum
import jakarta.persistence.*

import java.math.BigDecimal
@Entity
@Table(name = "payment")
data class Payment (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", unique = true)
    val paymentId: Long? = null,

    @OneToOne
    @JoinColumn(name =  "reservation_id", referencedColumnName = "reservation_id")
    var reservationId: Reservations? = null,

    @Column(name = "type_payment")
    var typePayment: TypePaymentEnum? = null,

    @Column(name = "total_payable")
    val totalPayable: BigDecimal? = null,

    @Column(name = "amount_paid")
    val amountPaid: BigDecimal? = null,

    @Column(name = "pending_amount")
    val pendingAmount: BigDecimal? = null,

    @Column(name = "payment_status")
    val paymentStatus: PaymentStatusEnum? = null,

    @Column(name = "payment_approved")
    var paymentApproved: Boolean? = null,

)



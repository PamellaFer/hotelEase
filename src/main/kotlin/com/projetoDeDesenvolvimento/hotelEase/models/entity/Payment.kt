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
    @Column(name = "payment_id", unique = true, nullable = true)
    val paymentId: Long? = null,

    @OneToOne(mappedBy =  "reservationId", cascade = [CascadeType.ALL])
    var reservationId: Reservations,

    @Column(name = "type_payment", nullable = true)
    var typePayment: TypePaymentEnum? = null,

    @Column(name = "total_payable", nullable = true)
    val totalPayable: BigDecimal? = null,

    @Column(name = "amount_paid", nullable = true)
    val amountPaid: BigDecimal? = null,

    @Column(name = "pending_amount", nullable = true)
    val pendingAmount: BigDecimal? = null,

    @Column(name = "payment_status", nullable = true)
    val paymentStatus: PaymentStatusEnum? = null,

    @Column(name = "payment_approved")
    var paymentApproved: Boolean? = null,

) {
    constructor() : this() {
    }
}



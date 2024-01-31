package com.projetoDeDesenvolvimento.hotelEase.models.entity

import com.projetoDeDesenvolvimento.hotelEase.enum.PaymentStatusEnum
import java.math.BigDecimal
import java.time.LocalDateTime

class Reservations (users: Users) {
    val idReservations: Int = 0 // ainda vou fazer gerar IDs automaticamente
    val idUser = users.idUser
    val idTypeAccommodation: Int = 0 // associar o id da acomodação quando criar a classe de tipo de acomodação
    val dateCheckIn: LocalDateTime = LocalDateTime.now()
    val dateCheckOut: LocalDateTime = LocalDateTime.now()
    val totalPayable = BigDecimal.ZERO // aqui o valor deverá ser alterado automaticamente conforme a suíte escolhida
    val amountPaid = BigDecimal.ZERO
    val pendingAmount: BigDecimal = totalPayable - amountPaid
    val paymentStatus = PaymentStatusEnum.PAYMENT_NOT_MADE // criar método para verificar o pagamento
}


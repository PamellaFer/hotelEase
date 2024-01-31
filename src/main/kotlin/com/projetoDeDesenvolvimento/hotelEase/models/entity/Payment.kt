package com.projetoDeDesenvolvimento.hotelEase.models.entity

import com.projetoDeDesenvolvimento.hotelEase.enum.TypePaymentEnum
import org.apache.logging.log4j.LogManager.getLogger
import java.time.LocalDate

class Payment (users: Users, reservations: Reservations) {

    companion object {
        private val LOGGER = getLogger()
    }

    val idUser = users.idUser
    val idReservations = reservations.idReservations
    var typePayment = TypePaymentEnum.CARTAO_CREDITO
    var paymentAproved: Boolean = false

    fun processPayment() {
        when (typePayment) {
            TypePaymentEnum.CARTAO_CREDITO -> processPaymentCard()
            TypePaymentEnum.PIX -> processPaymentPix()
        }
    }
    private fun processPaymentCard(): Boolean {
        var numberCard: String = ""
        var codeCard: String = ""
        var cardExpirationDate: LocalDate = LocalDate.now()
        var nameOnCard: String = ""

        paymentAproved = numberCard.isNotEmpty() && codeCard.isNotEmpty() && cardExpirationDate.toString().isNotEmpty()
                && nameOnCard.isNotEmpty()
        return paymentAproved == true
    }
    private fun processPaymentPix(): Boolean {
        LOGGER.info("Por favor, realize o pagamento pela chave pix: 123")
        var paymentMade: Boolean = true
        return paymentAproved == true
    }
}
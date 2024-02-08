package com.projetoDeDesenvolvimento.hotelEase.service

import java.math.BigDecimal

class ServiceForCalculatingPayment {

    fun totalPayable() {
        // o total a pagar é de acordo com a suite e a qtde de dias
        // fazer essa função retornar tb o valor pendente (pendingAmount do Rservations)
        // usar o StatusPaymentEnum
        //quando terminar de criar essa função, conferir na classe Reservations se ficou ok
    }

    fun amountPaid() {
        //quando terminar de criar essa função, conferir na classe Reservations se ficou ok
        // usar o StatusPaymentEnum
    }

    fun calculatePercentage() {
        // criar uma função para calcular a porcentagem a ser paga de acordo com a suite, e qtde de dias
        // usar o StatusPaymentEnum
        // acho que esse aqui da o mesmo que a funcao abaixo "pendingAmount"
    }

    fun pendingAmount() {
        //quando terminar de criar essa função, conferir na classe Reservations se ficou ok
        // usar o StatusPaymentEnum
    }
}
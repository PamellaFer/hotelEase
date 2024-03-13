//package com.projetoDeDesenvolvimento.hotelEase.service
//
//import org.kxtra.slf4j.getLogger
//import java.time.LocalDateTime
//
//class MakingReservationsService {
//
//    companion object { private val LOGGER = getLogger() }
//
//    fun ChooseSuite () {
//// nao lembro o que pensei pra esta funçao mas acho que nao precisa mais por causa da ideia da lista
//    }
//
//    fun listOfAvailableSuites () {
//        // sera de acordo com as datas de check-in e check-out
//        // na lista deve conter alguns dados como suiteNumber, o TypeSuiteEnum, etc (pensar)
//    }
//
//
//    fun suitesUnavailable () {
//
//    }
//// ver se faz sentido manter os tres metodos acima aqui ou se crio um service para tornar as suites ocupadas ou desecupdas
//    // fora desse service de realizar as reservas
//
//    // criar método para "calcular" a data? pois o usuário é quem vai escolher na hora de reservar -- esse ocmentario estava
//        // na classe Reservations e encaixa no que eu disse acima se caso for criar um service para tonar as suites ocupadas
//
//
//    fun chooseTheCheckInDate (checkInDate: LocalDateTime, numberOfDays: Int) {
//        if (checkInDate.isAfter(LocalDateTime.now())) {
//            dateCheckIn = checkInDate
//            dateCheckOut = checkInDate.plusDays(numberOfDays.toLong())
//            // criar metodo para tornar a suite ocupada ate a data de checkout
//
//        } else {
//            LOGGER.info("Data de check-in inválida. Por favor, escolha uma data futura.")
//        }
//    }
//}
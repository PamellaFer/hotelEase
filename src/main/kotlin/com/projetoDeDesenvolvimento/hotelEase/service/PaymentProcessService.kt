//    package com.projetoDeDesenvolvimento.hotelEase.service
//
//    import com.projetoDeDesenvolvimento.hotelEase.enum.TypePaymentEnum
//    import com.projetoDeDesenvolvimento.hotelEase.models.entity.paymentAproved
//    import com.projetoDeDesenvolvimento.hotelEase.models.entity.typePayment
//    import org.kxtra.slf4j.getLogger
//    import java.time.LocalDate
//
//    class PaymentProcessService {
//
//        companion object { private val LOGGER = getLogger() }
//
//        fun processPayment() {
//            when (typePayment) {
//                TypePaymentEnum.CREDIT_CARD -> processPaymentCard()
//                TypePaymentEnum.PIX -> processPaymentPix()
//            }
//        }
//
//        // USAR O StatusPaymentEnum nas funções que ja estavam prontas
//        private fun processPaymentCard(): Boolean {
//            var numberCard: String = ""
//            var codeCard: String = ""
//            var cardExpirationDate: LocalDate = LocalDate.now()
//            var nameOnCard: String = ""
//
//            paymentApproved = numberCard.isNotEmpty() && codeCard.isNotEmpty() && cardExpirationDate.toString().isNotEmpty()
//                    && nameOnCard.isNotEmpty()
//            return paymentApproved == true
//        }
//        private fun processPaymentPix(): Boolean {
//            LOGGER.info("Por favor, realize o pagamento pela chave pix: 123") // mostrar o valor a ser pago
//            return paymentApproved == true
//        }
//
//    }
package com.projetoDeDesenvolvimento.hotelEase.enum

import java.math.BigDecimal

enum class TypesSuitesEnum (val qtdeCamasCasal: Int,
                            val qtdeCamasSolteiro: Int,
                            val cobertura: Boolean,
                            val servicoLavanderia: Boolean,
                            val varanda: Boolean,
                            val hidromassagem: Boolean,
                            val secadorCabelo: Boolean,
                            val wifi: Boolean,
                            var precoDiaria: BigDecimal) {

    // Suites para casal ou pessoa solteira

    SUITE_PRESIDENCIAL(1, 1, true, true, true,
        true, true, true, BigDecimal("1000.00" ) ),

    SUITE_EXECUTIVE (1, 0, false, false, true,
        true, true, true, BigDecimal("500.00") )

    


}
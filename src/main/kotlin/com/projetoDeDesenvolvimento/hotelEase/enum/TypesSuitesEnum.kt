package com.projetoDeDesenvolvimento.hotelEase.enum

import java.math.BigDecimal

enum class TypesSuitesEnum (val qtyDoubleBeds: Int,
                            val qtyOfSingleBeds: Int,
                            val penthouse: Boolean,
                            val laundryService: Boolean,
                            val balcony: Boolean,
                            val hydromassage: Boolean,
                            val hairdryer: Boolean,
                            val wifi: Boolean,
                            var dailyPrice: BigDecimal) {

    // Suítes para 1 ou 2 pessoas
    PRESIDENTIAL_SUITE_FOR_ONE_OR_TWO_PEOPLE (1, 0, true, true, true,
        true, true, true, BigDecimal("1600.00" ) ),

    EXECUTIVE_SUITE_FOR_ONE_OR_TWO_PEOPLE (1, 0, false, false, true,
        true, true, true, BigDecimal("900.00") ),

    STAR_SUITE_FOR_ONE_OR_TWO_PEOPLE (1, 0, false, false, false,
        false, true, true, BigDecimal("400.00") ),


    // Suítes para até 6 pessoas
    FAMILY_SUITE_FOR_THREE_TO_SIX_PEOPLE(3, 0, false, false, true,
        true, true, true, BigDecimal("1200.00")),

    GROUP_SUITE_FOR_THREE_TO_SIX_PEOPLE(2, 2, false, false, true,
        false, true, true, BigDecimal("1100.00")),
}
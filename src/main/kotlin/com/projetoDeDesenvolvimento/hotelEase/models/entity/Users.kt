package com.projetoDeDesenvolvimento.hotelEase.models.entity

import java.time.LocalDate
import java.time.LocalDateTime
open class Users {
    val idUser: Int = 0
    var name: String = ""
    val cpf: Int = 0
    var email: String = ""
    var password: String = ""
    val dateRegister: LocalDateTime = LocalDateTime.now()
    val dateUpdate: LocalDateTime = LocalDateTime.now()
    val birthDate: LocalDate = LocalDate.now()
    var phone: Int = 0
}


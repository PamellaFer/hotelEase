package com.projetoDeDesenvolvimento.hotelEase.service

import com.projetoDeDesenvolvimento.hotelEase.models.entity.Users
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
class PasswordEncryptionService (val passwordEncoder: BCryptPasswordEncoder, val users: Users) {
    fun encryptPassword(): String {
        val userPassword = users.password
        return passwordEncoder.encode(userPassword)
    }
}
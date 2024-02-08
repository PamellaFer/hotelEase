package com.projetoDeDesenvolvimento.hotelEase.models.entity

import jakarta.persistence.*
import org.hibernate.proxy.HibernateProxy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import java.time.LocalDate
import java.time.LocalDateTime
@Entity
@Table (name = "Users")
data class Users (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true, nullable = true)
    val userId: Long? = null,

    @Column(name = "user_name", nullable = false)
    var name: String = "",

    @Column(name = "user_cpf", nullable = false, unique = true)
    val cpf: String = "",

    @Column(name = "user_email", nullable = false)
    var email: String = "",

    @Column(name = "user_password", nullable = false)
    var password: String = "",

    @Column (name = "user_registration_date", nullable = false)
    val registrationDate: LocalDateTime? = null,

    @Column(name = "user_update_date", nullable = false)
    val updateDate: LocalDateTime? = null,

    @Column(name = "user_bithdate", nullable = false)
    val birthDate: LocalDate? = null,

    @Column(name = "user_phone", nullable = false)
    var phone: String = "",

) { // função que transforma a senha em um hash usando o algoritmo Bcrypt para amarzená-la de forma segura no banco, ver se vou deixar aqui ou colocar em outro lugar
    fun setPassword(password: BCryptPasswordEncoder) {
        this.password = password.encode(this.password)
    }
}
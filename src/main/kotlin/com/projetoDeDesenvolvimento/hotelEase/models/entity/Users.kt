package com.projetoDeDesenvolvimento.hotelEase.models.entity

import com.projetoDeDesenvolvimento.hotelEase.enum.AdministratorRoleEnum
import com.projetoDeDesenvolvimento.hotelEase.enum.UserRoleEnum
import jakarta.persistence.*
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "users")
data class Users (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", unique = true)
    val userId: Long? = null,

    @OneToMany
    @JoinColumn(name = "reservation_id", referencedColumnName = "reservation_id")
    val reservationId: List<Reservations> = mutableListOf(),

    @Column(name = "user_role")
    var userRole: UserRoleEnum? = null,

    @Column(name = "administrator_role")
    var administratorRole: AdministratorRoleEnum? = null,

    @Column(name = "user_name")
    var name: String = "",

    @Column(name = "user_cpf", unique = true)
    val cpf: String = "",

    @Column(name = "user_email")
    var email: String = "",

    @Column(name = "user_password")
    var password: String = "",

    @Column (name = "user_registration_date")
    val registrationDate: LocalDateTime? = null,

    @Column(name = "user_update_date")
    val updateDate: LocalDateTime? = null,

    @Column(name = "user_bithdate")
    val birthDate: LocalDate? = null,

    @Column(name = "user_phone")
    var phone: String = "",

)

package com.projetoDeDesenvolvimento.hotelEase.models.entity

import jakarta.persistence.*
@Entity
@Table (name = "admin_user")
data class AdminUser (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//talvez nao precise de gerar novamente, pois ja esta gerando na classe Users
    @Column(name = "admin_user_id", unique = true, nullable = true)
    var adminUserId: Long? = null,

    @Column(name = "administrator_position", nullable = false)
    var administratorPosition: String = "",
) {
    constructor (users: Users) : this() {
        this.adminUserId = users.userId
    }
}
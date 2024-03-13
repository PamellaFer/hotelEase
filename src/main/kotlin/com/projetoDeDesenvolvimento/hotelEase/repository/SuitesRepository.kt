package com.projetoDeDesenvolvimento.hotelEase.repository

import com.projetoDeDesenvolvimento.hotelEase.models.entity.Suites
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SuitesRepository: JpaRepository <Suites, Long> {
}
package com.projetoDeDesenvolvimento.hotelEase.service

import com.projetoDeDesenvolvimento.hotelEase.models.entity.Suites
import com.projetoDeDesenvolvimento.hotelEase.repository.SuitesRepository
import org.springframework.stereotype.Service
import java.util.NoSuchElementException

@Service
class SuitesService (val suitesRepository: SuitesRepository) {
    fun listSuites(): List<Suites> {
        return suitesRepository.findAll()
    }
    fun addSuites(suites: Suites): Suites {
        return suitesRepository.save(suites)
    }
    fun editSuites (suiteNumber: Long, editedSuite: Suites): Suites {
        val suites = suitesRepository.findById(suiteNumber)

            .orElseThrow{ NoSuchElementException ("Suite com o número $suiteNumber não encontrada. Por favor, insira o número de uma " +
                    "suíte existente no sistema ou crie uma nova.") }

        suites.suiteAvailable = editedSuite.suiteAvailable
        suites.typeSuite = editedSuite.typeSuite
        return suitesRepository.save(suites)
    }
    fun deleteSuites (suiteNumber: Long): String {
        val suites = suitesRepository.findById(suiteNumber)

            .orElseThrow {NoSuchElementException ("Suite com o número $suiteNumber não encontrada. Por favor, digite o número de uma " +
                    "suíte existente no sistema." )}

        suitesRepository.delete(suites)
        return ("Suíte excluída com sucesso!")
    }
}

// listar todas as suites
// incluir novas suites,
// editar suites (como por exemplo alterar a descrição...)
// excluir suites
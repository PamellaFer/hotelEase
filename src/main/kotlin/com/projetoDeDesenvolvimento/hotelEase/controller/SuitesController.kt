package com.projetoDeDesenvolvimento.hotelEase.controller

import com.projetoDeDesenvolvimento.hotelEase.models.entity.Suites
import com.projetoDeDesenvolvimento.hotelEase.service.SuitesService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/suites")
class SuitesController (val suitesService: SuitesService) {
    @GetMapping("/list/all")
    fun listSuites(): List<Suites> {
        return suitesService.listSuites()
    }
    @PostMapping("/add")
    fun addSuites(@RequestBody suites: Suites): Suites {
        return suitesService.addSuites(suites)
    }
    @PutMapping("/edit")
    fun editSuites( @PathVariable suiteNumber: Long, @RequestBody suites: Suites ): Suites {
        return suitesService.editSuites(suiteNumber, suites)
    }
    @DeleteMapping("/delete")
    fun deleteSuites (@PathVariable suiteNumber: Long) {
        suitesService.deleteSuites(suiteNumber)
    }
}
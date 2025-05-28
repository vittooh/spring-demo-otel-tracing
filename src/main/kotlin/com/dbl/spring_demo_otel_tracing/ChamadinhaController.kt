package com.dbl.spring_demo_otel_tracing

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RequestMapping("/v1/chamadinha")
@RestController
class ChamadinhaController(
    val log: Logger = LoggerFactory.getLogger(ChamadinhaController::class.java)
) {


    @GetMapping
    fun getHora(): String {
            log.info("Hora do dia!! " + LocalDateTime.now())


        val data = mutableListOf("a;2;2","a;1;1","b;2;2")

        data.map { it -> it.split(";") }
            .groupBy { it -> it.get(0) }
            .maxBy { it -> it.value }
            .min


        return "Hora do dia!! " + LocalDateTime.now()

    }
}
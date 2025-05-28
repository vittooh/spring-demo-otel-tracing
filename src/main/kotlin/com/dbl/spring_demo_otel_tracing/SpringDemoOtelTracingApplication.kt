package com.dbl.spring_demo_otel_tracing

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDemoOtelTracingApplication

fun main(args: Array<String>) {
	runApplication<SpringDemoOtelTracingApplication>(*args)
}

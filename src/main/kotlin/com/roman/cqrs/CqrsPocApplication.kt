package com.roman.cqrs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CqrsPocApplication

fun main(args: Array<String>) {
	runApplication<CqrsPocApplication>(*args)
}

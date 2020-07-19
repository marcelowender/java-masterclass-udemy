package br.com.meuvalor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MeuvalorApplication

fun main(args: Array<String>) {
	runApplication<MeuvalorApplication>(*args)
}

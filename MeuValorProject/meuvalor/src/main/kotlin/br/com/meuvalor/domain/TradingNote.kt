package br.com.meuvalor.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class TradingNote(@Id
                       @GeneratedValue
                       val id: String, val stockbroker: String, val stock: String) {

}
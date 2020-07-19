package br.com.meuvalor.controller

import br.com.meuvalor.domain.TradingNote
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("trading")
class TradingNoteController {

    @PostMapping("/tradingnote")
    fun tradingNote(@RequestBody tradingNote: TradingNote): TradingNote {
        return tradingNote;
    }


}

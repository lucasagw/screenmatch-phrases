package br.com.alura.screenmatch_phrases.controller;

import br.com.alura.screenmatch_phrases.dto.PhraseDTO;
import br.com.alura.screenmatch_phrases.service.PhraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhraseController {

    @Autowired
    private PhraseService phraseService;


    @GetMapping("/series/phrases")
    public PhraseDTO getRandomPhrase() {
        return phraseService.getRandomPhrase();
    }
}

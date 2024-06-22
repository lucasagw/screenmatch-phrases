package br.com.alura.screenmatch_phrases.service;

import br.com.alura.screenmatch_phrases.dto.PhraseDTO;
import br.com.alura.screenmatch_phrases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhraseService {

    @Autowired
    private PhraseRepository phraseRepository;

    public PhraseDTO getRandomPhrase() {

        var phrase = phraseRepository.getRandomPhrase();

        return new PhraseDTO(phrase.getTitle(),
                phrase.getText(),
                phrase.getCharacter(),
                phrase.getPoster());
    }
}

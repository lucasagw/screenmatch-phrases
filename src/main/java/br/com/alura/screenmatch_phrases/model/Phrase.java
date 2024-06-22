package br.com.alura.screenmatch_phrases.model;

import jakarta.persistence.*;

@Entity
@Table(name = "phrases")
public class Phrase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phrase_title")
    private String title;

    @Column(name = "phrase_text")
    private String text;

    @Column(name = "phrase_character")
    private String character;

    @Column(name = "phrase_poster")
    private String poster;
    //https://www.omdbapi.com/?t=ferris+bueller%E2%80%99s+day+off&apikey=


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}

package org.example.domain.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import org.example.domain.AppFilmRepository;

public class FilmDirector {
    private String firsName;
    private String surName;
    private LocalDate birthDate;
    private List<Film> filmList;

    public FilmDirector(String firsName, String surName, LocalDate birthDate) {
        this.firsName = firsName;
        this.surName = surName;
        this.birthDate = birthDate;
    }

    public void createFilms(Film film){
        filmList.add(film);
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<Film> getFilm() {
        return filmList;
    }

    public void setFilm(List<Film> film) {
        this.filmList = film;
    }
}
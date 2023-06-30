package org.example.domain;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.domain.Data.Film;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppFilmRepository implements FilmRepository {

    @JsonProperty("films")
    private List<Film> films;

    public List<Film> getFilms() {
        return films;
    }
    public AppFilmRepository() {
        films = new ArrayList<>();
    }

    @Override
    public void addFilm(Film film) {
        films.add(film);
    }

    @Override
    public void removeFilm(String name, LocalDate yearRelease) {
        Film film = searchByNameYear(name, yearRelease);
        for (int i = 0; i < films.size(); i++) {
            if (film.equals(films.get(i))){
                films.remove(film);
                return;
            }
        }
    }

    @Override
    public void editRating(Film film, float rating) {
        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).equals(film)){
                film.setImdbRating(rating);
                return;
            }
        }
    }

    @Override
    public Film searchByNameYear(String name, LocalDate yearRelease) {
        for (int i = 0; i < films.size(); i++) {
            if (films.get(i).getName().toLowerCase().contains(name.toLowerCase())){
                return films.get(i);
            }
        }
        return null;
    }
}
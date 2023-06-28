package org.example.domain;
import org.example.domain.Data.*;

import java.time.LocalDate;

public interface FilmRepository {
    void addFilm(Film film);

    void removeFilm(String name, LocalDate yearRelease);

    void editRating(Film film, float rating);

    Film searchByNameYear(String name, LocalDate yearRelease);

}

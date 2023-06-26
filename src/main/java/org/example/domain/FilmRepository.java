package org.example.domain;
import org.example.domain.Data.*;

import java.time.LocalDate;

public interface FilmRepository {
    void addFilm(Film film);

    void removeFilm(Film film);

    void editRating(Film film, int rating);

    Film searchByNameYear(String name, LocalDate yearRelease);

}

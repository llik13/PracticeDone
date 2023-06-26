package org.example.domain.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Film {
    private final String name;
    private final FilmDirector filmDirector;
    private final LocalDate yearRelease;
    private final List<Genre> genres;
    private int imdbRating;

    public Film(String name, FilmDirector filmDirector, LocalDate yearRelease, List<Genre> genres) {
        this.name = name;
        this.filmDirector = filmDirector;
        this.yearRelease = yearRelease;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public FilmDirector getFilmDirector() {
        return filmDirector;
    }

    public LocalDate getYearRelease() {
        return yearRelease;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public int getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(int imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", filmDirector=" + filmDirector +
                ", yearRelease=" + yearRelease +
                ", genres=" + genres +
                ", imdbRating=" + imdbRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return imdbRating == film.imdbRating && Objects.equals(name, film.name) && Objects.equals(filmDirector, film.filmDirector) && Objects.equals(yearRelease, film.yearRelease) && Objects.equals(genres, film.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, filmDirector, yearRelease, genres, imdbRating);
    }
}

package org.example.domain.Data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Film {
    @JsonProperty("name")
    private String name;
    @JsonProperty("filmDirector")

    private FilmDirector filmDirector;
    @JsonProperty("dateRelease")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private LocalDate dateRelease;
    @JsonProperty("genres")
    private List<Genre> genres;
    @JsonProperty("imdbRating")
    private float imdbRating;



    public Film(String name, FilmDirector filmDirector, LocalDate dateRelease, List<Genre> genres, float imdbRating) {
        this.name = name;
        this.filmDirector = filmDirector;
        this.dateRelease = dateRelease;
        this.genres = genres;
        this.imdbRating = imdbRating;
    }

    public Film() {
    }

    public String getName() {
        return name;
    }

    public FilmDirector getFilmDirector() {
        return filmDirector;
    }

    public LocalDate getDate() {
        return dateRelease;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public float getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(float imdbRating) {
        this.imdbRating = imdbRating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", filmDirector=" + filmDirector +
                ", date=" + dateRelease +
                ", genres=" + genres +
                ", imdbRating=" + imdbRating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return imdbRating == film.imdbRating && Objects.equals(name, film.name) && Objects.equals(filmDirector, film.filmDirector) && Objects.equals(dateRelease, film.dateRelease) && Objects.equals(genres, film.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, filmDirector, dateRelease, genres, imdbRating);
    }
}

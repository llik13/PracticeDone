package org.example.domain;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.domain.Data.Film;

import java.time.LocalDate;
import java.util.*;

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

    @Override
    public void printTable() {
        System.out.println(" ");
        System.out.printf("%-25s | %-25s | %-12s | %-8s%n", "name", "producer", "date release", "rating imdb");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < films.size(); i++) {
            System.out.printf("%-25s | %-25s | %-12s | %-8s%n", films.get(i).getName(), films.get(i).getFilmDirector().getFirsName() + " " + films.get(i).getFilmDirector().getSurName(), films.get(i).getDate(), films.get(i).getImdbRating());
            System.out.println("-----------------------------------------------------------------------------------------");
        }
    }

    @Override
    public void sortByName() {
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    public void sortByRelease() {
        Collections.sort(films, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }
}
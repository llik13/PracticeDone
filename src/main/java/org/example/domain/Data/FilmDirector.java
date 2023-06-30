package org.example.domain.Data;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class FilmDirector {
    @JsonProperty("firstName")
    private String firsName;
    @JsonProperty("surName")
    private String surName;
    @JsonProperty("birthDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private LocalDate birthDate;
    /* @JsonProperty("filmList")
    @JsonIgnore
    private List<Film> filmList;
    */


    public FilmDirector(String firsName, String surName, LocalDate birthDate) {
        this.firsName = firsName;
        this.surName = surName;
        this.birthDate = birthDate;
        //filmList = new ArrayList<Film>();
    }

    public FilmDirector() {
    }

   /* public void createFilms(Film film){
        filmList.add(film);
    }
    */

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

    /*\public List<Film> getFilm() {
        return filmList;
    }

    public void setFilm(List<Film> film) {
        this.filmList = film;
    }

     */

   /* public List<Film> getFilmList() {
        return filmList;
    }

    */

    /*public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }
     */
}
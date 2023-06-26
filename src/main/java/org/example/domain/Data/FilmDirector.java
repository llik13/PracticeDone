package org.example.domain.Data;

import java.time.LocalDate;
import java.util.List;

public record FilmDirector(String name, String surName, LocalDate birthDate, List<Film> film) {
}
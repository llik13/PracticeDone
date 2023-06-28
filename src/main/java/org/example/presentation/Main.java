package org.example.presentation;

import org.example.domain.*;
import org.example.domain.Data.Film;
import org.example.domain.Data.FilmDirector;
import org.example.domain.Data.Genre;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        AppFilmRepository appFilmRepository = new AppFilmRepository();
        Genre genre = Genre.FANTASY;

        while (true){
            switch (command.toLowerCase()){
                case "add":
                    System.out.print("Enter name of film: ");
                    String name1 = sc.nextLine();

                    System.out.print("Enter firstname film director: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter surname film director: ");
                    String surName = sc.nextLine();
                    System.out.print("Enter year birthday of film director: ");
                    int year1 = sc.nextInt();
                    System.out.print("Enter month birthday of film director: ");
                    int month1 = sc.nextInt();
                    System.out.print("Enter day birthday of film director: ");
                    int day1 = sc.nextInt();
                    LocalDate birthdayDirector = LocalDate.of(year1, month1, day1);
                    FilmDirector filmDirector = new FilmDirector(firstName, surName, birthdayDirector);

                    System.out.print("Enter year date release of film: ");
                    int year2 = sc.nextInt();
                    System.out.print("Enter month release of film: ");
                    int month2 = sc.nextInt();
                    System.out.print("Enter day release of film: ");
                    int day2 = sc.nextInt();
                    LocalDate dateRelease1 = LocalDate.of(year2, month2, day2);

                    List<Genre> genreList = new ArrayList<>();
                    while (true){
                        System.out.print("Enter genre of films or write exit: ");
                        String filmGenre = sc.nextLine();
                        if (filmGenre.equals("exit".toLowerCase())){
                            break;
                        }
                        genre = genre.addGenre(filmGenre);
                        if (genre == null){
                            System.out.println("Enter correct ");
                        }
                        genreList.add(genre);

                    }
                    System.out.print("Enter rating of film");
                    float rating1 = sc.nextFloat();

                    Film film = new Film(name1, filmDirector, dateRelease1, genreList, rating1);
                    appFilmRepository.addFilm(film);
                    break;
                case "remove":
                    System.out.print("Enter name of film: ");
                    String name2 = sc.nextLine();

                    System.out.print("Enter year date release of film: ");
                    int year3 = sc.nextInt();
                    System.out.print("Enter month release of film: ");
                    int month3 = sc.nextInt();
                    System.out.print("Enter day release of film: ");
                    int day3 = sc.nextInt();
                    LocalDate dateRelease2 = LocalDate.of(year3, month3, day3);

                    appFilmRepository.removeFilm(name2, dateRelease2);
                    break;
                case "search":
                    System.out.print("Enter name of film: ");
                    String name3 = sc.nextLine();

                    System.out.print("Enter year date release of film: ");
                    int year4 = sc.nextInt();
                    System.out.print("Enter month release of film: ");
                    int month4 = sc.nextInt();
                    System.out.print("Enter day release of film: ");
                    int day4 = sc.nextInt();
                    LocalDate dateRelease3 = LocalDate.of(year4, month4, day4);

                    appFilmRepository.searchByNameYear(name3, dateRelease3);
                case "edit rating":
                    System.out.print("Enter rating new of film: ");
                    float rating2 = sc.nextFloat();

                    System.out.print("Enter name of film: ");
                    String name4 = sc.nextLine();

                    System.out.print("Enter year date release of film: ");
                    int year5 = sc.nextInt();
                    System.out.print("Enter month release of film: ");
                    int month5 = sc.nextInt();
                    System.out.print("Enter day release of film: ");
                    int day5 = sc.nextInt();
                    LocalDate dateRelease4 = LocalDate.of(year5, month5, day5);

                    Film film2 = appFilmRepository.searchByNameYear(name4, dateRelease4);

                    appFilmRepository.editRating(film2, rating2);

            }
        }

    }
}
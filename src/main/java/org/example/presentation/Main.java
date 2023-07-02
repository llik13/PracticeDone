package org.example.presentation;

import org.example.domain.*;
import org.example.domain.Data.Film;
import org.example.domain.Data.FilmDirector;
import org.example.domain.Data.Genre;
import org.example.domain.Data.GsonConverter;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        AppFilmRepository appFilmRepository = new AppFilmRepository();
        Genre genre = Genre.ANIMATED;
        GsonConverter gsonConverter = new GsonConverter();
        appFilmRepository = GsonConverter.deserialize(appFilmRepository);


        while (true){
            String command = sc.nextLine();
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
                    sc.nextLine();
                    LocalDate dateRelease1 = LocalDate.of(year2, month2, day2);

                    List<Genre> genreList = new ArrayList<>();
                    System.out.println("Genres - noir, anime, adventure, musical, thriller," +
                            " animated, romance, drama, comedy, western, historical," +
                            " horror, fantasy");
                    while (true){
                        System.out.print("Enter genre of films or write exit: ");
                        String filmGenres = sc.nextLine();
                        if (filmGenres.equals("exit".toLowerCase())){
                            break;
                        }
                        genre = genre.addGenre(filmGenres);
                        while (genre == null){
                            genre = Genre.ANIMATED;
                            System.out.print("Enter correct or exit: ");
                            filmGenres = sc.nextLine();
                            genre = genre.addGenre(filmGenres);
                            if (filmGenres.equals("exit".toLowerCase())){
                                break;
                            }
                        }
                        if (genreList.contains(genre)){
                            continue;
                        }
                        genreList.add(genre);

                    }
                    System.out.print("Enter rating of film: ");
                    float rating1 = sc.nextFloat();
                    sc.nextLine();

                    Film film = new Film(name1, filmDirector, dateRelease1, genreList, rating1);
                    appFilmRepository.addFilm(film);
                    //filmDirector.createFilms(film);
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
                    break;
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
                    break;
                case "print":
                    assert appFilmRepository != null;
                    appFilmRepository.printTable();
                    break;
                case "sort by name":
                    appFilmRepository.sortByName();
                    break;
                case "sort by data":
                    appFilmRepository.sortByRelease();
                    break;
                case "help":
                    System.out.println("Exciting commands: \n print \n sort by name \n sort by name \n add \n remove \n search \n edit rating \n exit \n help");
                    break;
                case "exit":
                    gsonConverter.serialize(appFilmRepository);
                    return;
            }
        }
    }
}
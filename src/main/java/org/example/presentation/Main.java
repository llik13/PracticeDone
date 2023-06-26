package org.example.presentation;

import org.example.domain.*;
import org.example.domain.Data.FilmDirector;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        AppFilmRepository appFilmRepository = new AppFilmRepository();

        while (true){
            switch (command.toLowerCase()){
                case "add":
                    System.out.print("Enter name of film: ");
                    String name = sc.nextLine();

                    System.out.print("Enter first name film director: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter sur name film director: ");
                    String surName = sc.nextLine();
                    System.out.print("Enter year birthday of film director: ");
                    int year1 = sc.nextInt();
                    System.out.print("Enter month birthday of film director: ");
                    int month1 = sc.nextInt();
                    System.out.print("Enter day birthday of film director: ");
                    int day1 = sc.nextInt();
                    LocalDate birthdayDirector = LocalDate.of(year1, month1, day1);
                    FilmDirector filmDirector = new FilmDirector(firstName, surName, birthdayDirector);

                    System.out.print("Enter year date release of film director: ");
                    int year2 = sc.nextInt();
                    System.out.print("Enter month release of film director: ");
                    int month2 = sc.nextInt();
                    System.out.print("Enter day release of film director: ");
                    int day2 = sc.nextInt();
                    LocalDate dateRelease = LocalDate.of(year2, month2, day2);

                    System.out.print("Enter  of film");
                    String  = sc.nextLine();
                    System.out.print("Enter name of film");
                    String name = sc.nextLine();
                    System.out.print("Enter name of film");
                    String name = sc.nextLine();

                    appFilmRepository.addFilm();
            }
        }

    }
}
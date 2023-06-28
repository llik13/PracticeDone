package org.example.domain.Data;

public enum Genre {
    ROMANCE,
    HORROR,
    FANTASY,
    HISTORICAL,
    DRAMA,
    COMEDY,
    ANIMATED,
    NOIR,
    THRILLER,
    WESTERN,
    MUSICAL,
    ADVENTURE,
    ANIME;
    public Genre addGenre(String genre){
        switch (genre){
            case "Noir" ->
            {
                return NOIR;
            }
            case "Anime" ->
            {
                return ANIME;
            }
            case "Adventure" ->
            {
                return ADVENTURE;
            }
            case "Musical" ->
            {
                return MUSICAL;
            }
            case "Thriller" ->
            {
                return THRILLER;
            }
            case "Animated" ->
            {
                return ANIMATED;
            }
            case "Romance" ->
            {
                return ROMANCE;
            }
            case "Drama" ->
            {
                return DRAMA;
            }
            case "Comedy" ->
            {
                return COMEDY;
            }
            case "Western" ->
            {
                return WESTERN;
            }
            case "Historical" ->
            {
                return HISTORICAL;
            }
            case "Horror" ->
            {
                return HORROR;
            }
            case "Fantasy" ->
            {
                return FANTASY;
            }
        }
        return null;
    }
}

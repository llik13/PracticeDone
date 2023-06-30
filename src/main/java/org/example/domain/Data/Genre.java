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
        switch (genre.toLowerCase()){
            case "noir" ->
            {
                return NOIR;
            }
            case "anime" ->
            {
                return ANIME;
            }
            case "adventure" ->
            {
                return ADVENTURE;
            }
            case "musical" ->
            {
                return MUSICAL;
            }
            case "thriller" ->
            {
                return THRILLER;
            }
            case "animated" ->
            {
                return ANIMATED;
            }
            case "romance" ->
            {
                return ROMANCE;
            }
            case "drama" ->
            {
                return DRAMA;
            }
            case "comedy" ->
            {
                return COMEDY;
            }
            case "western" ->
            {
                return WESTERN;
            }
            case "historical" ->
            {
                return HISTORICAL;
            }
            case "horror" ->
            {
                return HORROR;
            }
            case "fantasy" ->
            {
                return FANTASY;
            }
        }
        return null;
    }
}

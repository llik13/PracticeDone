package org.example.domain.Data;

public interface JsonConverter {
    void toGson(Film film);

    void fromGson();
}
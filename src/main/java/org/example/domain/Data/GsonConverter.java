package org.example.domain.Data;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.example.domain.AppFilmRepository;

import java.io.IOException;
import java.nio.file.Paths;

public class GsonConverter{


    public static void serialize(AppFilmRepository appFilmRepository) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        String json = objectMapper.writeValueAsString(appFilmRepository);
        objectMapper.writeValue(Paths.get("films.json").toFile(), appFilmRepository);
    }

    public static void deserialize(AppFilmRepository appFilmRepository) {
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.findAndRegisterModules();

            // convert a JSON string to a Book object
            appFilmRepository = mapper.readValue(Paths.get("film.json").toFile(), AppFilmRepository.class);

            // print book
            System.out.println(appFilmRepository.getFilms() + " " + appFilmRepository.getFilms().get(0).getFilmDirector().toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

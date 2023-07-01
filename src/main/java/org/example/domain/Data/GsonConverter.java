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
        objectMapper.writeValue(Paths.get("film.json").toFile(), appFilmRepository);
    }

    public static AppFilmRepository deserialize(AppFilmRepository appFilmRepository) {
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.findAndRegisterModules();

            // convert a JSON string to a Book object
            return mapper.readValue(Paths.get("film.json").toFile(), AppFilmRepository.class);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}

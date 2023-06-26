package org.example.domain.Data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GsonConverter implements JsonConverter{
    ObjectMapper objectMapper = new ObjectMapper();

    public void toGson(Film film) {
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            List<Film> listOfStudents = new ArrayList<>();
            listOfStudents.add(film);
            listOfStudents.add(film);
            objectMapper.writeValue(new File("/home/negon/IdeaProjects/Practice/src/main/java/org/example/domain"), listOfStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void fromGson(){}
}

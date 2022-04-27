package models.config;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@NoArgsConstructor
public class Environment {
    private App app;
    private User user;
    @JsonAnyGetter
    private HashMap<String, Object> testData;
    private DataBase db;
}

package ua.ithillel.lectures.lecture18.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ua.ithillel.lectures.lecture18.xml.model.Book;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JSONParser {

    public void parse(String path) {
        try (Reader reader = new FileReader(path)) {
            Type listType = new TypeToken<ArrayList<Book>>() {}.getType();
            List<Book> books = new Gson().fromJson(reader, listType);
            books.forEach(System.out::println);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

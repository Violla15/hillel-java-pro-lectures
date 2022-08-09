package ua.ithillel.lectures.lecture18;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import ua.ithillel.lectures.lecture18.json.JSONParser;
import ua.ithillel.lectures.lecture18.nio.FileReader;
import ua.ithillel.lectures.lecture18.xml.DOMParser;
import ua.ithillel.lectures.lecture18.xml.SAXParser;
import ua.ithillel.lectures.lecture18.xml.mapper.BookMapper;
import ua.ithillel.lectures.lecture18.xml.mapper.Mapper;
import ua.ithillel.lectures.lecture18.xml.model.Book;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public class Lecture18 {

    public static void main(String[] args) {
        // nio();
        // domParser();
        //saxParser();
        json();
    }

    private static void json() {
        JSONParser jsonParser = new JSONParser();
        jsonParser.parse("src/main/java/ua/ithillel/lectures/lecture18/json/books.json");
    }

    private static void saxParser() {
        SAXParser saxParser = new SAXParser();
        try {
            saxParser.parseDocument("src/main/java/ua/ithillel/lectures/lecture18/xml/books.xml");
        } catch (ParserConfigurationException | SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void domParser() {
        DOMParser domParser = new DOMParser();
        try {
            Document document = domParser.parseDocument("src/main/java/ua/ithillel/lectures/lecture18/xml/books.xml");
            NodeList booksNodeList = document.getElementsByTagName("book");

            Mapper<Book> bookMapper = new BookMapper();
            List<Book> books = bookMapper.getAll(booksNodeList);

            books.forEach(System.out::println);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

    private static void nio() {
        FileReader fileReader = new FileReader();
        try {
            fileReader.read("src/main/java/ua/ithillel/lectures/lecture18/nio/text.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

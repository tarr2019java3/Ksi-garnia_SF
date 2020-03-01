package pl.sda.ksiegarnia;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Author author = new Author("Jan", "Kowalski");
        Author author1 = new Author("Piotr", "Nowak");
        Author author2 = new Author("Waclaw", "Kwiatkowski");

        Category category = new Category("Bajki");
        Category category1 = new Category("Horror");
        Category category2 = new Category("Sci-Fi");


        Book book = new Book("Widelec w Nybylandii", author1, category);
        Book book1 = new Book("Widelec w dupie", author, category1);
        Book book2 = new Book("Widelec w kosmosie", author2, category2);


        List<Book> listaKsiazek = new ArrayList<>();
        listaKsiazek.add(book);
        listaKsiazek.add(book1);
        listaKsiazek.add(book2);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("listaksiazek.json"), listaKsiazek);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

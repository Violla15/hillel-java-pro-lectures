package ua.ithillel.randompicker;

import java.util.List;
import java.util.Random;

public class RandomPicker {

    public static void main(String[] args) {
        List<String> students = List.of(
                "Krushniak Oleksandr",
                "Valeriia Kosohova",
                "Violetta Churikova",
                "Yegor Artsev",
                "Анастасія Лавнюженкова",
                "Валерий Лабеев",
                "Олександр Красножон",
                "Петро Коротушак",
                "Illia Karmazinskyi",
                "Andrii Kontsevoda",
                "Вячеслав Омельчук",
                "Bogdan Tokarenko",
                "Алексей Мушкамбарян",
                "Володимир Семирозум",
                "Valerii Dvoretskyi");

        System.out.println(students.get(new Random().nextInt(students.size())));
    }

}

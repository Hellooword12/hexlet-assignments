package exercise;

import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homes, int n) {
        return homes.stream()
                .sorted() // Теперь используем естественный порядок сортировки
                .limit(n)
                .map(Home::toString)
                .collect(Collectors.toList());
    }
}
// END

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        System.out.println("Введите адрес: ");
        Scanner in = new Scanner(System.in);
        String html = in.next();
        String url = html;
        Map<String, Integer> counterMapWords = new HashMap<>();
        counterMapWords = new Parser().getTextPage(url);
        for (String word : counterMapWords.keySet()) {
            System.out.println(word + " - " + counterMapWords.get(word));
        }
    }
}

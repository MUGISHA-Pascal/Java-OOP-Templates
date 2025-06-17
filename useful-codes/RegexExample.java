import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Contact: user123@gmail.com";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Found email: " + matcher.group());
        }
    }
}
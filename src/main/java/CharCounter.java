import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    private Map<String, String> cache = new HashMap<>();
    private InputValidator validator = new InputValidator();

    public String getInputCount(String input) {
        validator.validateString(input);
        if (cache.containsKey(input)) {
            return "cashed char counter";
        }
        return countChars(input);
    }

    private String countChars(String input) {
        // do logic
        return "not cashed char counter";
    }
}

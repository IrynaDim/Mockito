public class InputValidator {
    public void validateString(String input) {
        if (input == null || input.isEmpty()) {
            throw new RuntimeException("Input can not be empty or null");
        }
    }
}

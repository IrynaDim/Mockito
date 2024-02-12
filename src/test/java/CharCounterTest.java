
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CharCounterTest {

    @InjectMocks
    private CharCounter charCounterMock;

    @Mock
    private HashMap<String, String> cache;

    @Mock
    private InputValidator validator;

    private final String input = null;

    @Test
    public void count_should_return_cashed_char_counter() {
        System.out.println("Test was called");

        doNothing().when(validator).validateString(input);
        when(cache.containsKey(input)).thenReturn(true);

        assertEquals("cashed char counter", charCounterMock.getInputCount(input));
    }

    @Test
    public void count_should_return_not_cashed_char_counter() {
        doNothing().when(validator).validateString(input);
        when(cache.containsKey(input)).thenReturn(false);
        assertEquals("not cashed char counter", charCounterMock.getInputCount(input));
    }
}
package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedSequenceTest {

    @Test
    void testToString() {
        CharSequence text = new ReversedSequence("abcdef");
        assertEquals("fedcba", text.toString());
    }

    @Test
    void testCharAt() {
        CharSequence text = new ReversedSequence("abcdef");
        assertEquals('e', text.charAt(1));
        assertEquals('a', text.charAt(5));
    }

    @Test
    void testLength() {
        CharSequence text = new ReversedSequence("abcdef");
        assertEquals(6, text.length());

        text = new ReversedSequence("");
        assertEquals(0, text.length());
    }

    @Test
    void testSubSequence() {
        CharSequence text = new ReversedSequence("abcdef");
        CharSequence sub = text.subSequence(1, 4);
        assertEquals("edc", sub.toString());
    }

    @Test
    void testEmptyString() {
        CharSequence text = new ReversedSequence("");
        assertEquals("", text.toString());
        assertEquals(0, text.length());
    }

    @Test
    void testSingleChar() {
        CharSequence text = new ReversedSequence("a");
        assertEquals("a", text.toString());
        assertEquals('a', text.charAt(0));
        assertEquals(1, text.length());
    }
}

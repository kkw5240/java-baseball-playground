package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    @DisplayName("replace Test : abc -> adc")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split & contains Test : \"1,2\" -> [\"1\", \"2\"]")
    void contains() {
        String[] actual = "1,2".split(",");

        assertThat(actual).contains("1", "2");
        assertThat(actual).containsExactly("1", "2");
    }

    @Test
    @DisplayName("substring Test : (1,2) -> 1,2")
    void substring() {
        String actual = "(1,2)".substring(1, 4);

        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt Test : abc -> b")
    void charAt() {
        String given = "abc";

        assertThat(given.charAt(1)).isEqualTo('b');

        assertThatThrownBy(() -> {
            given.charAt(4);

        }).isInstanceOf(
                StringIndexOutOfBoundsException.class
        );
    }
}

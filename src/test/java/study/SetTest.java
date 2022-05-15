package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("요구사항 1 : size")
    void size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @DisplayName("요구사항 2 : contains")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void contains(Integer number) {
        assertThat(numbers.contains(number)).isTrue();
    }

    @DisplayName("요구사항 3 : contains 결과 값 true, false 모두 테스트")
    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void contains2(Integer number, boolean result) {
        assertThat(numbers.contains(number)).isEqualTo(result);
    }
}

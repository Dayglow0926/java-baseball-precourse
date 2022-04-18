package study;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("요구사항 1 : set 사이즈 테스트")
    void 사이즈_테스트(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    @DisplayName("요구사항 2 : set 값 확인 코드 중복 제거")
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    void 값_확인_코드_중복_제거(int number){
        assertThat(numbers.contains(number)).isTrue();
    }

    @DisplayName("요구사항 3 : 변화되는_값_확인")
    @ParameterizedTest
    @CsvSource(value = { "1:true", "2:true", "3:true", "4:false", "5:false" }, delimiter = ':')
    void 변화되는_값_확인(int number, boolean check){
        assertThat(numbers.contains(number)).isEqualTo(check);
    }

}

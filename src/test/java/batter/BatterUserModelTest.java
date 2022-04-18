package batter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class BatterUserModelTest {

    @ParameterizedTest
    @ValueSource(strings = { "1234", "12345", "123545" })
    void 입력_길이_테스트_에러(String numbers){

        assertThatThrownBy(() -> {
            BatterUserModel batter = new BatterUserModel(numbers);
        }).isInstanceOf(IllegalArgumentException.class);

    }

    @ParameterizedTest
    @ValueSource(strings = { "가나다라마바사", "abcdefg", "12ab3545","가나1234" })
    void 입력_타입_테스트_에러(String numbers){
        assertThatThrownBy(() -> {
            BatterUserModel batter = new BatterUserModel(numbers);
        }).isInstanceOf(IllegalArgumentException.class);
    }

}
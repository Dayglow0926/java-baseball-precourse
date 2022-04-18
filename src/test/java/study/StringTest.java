package study;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class StringTest {


    @Test
    @DisplayName("요구사항 1 : 문자나누기 테스트")
    void splitTest(){
        String [] str = null;

        str = "1,2".split(",");
        assertThat(str).contains("1","2");
        assertThat(str).containsExactly("1","2");
        //assertThat(str).containsExactly("2","1"); 실패

        str = "1".split(",");
        assertThat(str).contains("1");
        assertThat(str).containsExactly("1");
    }

    @Test
    @DisplayName("요구사항 2 : 괄호제거 테스트")
    void 괄호제거_테스트(){
        String str = "(1,2)";
        str = str.substring(1,str.length()-1);

        assertThat(str).contains("1,2");
    }

    //요구사항 3
    @Test
    @DisplayName("요구사항 3 : 문자가져오기 테스트")
    void 문자가져오기_테스트(){
        String str = "abc";
        int index = 4;

        assertThatThrownBy(() -> {
            str.charAt(index);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 4");
    }
}

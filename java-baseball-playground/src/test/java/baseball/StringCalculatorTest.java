package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    OutputStream out;

    @BeforeEach
    void init(){
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String input = "2 + 3 * 4 / 2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    @Test
    @DisplayName("문자열 계산기 테스트")
    void test1(){
        StringCalculator calculator = new StringCalculator();
        calculator.printResult();
        assertThat(out.toString()).isEqualTo("10\n");
    }
}
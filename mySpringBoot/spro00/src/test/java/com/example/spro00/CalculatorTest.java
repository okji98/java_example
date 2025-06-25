package com.example.spro00;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void shouldThrowExceptionWhenDividingByZero(){
        Calculator calc = new Calculator();
        int a = 10;
        int b = 0;

        // When & Then: 예외 발생 검증
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> calc.divide(a, b),
                "Division by zero should throw ArithmeticException"
        );

        // Then: 예외 메시지 검증
        assertEquals("Division by zero", exception.getMessage());
    }
}

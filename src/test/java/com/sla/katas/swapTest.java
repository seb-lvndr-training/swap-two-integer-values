package com.sla.katas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SwapTwoIntegerValuesTest {

    @Test
    void should_swap_integer_values() {
        // Given
        int a = 55;
        int b = 99;

        // When
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        // Then
        Assertions.assertEquals(99, a);
        Assertions.assertEquals(55, b);
    }
}

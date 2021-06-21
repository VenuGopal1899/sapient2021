package com.sapient.core;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.sapient.core.MessageService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageServiceTest {

    @DisplayName("Test MessageService.get()")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", MessageService.get());
    }

}

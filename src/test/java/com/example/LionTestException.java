package com.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTestException {
    @Mock
    Feline feline;

    @Test
    public void checkLionSexError() {
        assertThrows(Exception.class, () -> new Lion("Никто", feline));
    }
}
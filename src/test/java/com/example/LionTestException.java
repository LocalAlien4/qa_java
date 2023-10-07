package com.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTestException {
    @Mock
    Feline feline;

    @Test
    public void checkLionSexError() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Никто", feline));
        String expectedText = "Используйте допустимые значения пола животного - самец или самка";
        String actualText = exception.getMessage();
        assertTrue("Некорректное сообщение об ошибке ",actualText.contains(expectedText));
    }
}
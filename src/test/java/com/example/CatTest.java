package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    Feline feline;
    public Cat cat;

    @Before
    public void setUp() throws Exception {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundMeow() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void checkThatFoodIsMeat() throws Exception {
       Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
       assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());
    }
}
package com.example;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {
    @Mock
    Feline feline= new Feline();

    @Test
    public void eatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
    }

    @Test
    public void getKittens() {
    }

    @Test
    public void testGetKittens() {
    }
}
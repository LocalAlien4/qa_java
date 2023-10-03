package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)

public class FelineTest {
    @Spy
    Feline feline = new Feline();

    @Test
    public void checkThatFelineEatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void checkThatFamilyFeline() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void checkKittensNumber() {
        feline.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens(1);
    }

    @Test
    public void checkKittensCount() {
        feline.getKittens(3);
        assertEquals(1, feline.getKittens());
    }
}
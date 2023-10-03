package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;
    private final List eat;
    private final boolean hasMane;

    public LionTest(String sex, List eat, boolean hasMane) {
        this.sex = sex;
        this.eat = eat;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] lionInfo(){
        return new Object[][]{
                {"Самец", List.of("Животные", "Птицы", "Рыба"), true},
                {"Самка", List.of("Животные", "Птицы", "Рыба"), false}
        };
    }
    @Before
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline feline;

    @Test
    public void lionSexParameters() throws Exception {
      Lion lion = new Lion(sex, feline);
    }

    @Test
    public void checkThatGetKittens() throws Exception {
        Lion lion= new Lion(sex,feline);
        lion.getKittens();
        Mockito.verify(feline,Mockito.times(1)).getKittens();
    }

    @Test
    public void checkWhenLionHasMane() throws Exception {
        Lion lion= new Lion(sex,feline);
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        Lion lion= new Lion(sex,feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(eat, lion.getFood());
    }
}
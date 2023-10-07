package com.example;

import java.util.List;

public interface IFeline extends Predator {
    @Override
    List<String> eatMeat() throws Exception;

    String getFamily();

    int getKittens();

    int getKittens(int kittensCount);

    List<String> getFood(String animalKind) throws Exception;
}

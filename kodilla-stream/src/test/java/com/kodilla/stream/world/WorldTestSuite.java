package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent australia = new Continent("Australia");

        Country poland = new Country("Poland", new BigDecimal("38265000"));
        Country sweden = new Country("Sweden", new BigDecimal("10327789"));
        Country germany = new Country("Germany", new BigDecimal("83190556"));
        Country china = new Country("China", new BigDecimal("1411778724"));
        Country russia = new Country("Russia", new BigDecimal("146171015"));
        Country india = new Country("India", new BigDecimal("1352642280"));
        Country egypt = new Country("Egypt", new BigDecimal("101478581"));
        Country algeria = new Country("Algeria", new BigDecimal("44700000"));
        Country congo = new Country("Congo", new BigDecimal("105044646"));
        Country australiaCountry = new Country("Australia", new BigDecimal("25853000"));

        europe.add(poland);
        europe.add(sweden);
        europe.add(germany);
        asia.add(china);
        asia.add(russia);
        asia.add(india);
        africa.add(egypt);
        africa.add(algeria);
        africa.add(congo);
        australia.add(australiaCountry);

        world.add(europe);
        world.add(asia);
        world.add(africa);
        world.add(australia);

        //When
        BigDecimal population = world.getPeopleQuantity();
        BigDecimal expectedPopulation = new BigDecimal("3319451591");

        //Then
        assertEquals(expectedPopulation, population);
    }
}

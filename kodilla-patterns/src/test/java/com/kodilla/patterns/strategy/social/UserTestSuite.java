package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millennial = new Millennials("Millennial");
        User genY = new YGeneration("GenY");
        User genZ = new ZGeneration("GenZ");

        //When
        String millennialPost = millennial.sharePost();
        System.out.println("Millennial is posting on " + millennialPost);
        String genYPost = genY.sharePost();
        System.out.println("GenY is posting on " + genYPost);
        String genZPost = genZ.sharePost();
        System.out.println("GenZ is posting on " + genZPost);

        //Then
        assertEquals("Facebook", millennialPost);
        assertEquals("Twitter", genYPost);
        assertEquals("Snapchat", genZPost);

    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User marta = new Millennials("Marta");

        //When
        String martaPost = marta.sharePost();
        System.out.println("Marta is posting on " + martaPost);
        marta.setSocialPublisher(new TwitterPublisher());
        martaPost = marta.sharePost();
        System.out.println("Marta is now posting on " + martaPost);

        //Then
        assertEquals("Twitter", martaPost);

    }
}

package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    private StatisticsCalculator statisticsCalculator;

    private List<String> generateListOfUsers (int numberOfUsers) {
        List<String> listOfUsers = new ArrayList<>();
        for (int n = 1; n <= numberOfUsers; n++) {
            listOfUsers.add("User" + n);
        }
        return listOfUsers;
    }

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void beforeEveryTest() {
        statisticsCalculator = new StatisticsCalculator();
    }

    @Nested
    @DisplayName("Test posts")
    class testPosts {

        @DisplayName("Test statistics when number of posts is zero")
        @Test
        void testCalculateAdvStatisticsZeroPosts () {
            //Given
            List<String> listOfUsers = generateListOfUsers(5);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            //When
            statisticsCalculator.calculateAdvStatistics(statisticsMock);
            //Then
            assertEquals(5, statisticsCalculator.getNumberOfUsers());
            assertEquals(0, statisticsCalculator.getNumberOfPosts());
            assertEquals(0, statisticsCalculator.getNumberOfComments());
            assertEquals(0.0, statisticsCalculator.getAveragePostsPerUser());
            assertEquals(0.0, statisticsCalculator.getAverageCommentsPerUser());
            assertEquals(0.0, statisticsCalculator.getAverageCommentsPerPost());
        }

        @DisplayName("Test statistics when number of posts is one thousand")
        @Test
        void testCalculateAdvStatisticsThousandPosts () {
            //Given
            List<String> listOfUsers = generateListOfUsers(100);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(1000);
            when(statisticsMock.commentsCount()).thenReturn(100);
            //When
            statisticsCalculator.calculateAdvStatistics(statisticsMock);
            // Then
            assertEquals(100, statisticsCalculator.getNumberOfUsers());
            assertEquals(1000, statisticsCalculator.getNumberOfPosts());
            assertEquals(100, statisticsCalculator.getNumberOfComments());
            assertEquals(10.0, statisticsCalculator.getAveragePostsPerUser());
            assertEquals(1.0, statisticsCalculator.getAverageCommentsPerUser());
            assertEquals(0.1, statisticsCalculator.getAverageCommentsPerPost());
        }
    }

    @Nested
    @DisplayName("Test comments")
    class testComments {

        @DisplayName("Test statistics when number of comments is zero")
        @Test
        void testCalculateAdvStatisticsZeroComments() {
            //Given
            List<String> listOfUsers = generateListOfUsers(100);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.commentsCount()).thenReturn(0);
            //When
            statisticsCalculator.calculateAdvStatistics(statisticsMock);
            //Then
            assertEquals(100, statisticsCalculator.getNumberOfUsers());
            assertEquals(100, statisticsCalculator.getNumberOfPosts());
            assertEquals(0, statisticsCalculator.getNumberOfComments());
            assertEquals(1.0, statisticsCalculator.getAveragePostsPerUser());
            assertEquals(0.0, statisticsCalculator.getAverageCommentsPerUser());
            assertEquals(0.0, statisticsCalculator.getAverageCommentsPerPost());
        }

        @DisplayName("Test statistics when number of comments is smaller than the number of posts")
        @Test
        void testCalculateAdvStatisticsLessCommentsThanPosts() {
            //Given
            List<String> listOfUsers = generateListOfUsers(100);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.commentsCount()).thenReturn(10);
            //When
            statisticsCalculator.calculateAdvStatistics(statisticsMock);
            //Then
            assertEquals(100, statisticsCalculator.getNumberOfUsers());
            assertEquals(100, statisticsCalculator.getNumberOfPosts());
            assertEquals(10, statisticsCalculator.getNumberOfComments());
            assertEquals(1.0, statisticsCalculator.getAveragePostsPerUser());
            assertEquals(0.1, statisticsCalculator.getAverageCommentsPerUser());
            assertEquals(0.1, statisticsCalculator.getAverageCommentsPerPost());
        }

        @DisplayName("Test statistics when number of comments is greater than the number of posts")
        @Test
        void testCalculateAdvStatisticsMoreCommentsThanPosts() {
            //Given
            List<String> listOfUsers = generateListOfUsers(100);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(10);
            when(statisticsMock.commentsCount()).thenReturn(100);
            //When
            statisticsCalculator.calculateAdvStatistics(statisticsMock);
            //Then
            assertEquals(100, statisticsCalculator.getNumberOfUsers());
            assertEquals(10, statisticsCalculator.getNumberOfPosts());
            assertEquals(100, statisticsCalculator.getNumberOfComments());
            assertEquals(0.1, statisticsCalculator.getAveragePostsPerUser());
            assertEquals(1.0, statisticsCalculator.getAverageCommentsPerUser());
            assertEquals(10.0, statisticsCalculator.getAverageCommentsPerPost());
        }
    }

    @Nested
    @DisplayName("Test users")
    class testUsers {

        @DisplayName("Test statistics when number of users is zero")
        @Test
        void testCalculateAdvStatisticsZeroUsers() {
            //Given
            List<String> listOfUsers = generateListOfUsers(0);
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            //When
            statisticsCalculator.calculateAdvStatistics(statisticsMock);
            //Then
            assertEquals(0, statisticsCalculator.getNumberOfUsers());
            assertEquals(0, statisticsCalculator.getNumberOfPosts());
            assertEquals(0, statisticsCalculator.getNumberOfComments());
            assertEquals(0.0, statisticsCalculator.getAveragePostsPerUser());
            assertEquals(0.0, statisticsCalculator.getAverageCommentsPerUser());
            assertEquals(0.0, statisticsCalculator.getAverageCommentsPerPost());
        }

        @DisplayName("Test statistics when number of users is one hundred")
        @Test
        void testCalculateAdvStatisticsHundredUsers() {
            //Given
            List<String> listOfUsers = generateListOfUsers(100);
            StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
            when(statisticsMock.usersNames()).thenReturn(listOfUsers);
            when(statisticsMock.postsCount()).thenReturn(200);
            when(statisticsMock.commentsCount()).thenReturn(100);
            //When
            statisticsCalculator.calculateAdvStatistics(statisticsMock);
            //Then
            assertEquals(100, statisticsCalculator.getNumberOfUsers());
            assertEquals(200, statisticsCalculator.getNumberOfPosts());
            assertEquals(100, statisticsCalculator.getNumberOfComments());
            assertEquals(2.0, statisticsCalculator.getAveragePostsPerUser());
            assertEquals(1.0, statisticsCalculator.getAverageCommentsPerUser());
            assertEquals(0.5, statisticsCalculator.getAverageCommentsPerPost());
        }
    }
}

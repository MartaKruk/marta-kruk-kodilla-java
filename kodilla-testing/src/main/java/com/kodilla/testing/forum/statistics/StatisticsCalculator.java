package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

//    public StatisticsCalculator(int numberOfUsers, int numberOfPosts, int numberOfComments, double averagePostsPerUser, double averageCommentsPerUser, double averageCommentsPerPost) {
//        this.numberOfUsers = numberOfUsers;
//        this.numberOfPosts = numberOfPosts;
//        this.numberOfComments = numberOfComments;
//        this.averagePostsPerUser = averagePostsPerUser;
//        this.averageCommentsPerUser = averageCommentsPerUser;
//        this.averageCommentsPerPost = averageCommentsPerPost;
//    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
            if (numberOfUsers == 0) {
                averagePostsPerUser = 0.0;
                averageCommentsPerUser = 0.0;
            } else {
                averagePostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
                averageCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
            }
            if (numberOfPosts == 0) {
                averageCommentsPerPost = 0.0;
            } else {
                averageCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
            }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + numberOfUsers + "\nNumber of posts: " + numberOfPosts + "\nNumber of comments: " + numberOfComments +
                "\nNumber of posts per user: " + averagePostsPerUser + "\nNumber of comments per user: " + averageCommentsPerUser + "\nNumber of comments per post: " + averageCommentsPerPost);
    }
}

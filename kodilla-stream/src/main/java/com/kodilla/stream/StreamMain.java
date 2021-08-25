package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOfBirth().getYear() <= 2001)
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        mapOfUsers.entrySet().stream()
                .map(entry -> "#" + entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);
    }

}

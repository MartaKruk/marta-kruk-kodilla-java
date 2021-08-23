package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    public List<ForumUser> getUserList() {
        final List<ForumUser> userList = new ArrayList<>();

        userList.add(new ForumUser(1, "ScienceThug", 'M', 2001, 4, 11, 15));
        userList.add(new ForumUser(2, "SecurePopcorn", 'F', 1992, 5, 10, 2));
        userList.add(new ForumUser(3, "IroncladTyphoon", 'M', 1990, 3, 29, 7));
        userList.add(new ForumUser(4, "GuaranteePluto", 'F', 1875, 12, 24, 18));
        userList.add(new ForumUser(5, "EffectiveHades", 'M', 2005, 6, 6, 26));
        userList.add(new ForumUser(6, "BestSkeleton", 'F', 1996, 6, 26, 6));
        userList.add(new ForumUser(7, "BeautifulHunter", 'M', 2000, 8, 25, 12));
        userList.add(new ForumUser(8, "CutbackApollo", 'F', 1885, 11, 19, 20));
        userList.add(new ForumUser(9, "DreadfulZeus", 'M', 1899, 8, 21, 0));

        return new ArrayList<>(userList);
    }
}

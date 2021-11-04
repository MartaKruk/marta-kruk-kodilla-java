package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "Test Name";
    private static final String DESCRIPTION = "Test Description";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);
        taskListDao.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> testTasks = taskListDao.findByListName(name);

        //Then
        assertEquals(1, testTasks.size());

        //CleanUp
        int id = testTasks.get(0).getId();
        taskListDao.deleteById(id);
    }
}

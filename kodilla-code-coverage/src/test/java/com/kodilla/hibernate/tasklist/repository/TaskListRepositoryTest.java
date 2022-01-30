package com.kodilla.hibernate.tasklist.repository;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskListRepositoryTest {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "LISTNAME_Hibernate";
    private static final String DESCRIPTION = "Test: Learn Hibernate";


    @Test
    void testTaskRepositoryFindBylistName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListRepository.findByListName(name);
        for (TaskList task: readTasks
             ) {
            System.out.println(task.getId());
            System.out.println(task.getListName());
        }
        //Then
        Assertions.assertEquals(1, readTasks.size());

        //CleanUp
        for (TaskList task: readTasks
        ) {
            taskListRepository.deleteById((task.getId()));
        }
    }

}
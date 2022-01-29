package com.kodilla.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DbManagerTest {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }
    @Test
    void testSelectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String clearPostsQuery = "TRUNCATE TABLE POSTS";
        String clearUsersQuery = "DELETE FROM USERS WHERE ID > 0";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(clearPostsQuery);
        statement.executeUpdate(clearUsersQuery);

        //add users
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        //check user_id
        sql = "SELECT ID FROM USERS";
        ResultSet userId = statement.executeQuery(sql);
        int counter = 0;
        String firstUserId = "";
        String secondUserId= "";
        while(userId.next()) {
            System.out.println(userId.getString(1));
            if (counter == 0) firstUserId = userId.getString(1);
            if (counter == 1) secondUserId = userId.getString(1);
            counter++;
        }
        //add posts
        String addPosts = "INSERT INTO POSTS(USER_ID, BODY) VALUES ("+firstUserId+", 'First post')";
        statement.executeUpdate(addPosts);
        addPosts = "INSERT INTO POSTS(USER_ID, BODY) VALUES ("+firstUserId+", 'Second post')";
        statement.executeUpdate(addPosts);
        addPosts = "INSERT INTO POSTS(USER_ID, BODY) VALUES ("+secondUserId+", 'First post')";
        statement.executeUpdate(addPosts);
        addPosts = "INSERT INTO POSTS(USER_ID, BODY) VALUES ("+firstUserId+", 'Third post')";
        statement.executeUpdate(addPosts);
        //When
        String sqlQuery = "select u.FIRSTNAME, u.LASTNAME, count(p.USER_ID) from users u join posts p\n" +
                "where u.ID= p.USER_ID\n" +
                "group by p.USER_ID, u.FIRSTNAME, u.LASTNAME \n" +
                "having count(p.USER_ID) > 2\n" +
                "\n";
        statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("u.FIRSTNAME") + ", " +
                    rs.getString("u.LASTNAME"));
            counter++;
        }
        int expected = 1;
        Assertions.assertEquals(expected, counter);

        rs.close();
        statement.close();

    }
}
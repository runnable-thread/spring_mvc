package com.samsung.myspring.sample;

import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.fail;

//@RunWith(SpringJUnit4ClassRunner.class) // junit test 실행
@Log4j
public class JDBCTests {

    static{
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "book_ex" , "book_ex");
            log.info(con);
            } catch (ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }


    }
}

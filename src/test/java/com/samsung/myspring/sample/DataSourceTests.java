package com.samsung.myspring.sample;

import com.samsung.myspring.config.RootConfig;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.Assert.fail;

@RunWith(SpringJUnit4ClassRunner.class) // junit test 실행
@ContextConfiguration(classes = {RootConfig.class})
@Log4j
public class DataSourceTests {

    @Autowired
    @Setter

    private DataSource dataSource;

    @Test
    public void connectionTest(){
        try(Connection con = dataSource.getConnection()){
            log.info(con);
        }catch (Exception e){
            fail(e.getMessage());
        }

    }
}

package com.samsung.myspring.sample;


import com.samsung.myspring.config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class) // junit test 실행
@ContextConfiguration(classes={RootConfig.class}) //필요한 객체들을 스프링 내에 객체로 등록하게 됨
@Log4j //lombok 을 이용해서 기록하는 Logger 변수를 지정. ( src/test/resources/log4j.xml)
public class SampleTests {

    @Autowired
    @Setter
    private Restaurant restaurant;


    @Test
    public void testExist() {
        assertNotNull(restaurant);

        log.info(restaurant);
        log.info("-----------------------------");
        log.info(restaurant.getChef());

    }
}
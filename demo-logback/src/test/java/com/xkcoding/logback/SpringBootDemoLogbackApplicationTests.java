package com.xkcoding.logback;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.MDC;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringBootDemoLogbackApplicationTests {

  @Test
  public void contextLoads() {
    MDC.put("user_id", "daniel");
    log.info("hello 123");
  }

}

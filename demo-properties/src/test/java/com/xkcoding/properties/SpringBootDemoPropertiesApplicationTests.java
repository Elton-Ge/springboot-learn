package com.xkcoding.properties;

import com.xkcoding.properties.property.ApplicationProperty;
import com.xkcoding.properties.property.DeveloperProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoPropertiesApplicationTests {
  @Autowired
  private DeveloperProperty developerProperty;
  @Autowired
  private ApplicationProperty applicationProperty;

  @Test
  public void contextLoads() {
    System.out.println(developerProperty);
    System.out.println(applicationProperty);
  }

}

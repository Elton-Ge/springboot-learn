package com.xkcoding.actuator.config;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "customEndpoint")
public class CustomEndpoint {
  @ReadOperation
  public String custom() {
    return "my endpoint working";
  }
}

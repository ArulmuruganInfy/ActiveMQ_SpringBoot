package com.demo.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class Sender {

  @Autowired
  private JmsTemplate jmsTemplate;

  public void send(String destination, String message) {
    jmsTemplate.convertAndSend(destination, message);
  }
}

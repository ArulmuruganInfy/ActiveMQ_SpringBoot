package com.demo.jms.consumer;

import org.springframework.jms.annotation.JmsListener;

public class Receiver {

  @JmsListener(destination = "${queue.order}")
  public void receive(String message) {
    System.out.println("Message Received: "+message);
  }
}
